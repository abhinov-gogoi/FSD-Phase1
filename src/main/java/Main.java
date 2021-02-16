/**
 * @Author Abhinov Gogoi
 */

public class Main {

    // specify the path of folder
    final static String ROOT_DIRECTORY = "src/main/resources";

    public static void main(String[] args) {
        // Display Welcome Screen
        System.out.println(ASCIIArt.DEVELOPED_BY_ABHINOV_GOGOI);
        System.out.println(ASCIIArt.LOCKED_ME_COM);

        MainMenu mainMenu = new MainMenu(ROOT_DIRECTORY);
        mainMenu.showMenu();
    }
}
