public class Linkedlist{
  private class Node{
    int val;
    Node next;

    public Node(){}
    public Node(int val){
      this.val=val;
    }
  }

  Node head;

  public Linkedlist(){}
  public Linkedlist(int val){
    this.head=new Node(val);
  }

  public Node prepend(int val){
    if (head==null){
      head=new Node(val);
      return head;
    }

    Node newNode=new Node(val);
    newNode.next=head;

    head=newNode;
    return head;
  }
  public Node append(int val){
    if (head==null){
      head=new Node(val);
      return head;
    }

    Node curr=head;
    while (curr.next!=null){
      curr=curr.next;
    }

    curr.next = new Node(val);
    return curr.next;
  }
  public void pop(){
    if (head==null){
      return;
    }
    head=head.next;
  }
  public void rpop(){
    if (head==null){
      return;
    }
    Node curr=head;
    while (curr.next.next!=null){
      curr=curr.next;
    }

    curr.next=null;
  }

  public void insert(Node prevNode){
    if (prevNode==null){
      return;
    }
    
  }

  public int size(){
    Node curr=head;
    int count=0;
    while (curr!=null){
      count++;
      curr=curr.next;
    }
    return count;
  }

  /*public Node insert(Node prevNode, int val){
      if (prevNode==null){
          prevNode=new Node(val);
          return prevNode;
      }

      Node temp=node;

      Node sentinel=new Node();
      sentinel.next=head;

      Node prev = sentinel;
      Node curr = head;

      for (int i=0;i<index;i++){
          prev=prev.next;
          curr=curr.next;
      }

  }*/

  public void push(int val){
    Node current=head;
    while (current!=null){
      current=current.next;
    }
    current.val=val;
    current.next=new Node();
  }

  public String toString(){
    String llist="";
    Node curr=head;
    while (curr!=null){
      llist+=curr.val+" ";
      curr=curr.next;
    }
    return llist;
  }
  public static void main(String[] args){
    Linkedlist llist= new Linkedlist();
    llist.append(5);
    llist.append(4);
    llist.prepend(3);
    llist.pop();
    llist.append(7);
    
    System.out.println(llist);
    System.out.println(llist.size());

  }
}
