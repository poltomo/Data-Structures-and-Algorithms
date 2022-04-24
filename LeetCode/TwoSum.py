class Solution:
  def __init__(self, arr=[], dat={}):
    self.arr=arr
    self.dat=dat

  def twoSum1(self, target):
    for i in range(len(self.arr)):
      for j in range(i+1,len(self.arr)):
        if self.arr[i]+self.arr[j]==9:
          return [i,j]

  def twoSum2(self, target):
    for i in range(len(self.arr)):
      complement=target-self.arr[i]
      if complement in self.dat:
        return [self.dat[complement],i]
      else:
        self.dat[self.arr[i]]=i

  def twoSum3(self, target):
    for i,num in enumerate(self.arr):
      val=target-num
      if val in self.dat:
        return [self.dat[val],i]
      self.dat[num]=i
    
        
        
    


solution=Solution([2,7,11,15])
print(solution.twoSum2(9))
