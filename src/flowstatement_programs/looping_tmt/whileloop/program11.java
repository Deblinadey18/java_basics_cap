package flowstatement_programs.looping_tmt.whileloop;
import java.util.Scanner;
public class program11 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int i = 1;
	        boolean found = false;
	        while (i * i <= num) {
	            if (i * i == num) {
	                System.out.println("Square root of " + num + " is " + i);
	                found = true;
	                break;
	            }
	            i++;
	        }
 if (!found) {
	            System.out.println("Square root does not exist");
	        }
	    }
	}

