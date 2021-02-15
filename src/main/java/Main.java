public class Main {
    public static void main(String[] args) {

        final String PATH = "src/main/resources";

        ASCIIArt.lockedmedotcom();
        ASCIIArt.dash();

        Menu menu = new Menu(PATH);
        menu.showMenu();
    }
}
