

public class Queue {
 Node front = null;

 public void enqueue(Node node){
  if(node == null){
   return;
  }
      if (front ==null){
       front=node;
    }
     else{
       Node temp = front;
       while(temp.getNext() != null){         
         temp = temp.getNext();
       }
        
           temp.setNext(node);
          node.setNext(null); 
       
     }
    }
 
 public Node dequeue() {
  if (front == null) {
   return null;
  }
  Node temp = front;
  front = front.getNext();
  temp.setNext(null);
  return temp;

 }

 public Node peek() {
  if (front == null) {
   return null;
  }

  Node temp = new Node(front.getName());
  return temp;
 }

}