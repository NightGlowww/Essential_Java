public class Example02 {
    public static void main(String[] args) {
        byte a;
        int b = 298; // type of int has 32 bits 00000000 00000000 00000001 00101010 = 298
        a = (byte) b;// type of byte has 8 bits 00101010 = 42
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }
}
