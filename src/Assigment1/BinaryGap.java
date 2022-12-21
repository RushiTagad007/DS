package Assigment1;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryGap {
public static void main(String[]args) {
  
	    Scanner SC = new Scanner(System.in);
	    
	    System.out.println("Enter the number");
	    
	    int N =SC.nextInt();
	    Binary B = new Binary();
	    
	   int Binarygap= B.Process(N);
   
	   System.out.println("The Binary gap is : "+Binarygap);
	    
	    
}
}
class Binary{
public int Process(int N) {
	

	String BinaryConversion = Integer.toBinaryString(N);
	
	System.out.println("Binary of given num is  :   "+BinaryConversion);
	
	 int binarygap=0;
	ArrayList<Integer> ListOfOnes = new ArrayList<Integer>();
	
     for(int i=0; i<BinaryConversion.length();i++) {
    	 if(BinaryConversion.charAt(i)=='0')
    		 continue;
    	 ListOfOnes.add(i);
    	 
     }
     
    for(int i=0; i<ListOfOnes.size()-1;i++) {
    	System.out.println();
    	int NoOfZero = ListOfOnes.get(i+1)-ListOfOnes.get(i)-1;
    	
    	binarygap = Math.max(binarygap, NoOfZero);
    }
	return binarygap;
}

}