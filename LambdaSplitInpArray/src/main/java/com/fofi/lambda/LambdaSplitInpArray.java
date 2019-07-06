package com.fofi.lambda;

import java.util.Arrays;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaSplitInpArray implements RequestHandler<PojoInput, PojoResponse>{
  final int chunkSize = 3;
  
    @Override
	public PojoResponse handleRequest(PojoInput input, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("input: " + input);
		Integer[] arrayToSplit = input.getInputArray();
		logger.log("arrayToSplit: " + arrayToSplit);	
		//List<Integer> newList = new ArrayList<>();
		//input.forEach(x -> newList.add(100 + x));
		
		Integer[][] splittedArrays = splitArray(arrayToSplit, chunkSize);
		logger.log("Output splittedArrays: " + splittedArrays);
		return new PojoResponse(splittedArrays);
	}
    
    private static Integer[][] splitArray(Integer[] arrayToSplit, int chunkSize){
        if(chunkSize<=0){
            return null;  // just in case :)
        }
        // first we have to check if the array can be split in multiple 
        // arrays of equal 'chunk' size
        int rest = arrayToSplit.length % chunkSize;  // if rest>0 then our last array will have less elements than the others 
        // then we check in how many arrays we can split our input array
        int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0); // we may have to add an additional array for the 'rest'
        // now we know how many arrays we need and create our result array
        Integer[][] arrays = new Integer[chunks][];
        // we create our resulting arrays by copying the corresponding 
        // part from the input array. If we have a rest (rest>0), then
        // the last array will have less elements than the others. This 
        // needs to be handled separately, so we iterate 1 times less.
        for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++){
            // this copies 'chunk' times 'chunkSize' elements into a new array
            arrays[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize);
        }
        if(rest > 0){ // only when we have a rest
            // we copy the remaining elements into the last chunk
            arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest);
        }
        return arrays; // that's it
    }
}
