import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Files {
    private final File pathname;
    Scanner scanner;


    // constructor
    public Files(String pathname) {
        this.pathname = new File(pathname);
        scanner = new Scanner(System.in);
    }

    public void displayFilesList() throws InterruptedException {
        String[] list = pathname.list();

        if (list==null){
            System.out.println("No files in the directory");
        }
        else {
            System.out.println("The files in "+ pathname +" are :\n");
            Thread.sleep(700);
            Arrays.sort(list);
            for (String str:list) {
                Thread.sleep(100);
                System.out.println(str);
                Thread.sleep(100);
            }
            System.out.println("*****************************\n");
        }
    }

    boolean addFile(String filename) {
        System.out.println("    File \""+filename+"\" added to "+ pathname +"\n");
        File file = new File(pathname+"/"+filename);
        return true;
    }

    boolean deleteFile(String filename) {
        System.out.println("    File \""+filename+"\" deleted from "+ pathname +"\n");
        return true;
    }

    boolean searchFile(String filename) {
        System.out.println("    File \""+filename+"\" found in "+ pathname +"\n");
        return true;
    }

    public String takeFilenameInput() {
        System.out.println("Please enter a filename : ");
        try{
            String filename = scanner.nextLine();
            if (filename.equals(""))
                return takeFilenameInput();
            else
                return filename;
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return takeFilenameInput();
    }


}
