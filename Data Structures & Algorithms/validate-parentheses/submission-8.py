class Solution:
    def isValid(self, s: str) -> bool:
        isValid = False
        stack = []

        if s == "" or s.startswith((")", "}", "]")):
            return isValid
        
        for i in s:
            if i in "({[":
                stack.append(i)
            elif stack:
                if stack[-1] == "[" and i == "]":
                    stack.pop()
                elif stack[-1] == "{" and i == "}":
                    stack.pop()
                elif stack[-1] == "(" and i == ")":
                    stack.pop()   
                else:
                    return False
            elif i in "}])":
                return False

        if not stack:
            return True
        else:
            return False

        