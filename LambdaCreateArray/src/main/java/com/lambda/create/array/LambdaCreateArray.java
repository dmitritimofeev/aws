package com.lambda.create.array;

import java.util.stream.IntStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaCreateArray implements RequestHandler<PojoInput, CreateArrayItemOut[]> {

    @Override
    public CreateArrayItemOut[] handleRequest(PojoInput input, Context context) {
    	int startRange = input.getStartRange();
    	int endRange = input.getEndRange();
        context.getLogger().log("input.getStartRange(): " + startRange);
        context.getLogger().log("input.getEndRange(): " + endRange);
        int size = endRange - startRange;
        //return new PojoOutput(IntStream.rangeClosed(input.getStartRange(), input.getEndRange()).toArray());  
        CreateArrayItemOut[] arrayOut = new CreateArrayItemOut[size];
        for(int i = startRange; i < endRange;i++) {
        	arrayOut[i] = new CreateArrayItemOut(i);
        }
        return arrayOut;
    }

}
