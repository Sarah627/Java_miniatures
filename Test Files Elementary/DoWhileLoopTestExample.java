import java.util.Scanner;
class DoWhileLoopTestExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Test Menu");
        System.out.println("1 Timed Test");
        System.out.println("2 Graded Test");
        System.out.println("0 Quit");

        do{

            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Timed Quiz");
                    break;
                case 2:
                    System.out.println("Graded Quiz");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("please choose correct number");
        }
        }while(choice != 0);
    }
}