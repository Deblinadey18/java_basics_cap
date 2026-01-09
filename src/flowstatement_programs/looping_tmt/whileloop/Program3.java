package flowstatement_programs.looping_tmt.whileloop;

public class Program3 {
	public static void main(String[]args) {
		int num=123;
		int sum=0;
		int product=1;
		while(num!=0) {
			sum=sum+num%10;
			product=product*num%10;
			num=num/10;
		}
		if(sum==product) {
			System.out.println("It is a spy number");
		}
		else {
			System.out.println("it is not a spy number");
		}
		
	}

}
