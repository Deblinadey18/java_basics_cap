package typecasting;

public class ShortToOthers {

	public static void main(String[] args) {

        short s = 100;
        byte b = (byte) s;//short→ byte
        int i = s;//short→ int
        long l = s;// short → long
        float f = s;// short→ float
        double d = s;// short→ double
        char c = (char) s;//short → char
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}
