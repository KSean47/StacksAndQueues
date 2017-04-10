public class StacksandQueuesDemo {
  
  public static void main(String[] args) {
                  
        Stack st = new Stack();
        Stack stnew = new Stack();
        Queue queue = new Queue();
         createStack(stnew);
         createStack(st);
         System.out.println("printing fruits");
         printStack(stnew);
         System.out.println(); 
         System.out.println("moveing stack to the queue then printing queue");
         stackToqueue(st,queue);
         printQueue(queue);       
         createQueue(queue);  
         System.out.println(); 
         System.out.println("Moving from queue to stack");
         System.out.println("Printing");
         queueToStack(queue,st);        
         printStack(st);
         createStack(st);
         stackTostack(st, stnew);
         System.out.println(); 
         System.out.println("Moving to another stack");
         printStack(stnew);
                  
   }
  public static void createQueue(Queue queue){
         Node node = new Node("apple");
         Node node2 = new Node("banana");
         Node node3 = new Node("mango");
         Node node4 = new Node("grapes");
         Node node5 = new Node("peach"); 
         queue.enqueue(node);
         queue.enqueue(node2);
         queue.enqueue(node3);
         queue.enqueue(node4);
         queue.enqueue(node5);
    
  }
   public static void createStack(Stack stack){
         Node node = new Node("apple");
         Node node2 = new Node("banana");
         Node node3 = new Node("mango");
         Node node4 = new Node("grapes");
         Node node5 = new Node("peach"); 
         stack.push(node);
         stack.push(node2);
         stack.push(node3);
         stack.push(node4);
         stack.push(node5);
  }
  public static void stackTostack(Stack stack, Stack emptyStack){
   Stack temp = new Stack();
   while(stack.peek() != null){
    temp.push(stack.pop());
   }
   while (temp.peek() != null){
    emptyStack.push(temp.pop());
   }
   
  }
 
  
   public static void stackToqueue(Stack stack , Queue queue){
 
    while(stack.peek() !=null){
      queue.enqueue(stack.pop());
    }
    
  }
  public static void queueToStack(Queue queue, Stack stack){
   while(queue.peek() != null){
    stack.push(queue.dequeue());
   }
  }
 
  public static void printQueue(Queue queue){
     while(queue.peek() != null){
           System.out.println(queue.dequeue());
         } 


}
  public static void printStack(Stack stack){
     while(stack.peek() != null){
           System.out.println(stack.pop());
         } 
  }
  
}