
public class Node {


 private String name = "";
 private Node next;
 
 public Node( String name) {
  this.name = name;
  this.next = null;
 }
 
 public Node getNext() {
  return next;
 }

 public void setNext(Node node) {
  this.next = node;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
 
 public String toString() {
  return " Name : "+this.name;
 }
}
