import java.util.*;
class ShortestSuperstring {
    public static String shortestSuperstring(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]); // Start with the first word
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            boolean foundOverlap = false;
            // Check for overlap between the last added word and current word
            for (int j = result.size() - 1; j >= 0; j--) {
                String lastWord = result.get(j);
                // Try to find the maximum overlap
                String overlapped = getOverlap(lastWord, currentWord);
                // If overlap is found, replace last word with overlapped version
                if (overlapped != null) {
                    result.set(j, overlapped);
                    foundOverlap = true;
                    break;
                }
            }
            // If no overlap found, just add the current word as is
            if (!foundOverlap) {
                result.add(currentWord);
            }
        } // Join all words in the result list to form the shortest superstring
        StringBuilder sb = new StringBuilder();
        for (String word : result) {
            sb.append(word);
        }
        return sb.toString();
    } // Function to find maximum overlap and return combined string
    private static String getOverlap(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length(); // Check possible overlap lengths
        for (int i = Math.min(len1, len2); i >= 0; i--) {
            if (len1 >= i && s1.substring(len1 - i).equals(s2.substring(0, i))) {
                return s1 + s2.substring(i);
            }
        }

        return null; // No overlap found
    }
    public static void main(String[] args) { // Example usage:
    String[] words1 = {"Alex", "loves", "iamneo"};
    String result1 = shortestSuperstring(words1);
    System.out.println("The shortest superstring is: " + result1); // Expected output: Alexiamneoloves
        String[] words2 = {"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        String result2 = shortestSuperstring(words2);
        System.out.println("The shortest superstring is: " + result2); // Expected output: gctaagttcatgcatc
        String[] words3 = {"algorithm", "math", "athlete", "letechnique"};
        String result3 = shortestSuperstring(words3);
        System.out.println("The shortest superstring is: " + result3); // Expected output: algorithmathletechnique
        }
}