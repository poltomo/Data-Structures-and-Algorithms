# 33
class Solution:
    @staticmethod
    def findMin(arr) -> int:
        n=len(arr)
        if arr==None or n==0: return -1
        
        min=0
        max=n-1
        
        while min<max:
            mid=(min+max)//2
            if arr[mid]>arr[max]:
                min=mid+1
            else:
                max=mid
        return arr[min]

print(Solution.findMin([3,4,5,1,2])) # 1