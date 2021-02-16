import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Files {
    File file;
    Scanner scanner;

    // constructor
    public Files() {
        this.file = new File(Main.PATHNAME);
        scanner = new Scanner(System.in);
    }

    public void displayFilesList() throws InterruptedException {
        String[] list = file.list();

        if (list==null){
            System.out.println("No files in the directory");
        }
        else {
            System.out.println("The files in "+ file +" are :\n");
            Thread.sleep(100);
            Arrays.sort(list);
            for (String str:list) {
                Thread.sleep(100);
                System.out.println(str);
                Thread.sleep(100);
            }
        }
    }

    boolean addFile(String filename) throws IOException {
        File file = new File(this.file +"/"+filename);

        if (file.createNewFile()){
            System.out.println("    File \""+filename+"\" added to "+ this.file +"\n");
            return true;
        }
        else if(file.exists())
            System.out.println("    File \""+filename+"\" already exists at "+ this.file +"\n");
        else
            System.out.println("Something went wrong. File NOT added\n");
        return false;
    }

    boolean deleteFile(String filename) {
        File file = new File(this.file +"/"+filename);

        if (file.delete()){
            System.out.println("    File \""+filename+"\" deleted from "+ this.file +"\n");
            return true;
        }
        else
            System.out.println("    Delete Operation failed. No such File exist\n");
        return false;


    }

    boolean searchFile(String filename) {
        File file = new File(this.file +"/"+filename);

        if(file.exists()){
            System.out.println("    FOUND : File \""+filename+"\" exists at "+ this.file +"\n");
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
