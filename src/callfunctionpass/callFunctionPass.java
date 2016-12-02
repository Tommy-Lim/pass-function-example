package callfunctionpass;

import java.io.*;
import java.util.*;

public class callFunctionPass {
	
	public static void main(String[] args){		
		
		//note1: pass any input, (35) in this case, you want to this function
		multiply(15);  
		
		//note2: pass again, any number, then print the number using the 
		int b = apple(35);
		System.out.println(b);
		System.out.println(apple(20));
		
		
	}

	//note1: this function will then be called having the input (int numba)
	public static void multiply(int numba){
		numba=numba*2;
		System.out.println(numba);
	}
	
	
	//note2: it doesnt matter what the variable is called, "b" in this case, it takes an input and then returns the value
	public static int apple(int abc){  
	   abc = abc*2;
	   return abc;
	}
	
	
}
