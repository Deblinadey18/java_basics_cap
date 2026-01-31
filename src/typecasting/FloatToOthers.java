package typecasting;

public class FloatToOthers {
	public static void main(String[] args) {
        float f= 67.5f;
        byte b=(byte)f;//float->byte
        short s =(short)f;// float→ short
        int i =(int)f;// float->int
        long l = (long)f;// float → long
        double d = f;// float → double
        char c = (char) f;// float → char
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
}
}