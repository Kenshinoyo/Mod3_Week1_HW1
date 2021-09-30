package hw1Package;
import java.util.Scanner;

public class VariablesAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gradeInput = new Scanner(System.in);
        System.out.println("What is the student's grade?");
        
        float userGrade = gradeInput.nextFloat();
//        float userGrade = showGrade;
//        boolean showGrade = true;
        

        // 1)Write an if/else statement for the following grade requirements:
//        	- 90 or higher: A
//        	- 80 to 89: B 
//        	- 70 to 79: C
//        	- 55 to 69: D
//        	- Lower than 55: F
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
//        if(System.out.println(userGrade)) {
//        	
//        }
        };
	}

}
