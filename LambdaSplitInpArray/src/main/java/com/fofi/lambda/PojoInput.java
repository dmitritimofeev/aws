package com.fofi.lambda;

public  class PojoInput {
    private  Integer[] inputArray;
    
    public PojoInput(){
    }
    
    public PojoInput(Integer[] inputArray){
    	this.inputArray = inputArray;
    }
   
    public void setInputArray(Integer[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer[] getInputArray() {
        return inputArray;
    }
}


