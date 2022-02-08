
/**
 * a. boolean empty() – Tests if stack is empty
b. E peek() – Looks at the object at the top of the stack without
removing it.
c. E pop() – Removes the object at the top of the stack and returns
the object as the value of this function.
d. E push(E item) – Pushes an item onto the top of the stack.
e. int search(Object o) – Returns the distance from the top of the
stack of the occurrence that is nearest the top of the stack. The topmost item is considered to be at distance 1; the next item is at distance 2; etc..
 *
 * @ChristianHollar
 * @10/11
 */
public class MyStack<E> implements StackInterface<E>
{
    // instance variables - replace the example below with your own

    public class Node{
        public E value;
        public Node next;
        
        public Node(E value)
        {
            this.value=value;
            next=null;
        }
    }
    
    public Node tOS;

    /**
     * Constructor for objects of class MyStack
     */
    public MyStack()
    {
        this.tOS=null;
    }

    /*
     * isEmpty()
     * 
     * if top of stack is equal to null then empty node
     */
    
    public boolean isEmpty()
    {
        return (tOS.value == null);
    }
    
    /*
     * reveals top of stack
     */
   
    public E peek()
    {
        return tOS.value;
    }
    /*
     * removes back value
     */
    public E pop()
    {
        E value = null;
        if(!isEmpty()){
           tOS = tOS.next;
           value = tOS.value;
        }
        return value;
    }
    /*
     * adds new value to front
     */
    public void push(E value)
    {
        Node temp = new Node(value);
        if(isEmpty()){
            tOS=temp;
        }
        else {
            temp.next = tOS;
            tOS=temp;
        }
    }
    /*
     * reveals location of value input
     */
    public int search(Object o)
    {
        int i = 1;
        Node temp = tOS;
        while(temp!=null)
        {
            if(o == null)
            {
                if(isEmpty())
                return i;
            }
            else
            {
                if(o.equals(temp)){
                    return i;
                }
            }
            temp = temp.next;
            i++;
        }
        return -1;
        
    }
}
