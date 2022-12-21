  //      QUE 2. Rotate array

package Assingment2;

public class RotateArray {

	public static void main(String[] args) {

		int array[] = {1,2,3,4,5,6,7,8,9,0};
		
		System.out.println("GIven array is   :  ");
		
		for(int i: array) {
			System.out.print("  ");
			System.out.print(i);
			
		}
		
		System.out.println("\nRotated array is");
		
		for(int x= array.length-1 ; x>=0;x--) {
			System.out.print("  ");
			System.out.print(array[x]);
		}
		
		
	}

}


