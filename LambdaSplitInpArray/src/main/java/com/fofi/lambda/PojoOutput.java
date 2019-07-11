package com.fofi.lambda;


public  class PojoOutput {
    private  int[][] twoDimArray = null;
    
    public PojoOutput() {
    }

	public PojoOutput(int[][] twoDimArr) {
		this.twoDimArray = twoDimArr;
	}

	public int[][] getTwoDimArray() {
		return twoDimArray;
	}

	public void setTwoDimArray(int[][] twoDimArray) {
		this.twoDimArray = twoDimArray;
	}

}