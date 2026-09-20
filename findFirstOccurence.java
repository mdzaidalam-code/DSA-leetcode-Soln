class findFirstOccurence {
    public static void main(String[] args) {

        String haystack = "dbsadsadd";
        String needle = "sad";
        
        strStr(haystack, needle);
    }

    public static int strStr(String haystack, String needle) {
        int j = needle.length();
        int k = haystack.length();

        for (int i = 0; i <= k - j; i++) {
            if (haystack.substring(i, j + i).equals(needle)) {
                System.out.println(i);
            }
        }

        return -1;
    }
}