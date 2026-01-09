package flowstatement_programs.looping_tmt.forloop;

public class program3 {
	public static void main(String[]args) {
		int i =3;
		int count=0;
		for(int j=1;j<=i;j++) {
		if(i%j==0) {
		count++;	
		}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");

		}

}}
