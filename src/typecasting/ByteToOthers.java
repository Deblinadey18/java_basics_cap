package typecasting;

public class ByteToOthers {
	public static void main(String[] args) {
        byte b = -128;
        short s = b;// byte→ short
        int i = b;// byte->int
        long l = b;// byte → long
        float f = b;// byte → float
        double d = b;// byte → double
        char c = (char) b;// byte → char
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}


