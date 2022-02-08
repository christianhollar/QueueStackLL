
/**
 * Write a description of interface StackInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface StackInterface<E>
{
    /**
     * Interface mtethods to be defined by MyStack
     */
    
    public boolean isEmpty();
    
    public E peek();
    
    public E pop();
    
    public void push(E item);
    
    public int search(Object o);
    
}
