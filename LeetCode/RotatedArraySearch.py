# 33
class Solution:
    @staticmethod
    def search(arr, target) -> int:
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
        
        start=min
        min=0
        max=n-1
        if target>=arr[start] and target<=arr[max]:
            min=start
        else:
            max=start-1
        
        while max>=min:
            mid=(max+min)//2
            if target==arr[mid]:
                return mid
            elif target>arr[mid]:
                min=mid+1
            else:
                max=mid-1
        return -1

print(Solution.search([4,5,6,7,0,1,2],0))