public class Main {
    final static String PATHNAME = "src/main/resources";

    public static void main(String[] args) {


        System.out.println(ASCIIArt.DEVELOPED_BY_ABHINOV_GOGOI);
        System.out.println(ASCIIArt.LOCKED_ME_COM);
        System.out.println("DIRECTORY : "+PATHNAME+"\n");


        MainMenu mainMenu = new MainMenu(PATHNAME);
        mainMenu.showMenu();
    }
}
