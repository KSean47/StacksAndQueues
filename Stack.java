
public class Stack{
  Node top=null ;
  
  public void push(Node newnode){
  if(top == null){
    top = newnode;
  }
  else{
   newnode.setNext(top);
   top = newnode;
  }
  }
  
  public Node pop(){
    if(top == null){
      return null;
    }
    Node temp = top;    
    top = top.getNext();
    temp.setNext(null);
      return temp;
  }
  
  public Node peek(){
    if(top == null){
      return null;
    }
   Node temp = new Node(top.getName());
    return temp;
  }
  
}