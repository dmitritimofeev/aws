package com.lambda.create.array;

public  class PojoOutput {
    private  int[] outputArray = null;
   
    
    public PojoOutput(){
    }

    public PojoOutput(int[] inpArray){
    	this.outputArray = inpArray;
    }

	public int[] getOutputArray() {
		return outputArray;
	}

	public void setOutputArray(int[] outputArray) {
		this.outputArray = outputArray;
	}


}


