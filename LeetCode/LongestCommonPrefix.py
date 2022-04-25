#14
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        n=len(strs)
        if n==1:
            return strs[0]
        prefix=min(strs,key=len)
       
        if len(prefix)==0:
            return ""
       
        for i in range(n):
            for j in range(len(prefix)):
                if strs[i][j]!=prefix[j]:
                    prefix=prefix[0:j]
                    break
        return prefix
