import java.io.File;
import java.io.IOException;
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
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }

    boolean addFile(String filename) throws IOException {
        File file = new File(pathname+"/"+filename);

        if (file.createNewFile()){
            System.out.println("    File \""+filename+"\" added to "+ pathname +"\n");
            return true;
        }
        else if(file.exists())
            System.out.println("    File \""+filename+"\" already exists at "+ pathname +"\n");
        else
            System.out.println("Something went wrong. File NOT added\n");
        return false;
    }

    boolean deleteFile(String filename) {
        File file = new File(pathname+"/"+filename);

        if (file.delete()){
            System.out.println("    File \""+filename+"\" deleted from "+ pathname +"\n");
            return true;
        }
        else
            System.out.println("    Delete Operation failed. FILE NOT FOUND\n");
        return false;
    }

    boolean searchFile(String filename) {
        File file = new File(pathname+"/"+filename);

        if(file.exists()){
            System.out.println("    FOUND : File \""+filename+"\" exists at "+ pathname +"\n");
            return true;
        }
        else
            System.out.println("    File NOT found\n");
        return false;
    }

    public String takeFilenameInput() {
        System.out.print("    Please enter a filename : ");
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
