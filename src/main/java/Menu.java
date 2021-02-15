import java.util.Scanner;

public class Menu {

    void showPrompt() {
        System.out.println("Select any of the following: \n"+
                "1 -> current file names\n"+
                "2 -> More\n"+
                "3 -> Exit\n");
    }

    int primaryMenu() {


        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }
}
