package ArraySum;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[]= new int[]{2,7,11,15};
		    int Target=9;
		

		            for(int i=0; i<nums.length ;i++){
		             for(int j=i;j<nums.length ; j++){
		               if(j==i){
		                   continue;
		               }else{
		                  if( nums[i]+nums[j]==Target){
		                      System.out.println(i+","+j);
		                  }
		               }

	}

}
	
	}
	}
