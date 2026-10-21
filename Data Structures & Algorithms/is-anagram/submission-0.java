class Solution {
    public boolean isAnagram(String s, String t) {

       
        if(t.length() != s.length()) {
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            arr[letter - 'a']++;
        
        }
        
        for(int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            arr[letter - 'a']--;
        }

        for(int i = 0; i < arr.length; i++){
            int index = arr[i];
            if(index != 0){
                return false;
            }
        }

        return true;

    }
}
