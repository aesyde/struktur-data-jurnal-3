public class SinglyLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    public SinglyLinkedList() {
        head = tail =null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void inputDiAwal(E input) {
        Node<E> newNode = new Node<E>(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void inputDiAkhir(E input) {
        Node<E> newNode = new Node<E>(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void hapusDiAwal() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void hapusDiAkhir() {
        if (head == tail) {
            head = tail = null;
        } else {
          Node<E> iterator = head;
          
          while (iterator.next != tail) {
              iterator = iterator.next;
          }

          tail = iterator;
          iterator.next = null;
        }      
    }

    public void print () {
        if (isEmpty()) {
            System.out.println("list kosong");
            return;
        }

        Node<E> iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}