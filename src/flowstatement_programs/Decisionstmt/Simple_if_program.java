package flowstatement_programs.Decisionstmt;

public class Simple_if_program {
	public static void main(String[]args) {
		if(true) {
			System.out.println("1");
			System.out.println("2");
		}
		System.out.println("Main End");
		if(false) {
			System.out.println("1");
			System.out.println("2");
	        System.out.println("Main End");
		}
		if(false) 
			System.out.println("1");//if no bracket then only one line will be considered as the part of the program
			System.out.println("2");
	        System.out.println("Main End");

	
	if(10>20) {
		System.out.println("1");
		System.out.println("2");
	
	System.out.println("Main End");
}
}}