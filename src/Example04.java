public class Example04 {
    public static void main(String[] args) {
        int x = 12;
        {
            int y = 96;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
        // int y = x;
        System.out.println("x=" + x);
    }
}
