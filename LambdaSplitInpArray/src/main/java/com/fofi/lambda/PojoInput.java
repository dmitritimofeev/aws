package com.fofi.lambda;

public  class PojoInput {
    private  int[] inpArray = null;
   
    
    public PojoInput(){
    }

    public PojoInput(int[] inpArray){
    	this.inpArray = inpArray;
    }

	public int[] getInpArray() {
		return inpArray;
	}


	public void setInpArray(int[] inpArray) {
		this.inpArray = inpArray;
	}
}


