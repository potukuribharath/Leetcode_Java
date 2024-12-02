class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
         int wordIndex = 1; // Words are 1-indexed
        int i = 0; // Pointer for the sentence
        
        while (i < sentence.length()) {
            // Find the start of the next word
            int start = i;
            
            // Move to the end of the current word
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }
            
            // Extract the current word
            String word = sentence.substring(start, i);
            
            // Check if the word starts with searchWord
            if (word.length() >= searchWord.length() && word.startsWith(searchWord)) {
                return wordIndex;
            }
            
            // Move to the next word and skip the space
            wordIndex++;
            i++;
        }
        
        return -1; // No match found
    }
    
}