"""
#1.
#import collections
#llist=collections.deque()

#2.
#from colllection import deque
#llist=deque()

llist.append("bob")
llist.append("tom")
llist.append("sam")
llist.append("lee")


#Stack LIFO -  last in first out
#Queue FIFO - first in first out

# llist.append()        add to right end of list
# llist.appendleft()    add to left end of list

# llist.pop()           remove right-most element
# llist.popleft()       remove left-most element

print(llist)
print(llist[0])
print(llist[-1])
"""

# ___________
#/ varun     \
#\           /
# -----------
#            ^__^
#            (oo)\_______
#            (__)\       )\/\
#                ||----- |
#                ||     ||

class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Linkedlist:
    def __init__(self):
        self.head=None

    def __iter__(self):
        node=self.head
        while node is not None:
            yield node
            node=node.next

    def __repr__(self):
        rep=""
        for node in self:
            rep+=node.data+","
        rep+="null"
        return rep

    def __getitem__(self,index):
        node=self.head
        count=0
        while (node is not None) and count<index:
            node=node.next
            count+=1;
        return node.data

    def enqueue(self, data):
        if self.head is None:
            self.head=Node(data)
            return

        for current in self:
            pass
        current.next=Node(data)

    def dequeue(self):
        if self.head is None:
            return

        temp=self.head
        self.head=self.head.next
        temp=None

    def push(self,data):
        node=Node(data)
        node.next=self.head
        self.head=node


    def pop(self):
        self.dequeue()



    def removeLast(self):
        if self.head is None:
            return
        if self.head.next is None:
            self.head=None
            return

        node=self.head
        while node.next.next is not None:
            node=node.next
        node.next=None


    def print(self):
        for current in self:
            print(current.data)

print("Stack")
stack=Linkedlist()
stack.push("Bob")
stack.push("Tom")
stack.pop()
stack.push("Lee")
stack.push("Sam")
stack.pop()
print(stack)

print("\nQueue")
queue=Linkedlist()
queue.enqueue("Bob")
queue.enqueue("Tom")
queue.enqueue("Lee")
queue.enqueue("Sam")
queue.dequeue()
print(queue)

print("\nsubscript testing")
print(queue[0])
print(queue[1])
print(queue[2])
