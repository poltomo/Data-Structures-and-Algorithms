class Solution:
    def search(self, arr, target) -> int:
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
            max=start
        
        while max>=min:
            mid=(max+min)//2
            if target==arr[mid]:
                return mid
            elif target>arr[mid]:
                min=mid+1
            else:
                max=mid-1
        return -1


solution=Solution()
print(solution.search([0,1,2,3,4,5,6],0))