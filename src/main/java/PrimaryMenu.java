import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimaryMenu {

    private void showPrompt() {
        System.out.println("\nSelect any of the following: \n"+
                "1 -> current file names\n"+
                "2 -> More\n"+
                "3 -> Exit");
    }

    int showMenu() {
        showPrompt();

        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("Option 1 Selected\n");
                    return 1;
                }
                case 2 -> {
                    System.out.println("Option 2 Selected\n");
                    return 2;
                }
                case 3 -> {
                    System.out.println("Option 3 Selected\n");
                    return 3;
                }
                default -> {
                    showPrompt();
                    return -1;
                }
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter 1, 2 or 3");
            showMenu();
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            showMenu();
        }

        return -1;
    }

    void confirmClose() {
        System.out.println("Are you sure to exit?\n (Y)->Yes    (N)->No");
        Scanner scanner = new Scanner(System.in);
        try {
            char option = scanner.nextLine().toUpperCase().charAt(0);

            switch (option) {
                case 'Y' -> {
                    System.out.println("Thank You for using LockedMe.com");
                    System.exit(0);
                }
                case 'N' -> showMenu();
                default -> {
                    System.out.println("To confirm, press Y or N");
                    confirmClose();
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Press Y or N");
            showMenu();
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
            showMenu();
        }

    }
}
