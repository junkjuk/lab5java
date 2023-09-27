import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MaxWordsInLineInFile {

    public static String GetMaxWordsLine(String filePath) throws IOException {
        var path = Paths.get(filePath);
        Stream<String> lineStream = Files.lines(path);
        return lineStream.max((i, j) -> {
            if(i.split(" ").length > j.split(" ").length)
                return 1;
            return -1;
        }).get();
    }
}
