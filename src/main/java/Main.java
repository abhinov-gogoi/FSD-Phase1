public class Main {
    public static void main(String[] args) {

        final String PATHNAME = "src/main/resources";

        ASCIIArt.lockedmedotcom();
        ASCIIArt.dash();

        Menu menu = new Menu(PATHNAME);
        menu.showMenu();
    }
}
