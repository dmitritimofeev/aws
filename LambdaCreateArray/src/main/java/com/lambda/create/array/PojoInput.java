package com.lambda.create.array;

public  class PojoInput {
    private  int startRange;
    private  int endRange;
    
    public PojoInput() {
    }

	public PojoInput(int startRange, int endRange) {
		this.startRange = startRange;
		this.endRange = endRange;
	}

	public int getStartRange() {
		return startRange;
	}

	public void setStartRange(int startRange) {
		this.startRange = startRange;
	}

	public int getEndRange() {
		return endRange;
	}

	public void setEndRange(int endRange) {
		this.endRange = endRange;
	}
}


