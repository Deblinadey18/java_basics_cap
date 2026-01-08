package typecasting;

public class LongToOthers {

	public static void main(String[] args) {

        long l = 256l;
        byte b = (byte) l;//long→ byte
        short s = (short)l;// long → short
        int i = (int)l;//long→ int
        float f = l;// long→ float
        double d = l;// long→ double
        char c = (char) l;//long → char
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}
