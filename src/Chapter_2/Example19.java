public class Example19 {
    public static void main(String[] args) {
        printRectangle(3, 5);
        printRectangle(2, 4);
        printRectangle(6, 10);

        
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) { // 决定了长方形的高
            for (int j = 0; j < width; j++) { // 决定了长方形的宽
                System.out.print("*");
            }
            System.out.print("\n");   
        }
        System.out.print("\n");
    }
}
