class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0;

        // Count vowels in the first window
        for(int i = 0; i < k; i++) {
            if(vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        int max = count;

        // Slide the window
        for(int i = k; i < s.length(); i++) {

            // Remove outgoing character
            if(vowels.indexOf(s.charAt(i-k)) != -1) {
                count--;
            }

            // Add incoming character
            if(vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}