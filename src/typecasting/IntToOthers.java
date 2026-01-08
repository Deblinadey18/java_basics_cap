package typecasting;

public class IntToOthers {

	public static void main(String[] args) {
        int a = 97;
        byte b = (byte) a;// int → byte
        short s = (short) a;// int → short
        long l = a;// int → long
        float f = a;// int → float
        double d = a;// int → double
        char c = (char) a;// int → char
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}
