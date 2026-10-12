
class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();

        for (int i = 0; i <= haystack.length() - n; i++) {
            int j;

            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == n) {
                return i;
            }
        }

        return -1;
    }
}
