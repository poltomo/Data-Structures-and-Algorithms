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

  public Node insert(Node node, int val){
      if (node==null){
          node=new Node(val);
          return node;
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

  }

  public void push(int val){
    Node current=head;
    while (current.val!=null){
      current=current.next;
    }
    current.val=val;
    current.next=new Node();
  }

  public void pop(){
    Node current=head;
    while (current.next.val!=null){
      current=current.next;
    }
    current.val=null;
    current.next=null;
  }

  public void print(){
    Node current=head;
    while (current.val!=null){
      System.out.println(current.val);
      current=current.next;
    }
  }
  /*
  public int getValue(int index){
    Node current=head;
    i=0;
    while (current.val!=null){
      System.out.println(current.val);
      current=current.next;
    }
  }
  */


  public static void main(int[] args){
    Linkedlist llist= new Linkedlist();
    llist.push("bob");
    llist.push("joe");
    llist.push("tom");
    llist.pop();
    llist.print();

    System.out.println();

    System.out.println(llist.head);
    System.out.println(llist.head.val);

    System.out.println(llist.head.next);
    System.out.println(llist.head.next.val);

    System.out.println(llist.head.next.next);
    System.out.println(llist.head.next.next.val);

    System.out.println(llist.head.next.next.next);
  }
}
