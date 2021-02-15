public class Main {
    public static void main(String[] args) {
        Welcome.showWelcome();

        PrimaryMenu primaryMenu = new PrimaryMenu();
        Files files = new Files();

        int menu_selection = primaryMenu.showMenu();

        if (menu_selection==1){
            files.displayFilesList();
            primaryMenu.showMenu();
        }
        else if (menu_selection==2) {
            System.out.println("Here is Menu 2");
        }
        else if (menu_selection==3){
            primaryMenu.confirmClose();
        }
        else {
            System.out.println("Something went wrong");
            primaryMenu.showMenu();
        }




    }
}
