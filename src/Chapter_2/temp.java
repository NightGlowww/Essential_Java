public class temp {
    public static void main(String[] args) {
        int size = 10;
        double[] myList = new double[size];
        char

        myList[0] = 1;
        myList[1] = 0.5;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }

        System.out.println("All:" + total);
    }
}