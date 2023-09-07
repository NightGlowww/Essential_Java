public class Example14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // outside loop
            for (int j = 1; j <= i; j++) { // inside loop
                System.out.print(j + "*" + i + "=" + i * j + "\t"); // 使用 print 而非 println
            }
            System.out.println(); // 在每一行结束后进行换行
        }
    }
}
