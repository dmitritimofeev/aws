package com.fofi.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaSplitInpArray implements RequestHandler<PojoInput, DataItemFromSplitStep[][]>{
  final int chunkSize = 3;
  
    @Override
	public DataItemFromSplitStep[][] handleRequest(PojoInput input, Context context) {
    	LambdaLogger logger = context.getLogger();
    	int[] inpArray = input.getInpArray();
    	logger.log("input.getInpArray(): " + input.getInpArray());
    	logger.log("inpArray[0]: " + inpArray[0]);
    	DataItemFromSplitStep[][] twoDimArr = { 
    			{   new DataItemFromSplitStep(inpArray[0]),
    				new DataItemFromSplitStep(inpArray[1]),
    				new DataItemFromSplitStep(inpArray[2])},
    			{   new DataItemFromSplitStep(inpArray[3]),
        			new DataItemFromSplitStep(inpArray[4]),
        			new DataItemFromSplitStep(inpArray[5])},
    			{   new DataItemFromSplitStep(inpArray[6]),
            		new DataItemFromSplitStep(inpArray[7]),
            		new DataItemFromSplitStep(inpArray[8])}};
    	return twoDimArr;
    }
		
}
