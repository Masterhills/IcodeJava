package com.masterHills;

interface Takeaway {
	int takeaway(int i, int j);
}
class Away implements Takeaway{
	@Override
	public int takeaway(int i, int j){
		int t;
		if(i>j) {
			t = i-j;
		}
		else {
			t = j-i;
		}
		return t;
	}

}
