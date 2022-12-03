class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //operations performed in linkedList
    //add operation-first,last

    //add operation on first pos
    public void addFirst(String data){
        Node newNode= new Node(data); //this is for making the new node
        if (head==null) // if new node is null then we have to do nothing
        {
          head=newNode;
          return;
        }
        else if (head!=null){
            newNode.next=head;
            head=newNode;

        }
    }
    //add element at the last pos
    public void addLast(String data){
        if (head==null){
            head=newNode;
            return;
        }
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
    }
//print
   public void printList(){
    if (currNode==null){
        system.out.print('list empty')
        return;
    }
    Node currNode=head;
    while(currNode!=null){
        system.out.print(currNode.data)
        currNode=currNode.next;
    }
    system.out.println('NULL')
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst('a');
        list.addFirst('is')
        list.printList();
    }
}