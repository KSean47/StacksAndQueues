public class Queue{
  
  private Node back = null;
  private Node front = null;
  
  
 
  public void enqueue(Node newNode) {
    if (this.isEmpty()) {
      this.back = newNode;
      this.front = newNode;
    }
    else 
    {
      this.front.setNext(newNode);
      this.back = newNode;
    }
  }
  
  public void print()
  {
      Node current = this.front;
      while(current != null)
      {
        System.out.println(current.toString());
        current = current.getNext();
      }
      System.out.println("");
  }
  
  public boolean isEmpty() 
  {
    return this.back==null;
  }

  public Node dequeue()
  {
    if (this.isEmpty())
    {
      return null;
    }
    else 
    {
      Node current = this.front;
      this.back = back.getNext();
      this.front = null;
      return current;
    }
  }
  
  public Node peek() 
  {
    return this.back;
  }
  
  public void QueueToStack(Queue q1, Stack s1)
  {
    
  }

}