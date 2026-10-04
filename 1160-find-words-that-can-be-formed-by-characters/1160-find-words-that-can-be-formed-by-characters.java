class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        int[] Cfreq = new int[26];

        for(char ch : chars.toCharArray()){
            Cfreq[ch - 'a']++;
        }

        for(String s : words){
            int[] freq = new int[26];
            boolean valid = true;

            for(char ch : s.toCharArray()){
                freq[ch - 'a'] ++;
                if(freq[ch - 'a'] > Cfreq[ch - 'a']){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans += s.length();
            }
        }
        return ans; 
    }
}