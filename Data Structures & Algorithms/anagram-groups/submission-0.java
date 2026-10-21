class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> group = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int[] charnum = new int[26];

            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);
                charnum[c - 'a']++;

            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < charnum.length; j++) {
                sb.append(charnum[j]);
                sb.append("#");
            }
            String key = sb.toString();

            if(!group.containsKey(key)){
                List<String> listt = new ArrayList<>();
                listt.add(word);
                group.put(key, listt);
            } else {
                group.get(key).add(word);
            }
              
            
        }

        for(List<String> words: group.values()) {
            groupAnagrams.add(words);
        }
        return groupAnagrams;

    }
}
