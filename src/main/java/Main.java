public class Main {
    public static void main(String[] args) {

        final String PATH = "src/main/resources";

        Welcome.all();

        Menu menu = new Menu(PATH);
        menu.showMenu();
    }
}
