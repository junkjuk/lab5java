import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            var res = MaxWordsInLineInFile.GetMaxWordsLine("D:\\q.txt");
            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}