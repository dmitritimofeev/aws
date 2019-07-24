package com.fofi.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaSplitInpArray implements RequestHandler<SplitArrayItemIn[], SplitArrayItemOut[][]>{
  private static final int CHUNK_SIZE = 3;
  //TODO Can handleRequest()  have a generic signature like <T> T[][] handleRequest( T[], ...)
    @Override
	public SplitArrayItemOut[][] handleRequest(SplitArrayItemIn[] arrayIn, Context context) {
    	LambdaLogger logger = context.getLogger();
    	for(SplitArrayItemIn item : arrayIn) {
    		logger.log("SplitArrayItemIn item.getId = "+ item.getId());
    	}
    	
    	SplitArrayItemOut[][] twoDimArr = { 
    			{   new SplitArrayItemOut(arrayIn[0].getId()),
    				new SplitArrayItemOut(arrayIn[1].getId()),
    				new SplitArrayItemOut(arrayIn[2].getId())},
    			{   new SplitArrayItemOut(arrayIn[3].getId()),
        			new SplitArrayItemOut(arrayIn[4].getId()),
        			new SplitArrayItemOut(arrayIn[5].getId())},
    			{   new SplitArrayItemOut(arrayIn[6].getId()),
            		new SplitArrayItemOut(arrayIn[7].getId()),
            		new SplitArrayItemOut(arrayIn[8].getId())}};
    	return twoDimArr;
    }
    
}
    

	//Integer[][] splittedArrays = splitArray(arrayToSplit, chunkSize);
	//logger.log("Output splittedArrays: " + splittedArrays);

/*
 * private static <T> T[][] splitArray(T[] arrayToSplit, int chunkSize){
 * if(chunkSize<=0){ return null; // just in case :) } // first we have to check
 * if the array can be split in multiple // arrays of equal 'chunk' size int
 * rest = arrayToSplit.length % chunkSize; // if rest>0 then our last array will
 * have less elements than the others // then we check in how many arrays we can
 * split our input array int chunks = arrayToSplit.length / chunkSize + (rest >
 * 0 ? 1 : 0); // we may have to add an additional array for the 'rest' // now
 * we know how many arrays we need and create our result array Integer[][]
 * arrays = new Integer[chunks][]; // we create our resulting arrays by copying
 * the corresponding // part from the input array. If we have a rest (rest>0),
 * then // the last array will have less elements than the others. This // needs
 * to be handled separately, so we iterate 1 times less. for(int i = 0; i <
 * (rest > 0 ? chunks - 1 : chunks); i++){ // this copies 'chunk' times
 * 'chunkSize' elements into a new array arrays[i] =
 * Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize); }
 * if(rest > 0){ // only when we have a rest // we copy the remaining elements
 * into the last chunk arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit,
 * (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest); } return arrays;
 * // that's it }
 */
		

