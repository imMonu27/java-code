import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to char array
        char[] charArray = str.toCharArray();
        
        // Count the occurrences of each character
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                // If the character is already present in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is encountered for the first time, add it to the map with count 1
                charCountMap.put(c, 1);
            }
        }
        
        // Display the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c));
            }
        }
    }
}
