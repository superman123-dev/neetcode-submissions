class Solution {
    public boolean isPalindrome(String s) {
        

        boolean isPalindrome = true;
        String word1 = "";
        String word2 = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                    word1 += s.charAt(i);
                }
            }
        }

        System.out.println(word1);

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                    word2 += s.charAt(i);
                }
            }
        }
        System.out.print(word2);
        
        for(int i = 0; i < word1.length(); i++){
            if(!word1.equalsIgnoreCase(word2)){
                isPalindrome = false;
            }
        }
        


        return isPalindrome;
    }
}
