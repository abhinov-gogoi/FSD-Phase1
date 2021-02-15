import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Files {
    private final File rootFolder;

    // constructor
    public Files(String path) {
        rootFolder = new File(path);
    }

    public void displayFilesList() {
        String[] list = rootFolder.list();

        if (list==null){
            System.out.println("No files in the directory");
        }
        else {
            System.out.println("The files in "+rootFolder+" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }


}
