public class Example06 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a, b;

        a = x > 0 & y++ > 1;

        System.out.println("a=" + a); // false
        System.out.println("y=" + y); // 1

        b = x > 0 && z++ > 1;
        System.out.println("b=" + b); // false
        System.out.println("z=" +z); // 0
    }
}
