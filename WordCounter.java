import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String str = "Java is a programming language Java is widely used";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the string into words
        String[] words = str.split(" ");
        
        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word is already present in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }
        
        // Display the word count
        System.out.println("Word count in the string:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
