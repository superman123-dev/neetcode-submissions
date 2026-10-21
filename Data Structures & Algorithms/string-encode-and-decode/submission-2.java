class Solution {

    public String encode(List<String> strs) {
        String word = "";
        for(String words: strs){
            int len = words.length();
            word += len + "#" + words;
        }
        System.out.println(word);
        return word;


    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        String numcreate = "";
        for(int i = 0; i < str.length(); i++){
            char check = str.charAt(i);
            if(Character.isDigit(check)){
                numcreate += check;
            
            } else if(check == '#') {
                int num = Integer.parseInt(numcreate);
                String word = "";
                for(int j = i + 1; j < i + num + 1; j++){
                    word += str.charAt(j);
                }
                i += word.length();
                decode.add(word);
                numcreate = "";
            }
        }
        
        return decode;
    }
}
