package flowstatement_programs.looping_tmt.whileloop;

public class Program2 { 
	public static void  main(String[]args) {
		int num=1863;
		int result=0;
		while(num!=0) {
		int last=num%10;
		result=result*10+last;
		num=num/10;
	}
		System.out.println(result);
		}


}
