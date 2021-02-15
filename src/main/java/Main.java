public class Main {
    public static void main(String[] args) {
        Welcome welcomeScreen = new Welcome();
        welcomeScreen.showWelcome();

        Menu menu = new Menu();
        menu.primaryMenu();
    }
}
