package typecasting;

public class DoubleToOthers {
	public static void main(String[] args) {
        double d = 105.5;
        byte b = (byte) d;// double → byte
        short s = (short) d;// double → short
        int i = (int) d;// double → int
        long l = (long) d;// double → long
        float f = (float) d;// double → float
        char c = (char) d;// double → char
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(c);
    }

}
