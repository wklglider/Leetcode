package leetcode;

public class MajorityElement2 {
	  public int majorityElement(int[] nums) {
	        int maj=0;
		int count = 0;
		for (int x : nums){
		    if (count == 0){
		        maj = x;
		        count++;
		    }
		    else if (x == maj) count++;
		    else count--;
		}
		return maj;
	    }
}
