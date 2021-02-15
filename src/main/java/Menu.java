import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Files files;

    public Menu(String pathname) {
        files = new Files(pathname);
    }

    // PRIMARY MENU
    private void showPrompt() {
        System.out.println("******** PRIMARY MENU ********");
        System.out.println("Select any of the following: \n"+
                "1 -> current file names\n"+
                "2 -> More\n"+
                "3 -> Exit");
    }

    void showMenu() {
        showPrompt();

        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    files.displayFilesList();
                    showMenu();
                }
                case 2 -> {
                    showSecondaryMenu();
                }
                case 3 -> {
                    confirmClose();
                }
                default -> {
                    showMenu();
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
    }

    // SECONDARY MENU
    private void showSecondaryPrompt() {
        System.out.println("↳  ******** SECONDARY MENU ********");
        System.out.println("   Select any of the following: \n"+
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
                    System.out.println("   ↳ Adding a file...");
                    Thread.sleep(1000);
                    files.addFile("NEW FILE.txt");
                    Thread.sleep(1000);
                    showSecondaryMenu();
                }
                case 2 -> {
                    System.out.println("   ↳ Deleting a file...");
                    Thread.sleep(1000);
                    files.deleteFile("NEW FILE.txt");
                    Thread.sleep(1000);
                    showSecondaryMenu();
                }
                case 3 -> {
                    System.out.println("   ↳ Searching a file...");
                    Thread.sleep(1000);
                    files.searchFile("NEW FILE.txt");
                    Thread.sleep(1000);
                    showSecondaryMenu();
                }
                case 4 -> {
                    System.out.println("    Going Back\n");
                    Thread.sleep(1000);
                    showMenu();
                }
                default -> {
                    showSecondaryMenu();
                }
            }
        }
        catch(InputMismatchException e) {
            System.out.println("    Please enter 1, 2, 3 or 4");
            showSecondaryMenu();;
        }
        catch (Exception e){
            System.out.println("    Something went wrong");
            showSecondaryMenu();
        }
    }

    // CLOSE OPERATION
    void confirmClose() {
        System.out.println("Are you sure to exit?\n (Y)->Yes    (N)->No");
        Scanner scanner = new Scanner(System.in);
        try {
            char option = scanner.nextLine().toUpperCase().charAt(0);

            switch (option) {
                case 'Y' -> {
                    Welcome.thankYou();
                    System.exit(0);
                }
                case 'N' -> {
                    System.out.println("You cancelled the operation\n");
                    showMenu();
                }
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
