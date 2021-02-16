public class Main {
    public static void main(String[] args) {

        final String PATHNAME = "src/main/resources";

        System.out.println(ASCIIArt.DEVELOPED_BY_ABHINOV_GOGOI);
        System.out.println(ASCIIArt.LOCKED_ME_COM);


        Menu menu = new Menu(PATHNAME);
        menu.showMenu();
    }
}
