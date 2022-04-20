package WordCount;
import java.io.File;
import java.util.Scanner;

public class WordCount {
    public void count() throws Exception {
        File file = new File("testFile.txt");
        Scanner scanner = new Scanner(file);
        // System.out.println(scanner);
        int paragraphLength = 0;
        while (scanner.hasNext()) {
            String eachParagraph = scanner.nextLine();
            paragraphLength += eachParagraph.split(" ").length;
        }
        System.out.println(paragraphLength);
        scanner.close();
    }
}
