package com.fofi.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaProcessArray implements RequestHandler<DataItemFromProcessStep[], DataItemFromProcessStep[]>{

    @Override
	public DataItemFromProcessStep[] handleRequest(DataItemFromProcessStep[] input, Context context) {
    	LambdaLogger logger = context.getLogger();
		
		logger.log("\ninput:" + input);
		logger.log("\ninput[0].getId():" + input[0].getId());
		return input;
		//List<int> newList = new ArrayList<>();
		//input.forEach(x -> newList.add(100 + x));
	}
}
