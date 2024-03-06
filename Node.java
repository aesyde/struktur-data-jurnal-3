public class Node<E> {
    E data;
    Node<E> next;
    public Node(E object){
    data = object;
    this.next = null;
    }
    public E getData(){
    return data;
    }
   }
   