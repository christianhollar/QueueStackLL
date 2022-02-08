
/**
 * a. E add(E item) – Inserts the specified element into the queue.
b. E peek() – Retrieves, but does not remove, the head of the
queue.
c. E remove() – Retrieves and removes the head of the queue.
 *
 * @Chrsitian Hollar
 * @10/11
 */
public class MyQueue<E> implements QueueInterface<E>
{
    /*
     * node class
     */
    public class Node{
        public E item;
        public Node next;
        
        public Node()
        {
            this.item=item;
            next=null;
        }
    }
    
    public Node front,rear;
    public int size;
    public MyQueue()
    {
       front = null;
       rear = null;
       size = 0;
    }
    /*
     * adds input value through new node creation
     */
    public E add(E item)
    {
        Node temp = rear;
        rear = new Node();
        rear.item = item;
        rear.next = null;
        if(size == 0)
        {
           front = rear; 
        }
        else
        {
            temp.next = rear;
        }
        size++;
        E x = front.item;
        return null;
    }
    /*
     * top value revealed
     */
    public E peek()
    {
        E x = front.item;
        return x;
    }
    /*
     * removes front value using temporary E
     */
    public E remove()
    {
        E temp = front.item;
        front = front.next;
        if(size == 0 ){
            rear = null;
        }
        size--;
        return temp;
    }
}
