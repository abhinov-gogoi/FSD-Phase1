import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    Files files;
    SecondaryMenu secondaryMenu;
    Scanner scanner;

    public MainMenu(String pathname) {
        files = new Files(pathname);
        scanner = new Scanner(System.in);
        secondaryMenu = new SecondaryMenu();
    }

    // PRIMARY MENU
    private void showPrompt() {
        System.out.println(ASCIIArt.MENU);
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
                    secondaryMenu.showSecondaryMenu();
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
            System.out.println("Please enter 1, 2 or 3\n");
            showMenu();
        }
        catch (Exception e){
            System.out.println("Something went wrong\n");
            showMenu();
        }
    }

    // CLOSE OPERATION
    private void confirmClose() {
        System.out.println("Are you sure to exit?\n (Y)->Yes    (N)->No");
        Scanner scanner = new Scanner(System.in);
        try {
            char option = scanner.nextLine().toUpperCase().charAt(0);

            switch (option) {
                case 'Y' -> {
                    System.out.println(ASCIIArt.THANK_YOU);
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
