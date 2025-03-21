package core.concepts;

import java.util.*;

public class Looping {

	public static void main(String[] args) {

		
		  //Entry checking:for, while //Exit checking:do while
		 
		 //rule:initialization,condition-checking,increment or decrement
		  

		 

Scanner in = new Scanner (System.in);

		int temp;
		
		for( temp=1;temp <=5;temp++) {	

	//Get the input from the user(System.in);
			System.out.println("Student 2322JC" + temp +":");
			String name = in.nextLine();

	//print the Output
			System.out.println("Your name is" + name);

		}
}

		


}
*/
		 //For example:
		 /*
		 for (int i =1;i<=10;i++) {
			 System.out.println(i);
		 }
		 */
		 // while loop
		 /*
		 int i=1;
		 while(i<=10);{
			 System.out.println(i);
			 i++;
		 }*/
		 //do-while loop
		 
		 int i=1;
		 do{
			 if(i==5) {
				 System.out.println("FIVE");
				 //continue;//jump statements
				 break;
			 }
			 System.out.println(i);
			 i++;
			 
		 }while (i <=10);
		 System.out.println("Program end here...");
	}
}
			 
		 
		 