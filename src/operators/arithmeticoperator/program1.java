package operators.arithmeticoperator;

public class program1 {
	//property
	/*
	 Every operator will have precedence and associativity
	 Every operator will have a return value and type of the value
	 */

	public static void main(String[]args) {
		//addition
		//normal,concatenation
		int a=10;
		int b=30;
		System.out.println(10+20);
		System.out.println(a+b);

		
		System.out.println(""+10+20);
		System.out.println(10+20+"Hello"+100);
		System.out.println(10+30*2);
		System.out.println(10*30/2);
		System.out.println(10*30/2);
		System.out.println(5/2);//int/int=int;
		System.out.println(5/2.0);//int/double=double;
		System.out.println('A'+'B');
		char c='A'+'B';
		System.out.println(c);



	}
}
