package com.fofi.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaSplitInpArray implements RequestHandler<PojoInput, PojoOutput>{
  final int chunkSize = 3;
  
    @Override
	public PojoOutput handleRequest(PojoInput input, Context context) {
    	int[][] twoDimArr = { {1,2,3},{4,5,6},{7,8,9}};
    	return new PojoOutput(twoDimArr);
    }
		
}
