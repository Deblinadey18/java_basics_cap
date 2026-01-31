package operator.conditional;

public class Program1 {

	public static void main(String[]args) {
		//operand1?operand2:operand3
		System.out.println(true?10:20);
		System.out.println(false?"A":65);
		System.out.println(10>'A'?true:false);
		System.out.println("Hello"!="hello"?'A':'B');
		System.out.println(40>30?'A':'B');
		String res=40>30?"A":"True";
		System.out.println(res);/*Remember in conditional operator the operand2 and operand3 
		should be same if you are storing the data in a data variable */

	}
}
