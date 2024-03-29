package literature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructure2 {
    private static List<String> wordList = new ArrayList<String>();
    public DataStructure2(String[] words) {
        wordList.addAll(Arrays.asList(words));
    }
    public static void removeWords(String[] words) {
        for (String word: words) {
            wordList.remove(word);
        }
    }
    public static void addWords(String[] words) {
        wordList.addAll(Arrays.asList(words));
    }
    public static int getNumberOfOccurences(String s) {
        int occurences = 0;
        for (String word: wordList) {
            if (word.equals(s)) {
               occurences++;
            }
        }
        return occurences;
    }


    /* TODO A programming system that handles data needs a mechanism of
            collecting, storing, and manipulating data.
            One classic way in Object-Oriented programming is to use an object
            to hold in one place the constituent pieces of data that comprise
            a single element. For example all the attributes that make a person
            or a bicycle.
    */
    /* TODO You need to evolve this class into one suitable for storing the
            pieces of data related to a single word so that usage statistics
            can be processed about this word and the others in a set of one or
            more documents. For Part 1, you have free choice over how you do this.
            Make this class different from DataStructure1 so that you can
            demonstrate thinking about the same problem in terms of different
            solutions.
    */
    /* TODO Follow the same TODO steps for DataStructure1 but adapted for the
            different data structure you are using here. You might find the
            access methods you specify are the same as for DataStructure1 but
            with different code inside. If you have achieve that, then you have
            probably had some success at information hiding and loose coupling.
    */


}
