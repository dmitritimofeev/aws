package com.lambda.create.array;

import java.util.stream.IntStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaCreateArray implements RequestHandler<PojoInput, PojoOutput> {

    @Override
    public PojoOutput handleRequest(PojoInput input, Context context) {
        context.getLogger().log("input.getStartRange(): " + input.getStartRange());
        context.getLogger().log("input.getEndRange(): " + input.getEndRange());
        return new PojoOutput(IntStream.rangeClosed(input.getStartRange(), input.getEndRange()).toArray());      
    }

}
