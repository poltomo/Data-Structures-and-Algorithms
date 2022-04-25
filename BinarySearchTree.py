# binary tree:
# at most 2 children per node
# exactly 1 root
# exactly 1 path between root and any node
class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
    
    def insert(self,data):
        if self.data:
            if data < self.data:
                if self.left is None:
                    self.left=Node(data)
                else:
                    self.left.insert(data)
            elif data > self.data:
                if self.right is None:
                    self.right=Node(data)
                else:
                    self.right.insert(data)
        else:
            self.data=data

    def printTree(self,space=0):
        if self.right:
            self.right.printTree(space+2)
        print(space*" ", end="")
        print(self.data)
        if self.left:
            self.left.printTree(space+2)


    


root = Node(27)
root.insert(14)
root.insert(50)
root.insert(40)
root.insert(60)
root.insert(12)
root.insert(15)
root.insert(27)


#print(root.left.data)

root.printTree()

