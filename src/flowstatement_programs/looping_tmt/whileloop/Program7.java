package flowstatement_programs.looping_tmt.whileloop;

public class Program7 {
	public static void main(String[]args) {
		int num=625;
		int square = num * num;
	    int temp = num;
	    int power = 1;
	    while (temp > 0) {
	         power *= 10;
	         temp /= 10;}
	        if (square % power == num)
	            System.out.println(num + " is an Automorphic Number");
	        else
	            System.out.println(num + " is not an Automorphic Number");
	    }}
