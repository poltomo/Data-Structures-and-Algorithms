public class Linkedlist{
  Node head;

  private class Node{
    String data;
    Node next;
    public Node(){
      this.data=null;
      this.next=null;
    }
    public Node(String data){
      this.data=data;
      this.next=null;
    }
  }

  public Linkedlist(){
    this.head=new Node();
  }

  public Linkedlist(String data){
    this.head=new Node(data);
  }

  public void push(String data){
    Node current=head;
    while (current.data!=null){
      current=current.next;
    }
    current.data=data;
    current.next=new Node();
  }

  public void pop(){
    Node current=head;
    while (current.next.data!=null){
      current=current.next;
    }
    current.data=null;
    current.next=null;
  }

  public void print(){
    Node current=head;
    while (current.data!=null){
      System.out.println(current.data);
      current=current.next;
    }
  }
  /*
  public String getValue(int index){
    Node current=head;
    i=0;
    while (current.data!=null){
      System.out.println(current.data);
      current=current.next;
    }
  }
  */


  public static void main(String[] args){
    Linkedlist llist= new Linkedlist();
    llist.push("bob");
    llist.push("joe");
    llist.push("tom");
    llist.pop();
    llist.print();

    System.out.println();

    System.out.println(llist.head);
    System.out.println(llist.head.data);

    System.out.println(llist.head.next);
    System.out.println(llist.head.next.data);

    System.out.println(llist.head.next.next);
    System.out.println(llist.head.next.next.data);

    System.out.println(llist.head.next.next.next);
  }
}
