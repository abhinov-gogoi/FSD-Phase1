import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondaryMenu {
    Files files;
    private static final String SECONDARY_PROMPT =
            "   Select any of the following: \n"+
            "   1 -> Add a file\n"+
            "   2 -> Delete a file\n"+
            "   3 -> Search a file\n"+
            "   4 -> GoBack";

    public SecondaryMenu() {
        this.files = new Files();
    }

    void showSecondaryMenu() {
        System.out.println(SECONDARY_PROMPT);
        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("   ↳ Adding a file...");
                    files.addFile(files.takeFilenameInput());
                    showSecondaryMenu();
                }
                case 2 -> {
                    System.out.println("   ↳ Deleting a file...");
                    files.deleteFile(files.takeFilenameInput());
                    showSecondaryMenu();
                }
                case 3 -> {
                    System.out.println("   ↳ Searching a file...");
                    files.searchFile(files.takeFilenameInput());
                    showSecondaryMenu();
                }
                case 4 -> {
                    System.out.println("    Going Back\n");
                    new MainMenu(Main.PATHNAME).showMenu();
                }
                default -> {
                    showSecondaryMenu();
                }
            }
        }
        catch(InputMismatchException e) {
            System.out.println("   Please enter 1, 2, 3 or 4");
            showSecondaryMenu();;
        }
        catch (Exception e){
            System.out.println("    Something went wrong");
            showSecondaryMenu();
        }
    }

}
