public class Example02 {
    public static void main(String[] args) {
        byte a;
        int b = 298; // type of int has 32 bits 00000000 00000000 00000001 00101010
        a = (byte) b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }
}
