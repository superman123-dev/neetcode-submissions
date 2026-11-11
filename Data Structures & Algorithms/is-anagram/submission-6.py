class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        hashmap = {}

        for i in s:
            hashmap[i] = hashmap.get(i, 0) + 1

        for i in t:
            hashmap[i] = hashmap.get(i, 0) - 1
        
        return all(i == 0 for i in hashmap.values())

        
             
        