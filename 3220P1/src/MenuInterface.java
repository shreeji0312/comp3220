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
            option = scan.nextInt();
            switch (option) {
                case 1:
                    final reader reader1 = new reader("Schools");
                    System.out.println("There are total number of" + reader1.numberOfRows() + " Schools in windsor");
                    System.out.println("Please select any of the below: \n" + 
                        "1. Find the total C.S.C.P. board Schools \n"+
                        "2. Find the total Conseil scolaire Viamonde board Schools \n" + 
                        "3. Find the roral G.E.C.D.S.B. boardschool \n" + 
                        "4. Search for the school by name \n" +
                        "5. want to see whole data: \n" + 
                        "6. to exit");
                    int selection = scan.nextInt();
                    switch (selection) {
                        case 1:
                        int count = 0;
                        for (int i = 1; i < reader1.numberOfRows(); i++) {
                            final String o = "C.S.C.P.";
                            if (reader1.field(i, 6).equals(o)) {
                                count++;
                            }
                        }
                        System.out.println("Total C.S.C.P. board schools are: " + count);
                        break;
                        case 2:
                            int count1 = 0;
                            for (int i = 1; i < reader1.numberOfRows(); i++) {
                                final String o = "Conseil scolaire Viamonde";
                                if (reader1.field(i, 3).equals(o)) {
                                    count1++;
                                }   
                            }
                            System.out.println("Total Conseil scolaire Viamonde board schools are: " + count1);
                            break;
                        case 3:
                            int count2 = 0;
                            for (int i = 1; i < reader1.numberOfRows(); i++) {
                                final String o = "G.E.C.D.S.B.";
                                if (reader1.field(i, 3).equals(o)) {
                                    count2++;
                                }
                            }
                            System.out.println("Total G.E.C.D.S.B. board schools are:" + count2);
                            break;
                        case 4:
                            System.out.println("Please enter name of the school: ");
                            final String name = scan.next();
                            int count3 = 0;
                            int i;
                            for (i = 0 ;i< reader1.numberOfRows(); i++) {
                                if (reader1.field(i, 4).equals(name)) {
                                    System.out.println("the address for the given school name:" + reader1.field(i, 5));
                                }
                            }
                        case 5: 
                            reader1.printrow();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid Selection");
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
            }
        }
    }
}