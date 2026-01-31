package flowstatement_programs.looping_tmt.whileloop;
import java.util.Scanner;
public class Program10 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        if (num <= 0) {
	            System.out.println("Input should be greater than 0");
	            return;
	        }
	        int a = 0, b = 1, i = 1;
	        while (i <= num) {
	            System.out.print(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	            i++;
	        }
	    }
	}


