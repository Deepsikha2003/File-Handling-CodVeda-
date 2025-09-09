import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) {
        // Define the file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Call the method to count words and handle exceptions
        try {
            int wordCount = countWordsInFile(inputFile);
            System.out.println("Word count from '" + inputFile + "': " + wordCount);
            writeWordCountToFile(outputFile, wordCount);
            System.out.println("Word count written to '" + outputFile + "'.");
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }

    /**
     * Reads a file and counts the number of words.
     * A word is defined as any sequence of characters separated by whitespace.
     *
     * @param fileName The path to the input file.
     * @return The total word count.
     * @throws IOException if the file cannot be read.
     */
    private static int countWordsInFile(String fileName) throws IOException {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by whitespace
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }

    /**
     * Writes the word count to a specified output file.
     *
     * @param fileName  The path to the output file.
     * @param count The word count to write.
     * @throws IOException if the file cannot be written to.
     */
    private static void writeWordCountToFile(String fileName, int count) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("The total word count is: " + count);
        }
    }
}
