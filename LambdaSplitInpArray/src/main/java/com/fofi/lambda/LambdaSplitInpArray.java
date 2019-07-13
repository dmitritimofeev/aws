package com.fofi.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaSplitInpArray implements RequestHandler<PojoInput, DataItemFromSplitStep[][]>{
  final int chunkSize = 3;
  
    @Override
	public DataItemFromSplitStep[][] handleRequest(PojoInput input, Context context) {
    	DataItemFromSplitStep[][] twoDimArr = { 
    			{   new DataItemFromSplitStep(1),
    				new DataItemFromSplitStep(2),
    				new DataItemFromSplitStep(3)},
    			{   new DataItemFromSplitStep(4),
        			new DataItemFromSplitStep(5),
        			new DataItemFromSplitStep(6)},
    			{   new DataItemFromSplitStep(7),
            		new DataItemFromSplitStep(8),
            		new DataItemFromSplitStep(9)}};
    	return twoDimArr;
    }
		
}
