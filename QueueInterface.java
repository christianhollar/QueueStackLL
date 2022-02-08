
/**
 * Write a description of interface QueueInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface QueueInterface<E>
{
    /**
     * Interface methods to be defined by MyQueue
     */
    E add(E item);
    E peek();
    E remove();
}
