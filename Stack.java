public class Stack{

  private Node top = null;
 
  
  public void print()
  {
      Node current = this.top;
      while(current != null)
      {
        System.out.println(current.toString());
        current = current.getNext();
      }
      System.out.println("");
  }
  
  public boolean isEmpty() 
  {
    return this.top==null;
  }
  
  public void push(Node newNode) 
  {
    newNode.setNext(this.top);
    this.top = newNode;
  }
  
  public Node pop()
  {
    if (this.isEmpty())
    {
      return null;
    }
    else 
    {
      Node current = this.top;
      this.top = top.getNext();
      return current;
    }
  }
  
  public Node peek() 
  {
    return this.top;
  }

  public void StackToQueue(Stack s1, Queue q1)
  {
    Node current = s1.top;
    while (current != null)
    {
       while(!s1.isEmpty())
     {
       Node a = (Node) s1.pop();
       q1.enqueue(a);
     }
     current = current.getNext();
    }
 
      
  }
  
   public void StackToStack(Stack s1, Stack s2)
  {
     Node current = s1.top;
    while (current != null)
    {
       while(!s1.isEmpty())
     {
       Node a = (Node) s1.pop();
       s1.push(a);
     }
     current = current.getNext();
    }
  }
}