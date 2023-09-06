public class Example10 {
    public static void main(String[] args) {
        int month = 5;
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("The current season is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("The current season is Spring");
                break;
            case 6:
            case 7:
            case 8:
            System.out.println("The current season is Summer");
            case 9:
            case 10:
            case 11:
                System.out.println(("The current season is Autumn"));
            default:
                System.out.println("The input for the month is incorrect");
        }
    }
}
