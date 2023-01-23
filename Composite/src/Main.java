import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Element> elms = new ArrayList<>();

        Element elm1 = new File("file1", Arrays.asList('R','W','X'), 200, "Ko");
        Element elm2 = new File("file2", Arrays.asList('R','W','_'), 300, "Ko");

        Element folder = new Folder("folder1", Arrays.asList('R','W','_'), 300, "Ko");
        Element folder2 = new Folder("folder2", Arrays.asList('R','W','_'), 300, "Ko");

        folder.add(folder2);

        folder2.add(new File("file3", Arrays.asList('R','_','_'), 500, "Ko"));
        folder2.add(new Folder("folder3", Arrays.asList('R','_','_'), 500, "Ko"));

        folder.add(elm1);
        folder.add(elm2);

        Element elm3 = new File("file3", Arrays.asList('R','W','X'), 200, "Ko");

        Element elm4 = new Folder("folder4", Arrays.asList('R','W','X'), 200, "Ko");

        folder2.add(elm4);

        elm4.add(elm3);

        System.out.println(folder.ls());

    }

}
