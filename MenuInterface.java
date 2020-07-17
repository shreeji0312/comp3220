import java.util.Scanner;

public class MenuInterface {

    public MenuInterface(){
    }

    public void menuControl(){
        Scanner scan = new Scanner(System.in); //System.in is a standard input stream.
        int option = 0;
        while(option<4) {
            System.out.println("Please select any of the option: \n" +
                    "1. School\n" +
                    "2. Exit");
            System.out.print("database you want to look over(or press 2 to exit): ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    final reader reader1 = new reader("School.csv");
                    System.out.println("There are total number of" + reader1.numberOfRows() + " Schools in windsor");

                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
            }
        }
    }
}