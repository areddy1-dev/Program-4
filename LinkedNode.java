

public class LinkedNode
{
   private int data; // data of the node
   private LinkedNode next; // links to next node
  
   // constructor that initialize the data and sets next to null
   public LinkedNode(int data)
   {
       this.data = data;
       next = null;
   }
  
   // constructor that initialize the data and next
   public LinkedNode(int data, LinkedNode next)
   {
       this.data = data;
       this.next = next;
   }
  
   // getters
   public int getData()
   {
       return data;
   }
  
   public LinkedNode getNext()
   {
       return next;
   }
  
   // setters
   public void setData(int data)
   {
       this.data = data;
   }
  
   public void setNext(LinkedNode next)
   {
       this.next = next;
   }
}

