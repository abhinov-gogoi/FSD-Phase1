import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Files {
    private final File rootFolder;

    // constructor
    public Files(String path) {
        rootFolder = new File(path);
    }

    public void displayFilesList() throws InterruptedException {
        String[] list = rootFolder.list();

        if (list==null){
            System.out.println("No files in the directory");
        }
        else {
            System.out.println("The files in "+rootFolder+" are :\n");
            Thread.sleep(700);
            Arrays.sort(list);
            for (String str:list) {
                Thread.sleep(250);
                System.out.println(str);
                Thread.sleep(250);
            }
            System.out.println("*****************************\n");
        }
    }


}
