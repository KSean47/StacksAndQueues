public class StackQueueMain
{
  
  public static void main(String args[])
  {
  Stack fruits = new Stack();
  
  Node f1 = new Node(1, "Apple");
  Node f2 = new Node(2, "Banana");
  Node f3 = new Node(3, "Grapes");
  Node f4 = new Node(4, "Pineapple");
  
  fruits.push(f1);
  fruits.push(f2);
  fruits.push(f3);
  fruits.push(f4);
  
  fruits.print();
  
  fruits.pop();
  fruits.print();
  
  Queue animals = new Queue();
  
  Node a1 = new Node(1, "Cats");
  Node a2 = new Node(2, "Dogs");
  Node a3 = new Node(3, "Birds");
  Node a4 = new Node(4, "Turtles");
  
  animals.enqueue(a1);
  animals.enqueue(a2);
  animals.enqueue(a3);
  animals.enqueue(a4);
  
  animals.print();
  
  animals.dequeue();
  animals.print();
  
  Queue emptyQ = new Queue();
  Stack emptyS = new Stack();
  
  //fruits.StackToQueue(fruits, emptyQ);
  //emptyQ.print();
  
  fruits.StackToStack(fruits, emptyS);
  emptyS.print();
  
  
  
  }
  
}