class Solution:
    def makeStringsEqual(self, s: str, target: str) -> bool:
        if s == target:
            return True
        n = len(s)
        if( s == '0'*n or target == '0'*n):
            return False

        return True
