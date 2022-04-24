# returns index of given number, or -1 if not present in array
def binarySort(sortedList,x):
  min=0
  max=len(sortedList)-1
  mid=0
  while min<=max:
    mid=(max+min)//2
    if sortedList[mid]<x:
      min=mid+1
    elif sortedList[mid]>x:
      max=mid-1
    else:
      return mid
  return -1


#                [0 1 2 3 4 5 6 7] 
print(binarySort([1,2,3,4,5,6,7,8] , 5))