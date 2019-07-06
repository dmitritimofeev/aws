package com.fofi.lambda;

import java.util.Arrays;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaProcessArray implements RequestHandler<PojoInput, PojoResponse>{
  final int chunkSize = 3;
  
    @Override
	public PojoResponse handleRequest(PojoInput input, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("$.AWS_BATCH_JOB_ARRAY_INDEX = " + $.AWS_BATCH_JOB_ARRAY_INDEX );
		logger.log("input: " + input);
		Integer[] arrayToProcess = input.getInputArray();
		logger.log("arrayToProcess: " + arrayToProcess);	
		//List<Integer> newList = new ArrayList<>();
		//input.forEach(x -> newList.add(100 + x));
		
	
		return new PojoResponse(splittedArrays);
	}
    
 
}
