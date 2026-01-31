package flowstatement_programs.looping_tmt.whileloop;
import java.util.Scanner;
public class Program12 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int temp = num;
	        int digits = 0;
	        while (temp > 0) {
	            digits++;
	            temp = temp / 10;
	        }
	        if (digits % 2 != 0) {
	            System.out.println(num + " is not a Tech Number");
	            return;
	        }
	        int power = 1;
	        int i = 1;
	        while (i <= digits / 2) {
	            power = power * 10;
	            i++;
	        }
	        int firstPart = num / power;
	        int secondPart = num % power;

	        int sum = firstPart + secondPart;

	        if (sum * sum == num)
	            System.out.println(num + " is a Tech Number");
	        else
	            System.out.println(num + " is not a Tech Number");
	    }}
