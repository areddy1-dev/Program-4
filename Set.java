
public class Set
{
   private LinkedNode head; // start node of the list
  
   // constructor to creates an empty set
   public Set()
   {
       head = null;
   }
  
   // method to insert x into the list
   public void add(int x)
   {
       if(!exists(x)) // x is not in list
       {
           // creates a new node with data as x and next as head
           LinkedNode node = new LinkedNode(x, head);
           head = node; // make node the new head
       }
   }
  
   // method to delete the data x from the set
   public void delete(int x)
   {
       LinkedNode curr = head;
       LinkedNode prev = null;
      
       // loop over the set until we find the node with data as x
       while((curr != null) && (curr.getData() != x))
       {
           prev = curr;
           curr = curr.getNext();
       }
      
       // x in list
       if(curr != null)
       {
           if(prev == null) // x is the head node
               head = head.getNext();
           else // deletes the current node
               prev.setNext(curr.getNext());
       }
   }
  
   // method that returns true if x is in the list else return false
   public boolean exists(int x)
   {
       LinkedNode curr = head; // set current node to head
      
       // loop over the set until we find the node with data as x
       while(curr != null)
       {
           if(curr.getData() == x ) // x found, return true
               return true;
           curr = curr.getNext();
       }
      
       return false; // x not in set
   }
  
   // method to return String representation of the Set
   public String toString()
   {
       String str = ""; // set string to empty string
       LinkedNode curr = head; // set current node to head
      
       // loop over the set appending the data at current node to end of string with a space at the end
       while(curr != null)
       {
           str += curr.getData()+" ";
           curr = curr.getNext();
       }
      
       return str;
   }
}