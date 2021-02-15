import java.io.File;
import java.util.Arrays;

public class Files {
    private File root;

    // constructor
    public Files() {
        root = new File("src/main/resources");
    }

    public void displayFilesList() {
        System.out.println(Arrays.toString(root.list()));
    }


}
