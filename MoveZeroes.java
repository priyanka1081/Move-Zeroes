package Arrays;

public class MoveZeroes {
	
	 public int[] moveZeroes(int[] nums) {
	        int j=0;
	        int count=0;
	        
	        for(int i=0; i<nums.length; i++) {
	        	if(nums[i]!=0){
	        		nums[j]=nums[i];
	        		j++;
	        	}else {
	        		count++;
	        	}
	        }
	        
	        for(int k=nums.length-1; k>=0;k--) {
	        	if(count>0) {
	        	nums[k]=0;
	        	count--;
	        	}
	        }
	        
	        return nums;
	    }

	public static void main(String[] args) {
		MoveZeroes mz= new MoveZeroes();
		int[] nums= {0,1,0,3,12};
		int[] res= mz.moveZeroes(nums);
		
		for(int a:res) {
			System.out.println(a);
		}

	}

}
