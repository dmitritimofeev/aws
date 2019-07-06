package com.lambda.iterator.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Iterator2 implements RequestHandler<Object, String> {


@Override
public String handleRequest(Object input, Context context) {
  context.getLogger().log("Input: " + input);
  String output = "Input in handleRequest" + input + "!";
  return output;
}

}

