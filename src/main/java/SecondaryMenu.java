import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondaryMenu {

    private void showSecondaryPrompt() {
        System.out.println("↳   ******** SECONDARY MENU ********");
        System.out.println("    Select any of the following: \n"+
                "   1 -> Add a file\n"+
                "   2 -> Delete a file\n"+
                "   3 -> Search a file\n"+
                "   4 -> GoBack");
    }

    void showSecondaryMenu() {
        showSecondaryPrompt();

        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("    Adding a file\n");
                    showSecondaryMenu();
                }
                case 2 -> {
                    System.out.println("    Deleting a file\n");
                    showSecondaryMenu();
                }
                case 3 -> {
                    System.out.println("    Searching a file\n");
                    showSecondaryMenu();
                }
                case 4 -> {
                    System.out.println("    Go Back\n");
                    showSecondaryMenu();
                }
                default -> {
                    showSecondaryMenu();
                }
            }
        }
        catch(InputMismatchException e) {
            System.out.println("    Please enter 1, 2 or 3");
            showSecondaryMenu();;
        }
        catch (Exception e){
            System.out.println("    Something went wrong");
            showSecondaryMenu();
        }
    }
}
