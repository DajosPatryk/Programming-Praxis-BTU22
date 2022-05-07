public class Zahlensysteme {
    public static void main(String[] args) {
        // a)
        System.out.println("a = " + 15);
        System.out.println("b = " + 015);
        // b)
        System.out.println(0.25 * 100 == 25);
        System.out.println(0.362 * 100 == 36.2);
        System.out.println(0.362 * 100);
        // c)
        System.out.println(0xAFFE);
        System.out.println(10 + 0b10 + 010 + 0x10);
        // d)
        System.out.println("float " + (987654321f - 987654320f) + " vs int " + (987654321 - 987654320));
        float a = 987654321.0f;
        float b = 987654320.0f;
        float result = a - b;
        System.out.println(result);
    }
}