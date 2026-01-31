package flowstatement_programs.looping_tmt.whileloop;
import java.util.Scanner;
public class Program9 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int count = 0;
	        int temp = num;
	        while (temp > 0) {
	            if (temp % 2 == 1)
	                count++;
	            temp /= 2;
	        }
	        if (count % 2 == 0)
	            System.out.println(num + " is an Evil Number");
	        else
	            System.out.println(num + " is not an Evil Number");
	    }}

