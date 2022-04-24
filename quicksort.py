def quicksort(arr):
    qs(arr,0,len(arr)-1)

def qs(arr,l,r):
    if l>=r:
        return
    p=partition(arr,l,r)

    qs(arr, l, p-1)
    qs(arr, p+1, r)

def partition(arr,l,r):
    pivot=arr[r]
    i=l-1

    for j in range(l,r):
        if arr[j]<pivot:
            i+=1
            arr[i], arr[j] = arr[j], arr[i]
    arr[r], arr[i+1] = arr[i+1], arr[r]
    return i+1




arr=[1,4,7,9,2,3,5,6,8]
quicksort(arr)
print(arr)