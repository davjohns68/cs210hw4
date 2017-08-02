// CS210 Assignment #4 "Word Count"
// Student name

public class WordCount{

    public static int wordCount(String inputString) {
        int count = 0;
        int inWord = 0;
        for (char letter : inputString.toCharArray()) {
            //non-space means were "in a word"
            if (letter != ' ') {
                inWord = 1;
            } else {
                // space is the delimiter, but we only want to count a word if
                // we were previously "in a word"
                if (inWord == 1) {
                    count++;
                    inWord = 0;
                }
            }
        }
        // Just in case we were "in a word," but never encountered another space
        if (inWord == 1) {
            count++;
        }
        return count;
    }
}
