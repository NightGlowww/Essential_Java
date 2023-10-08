public class Example17 {
    public static void main(String[] args) {
        int i,j; // defined a i for all cyclic and a j for detail
        for (i = 1 ; i <= 8; i++) { //循环8次
            if (i > 8){
                break;
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
