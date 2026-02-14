#include <stdio.h>
#include <string.h>

// Function to merge two strings alternately
void mergeAlternately(char *str1, char *str2) {
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    int minLen = (len1 < len2) ? len1 : len2;
    int i;

    // Merge characters alternately
    for (i = 0; i < minLen; i++) {
        printf("%c%c", str1[i], str2[i]);
    }

    // Print remaining characters, if any
    if (len1 > len2) {
        printf("%s", str1 + minLen);
    } else if (len2 > len1) {
        printf("%s", str2 + minLen);
    }
}

int main() {
    char str1[] = "abc";
    char str2[] = "fgh";

    printf("Merged String: ");
    mergeAlternately(str1, str2);
    printf("\n");

    return 0;
}