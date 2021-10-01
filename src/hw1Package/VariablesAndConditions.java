package hw1Package;
import java.io.*;
import java.util.*;

public class VariablesAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) Write an if/else statement for the following grade requirements:
//        	- 90 or higher: A
//        	- 80 to 89: B 
//        	- 70 to 79: C
//        	- 55 to 69: D
//        	- Lower than 55: F
		
		Scanner gradeInput = new Scanner(System.in); //<--Allows the user to input a grade
		System.out.println("What is the student's grade?");
        
		float userGrade = gradeInput.nextFloat(); //<--Stores the user input as a value
//        float userGrade = showGrade;
//        boolean showGrade = true;
        

//        - if/else statement for the sake of printing out the appropriate grade
		if(userGrade >= 0 && userGrade < 55) {
        	System.out.println("Their grade is an 'F'");
        }
		else if(userGrade >= 55 && userGrade <= 69) {
        	System.out.println("Their grade is an 'D'");
        }
		else if(userGrade >= 70 && userGrade <= 79) {
        	System.out.println("Their grade is an 'C'");
        }
		else if(userGrade >= 80 && userGrade <= 89) {
        	System.out.println("Their grade is an 'B'");
        }
		else if(userGrade >= 90) {
        	System.out.println("Their grade is an 'A'");
        }
//        continue;
        
		else {
        	System.out.println("Please enter a valid grade value.");
        };
        

        
        
        
        
//        2) Using switch case, do the following:
//        	- Store a number between 1-7
//        	- If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//        	- Anything other than 1-7 would default to "Invalid Input"
        
        Scanner userInput = new Scanner(System.in); //<--Number that user picks/inputs
        System.out.println("Pick a number.");
        
        int userInt = userInput.nextInt(); //<--Stored user value for universal use
        
        switch(userInt) {
        case 1:
        	System.out.println("Monday");
        	break;
        case 2:
        	System.out.println("Tuesday");
        	break;
        case 3:
        	System.out.println("Wednesday");
        	break;
        case 4:
        	System.out.println("Thursday");
        	break;
        case 5:
        	System.out.println("Friday");
        	break;
        case 6:
        	System.out.println("Saturday");
        	break;
        case 7:
        	System.out.println("Sunday");
        	break;
        default:
        	System.out.println("Invalid Input");
        }
        


//        3) Store a number in a variable called num and write an if statement:
//        	- If num is odd, display "Cool"
//        	- Num is even and between 2-5, display "Cool"
//        	- If num is even and between 6-20, display "Cool"
//        	- If num is even and greater than 2-, display "Not Cool"
        
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Pick another number.");
        
        int userInt2 = userInput2.nextInt(); 
        
        while(userInt2 % 2 == 0) {
        	System.out.println("The number is even.");
        	if(userInt2 >= 2 && userInt2 <= 5) {
        		System.out.println("But it's not cool.");
        	}
        	else {
        		System.out.println("The number is odd");
        		break;
        	}
        	
        }
        
	}

}
