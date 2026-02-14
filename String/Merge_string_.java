package String;
public class Merge_string_ {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "fgh";

        String mergedStr = mergeAlternately(str1, str2);
        System.out.println("Merged String: " + mergedStr);
    }

    public static String mergeAlternately(String str1, String str2) {
        StringBuilder mergedStr = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        // Merge characters alternately
        for (int i = 0; i < minLen; i++) {
            mergedStr.append(str1.charAt(i));
            mergedStr.append(str2.charAt(i));
        }

        // Append remaining characters, if any
        if (len1 > len2) {
            mergedStr.append(str1.substring(minLen));
        } else if (len2 > len1) {
            mergedStr.append(str2.substring(minLen));
        }

        return mergedStr.toString();
    }
}