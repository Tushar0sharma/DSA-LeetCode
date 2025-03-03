import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false; // Prevent index out-of-bounds

        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                if (!seen.add(words[i])) return false; // Prevent different keys mapping to the same word
                map.put(ch, words[i]);
            } else {
                if (!map.get(ch).equals(words[i])) return false;
            }
        }
        return true;
    }
}
