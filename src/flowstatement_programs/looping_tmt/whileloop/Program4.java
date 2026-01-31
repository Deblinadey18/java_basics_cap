package flowstatement_programs.looping_tmt.whileloop;

public class Program4 {
 public static void main(String[]args) {
	 int num=9;
	 int square=num*num;
	 int sum=0;
	 while(square!=0) {
		 sum=sum+square%10;
		 square=square/10;
	 }
	 if(sum==num) {
		 System.out.println("Its a Neon number");
	 }
	 else {
		 System.out.println("Its not a Neon number");
	 }
 }
}
