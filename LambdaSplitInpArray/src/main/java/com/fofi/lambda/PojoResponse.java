package com.fofi.lambda;

public  class PojoResponse {
    private  Integer[][] splittedArrays;
    
    public PojoResponse() {
    }

    public PojoResponse(Integer[][] splittedArrays) {
        this.splittedArrays= splittedArrays;
    }
    
    public void setSplittedArrays(Integer[][] splittedArrays) {
    	 this.splittedArrays= splittedArrays;
    }

    public Integer[][] getSplittedArrays() {
        return splittedArrays;
    }
}