package operator.preincrementandpostincrement;

public class Program1 {

	public static void main(String[]args) {
		int a=2;
		int b=a+++30;
		int c=b++ +a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		int d=10;
		System.out.println(++d);
		System.out.println(d);


		

	}
}
