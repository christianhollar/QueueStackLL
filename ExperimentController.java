 import java.util.*;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    // instance variables - replace the example below with your own
    public int numberOfItems;
    public int alength;
    public long myTime;
    
    public static void main(String[] args)
    {
        /*
         * Experiement Controllers to test timing of 
         * stack and queue methods
         */
        ExperimentController e1 = new ExperimentController();
        ExperimentController e2 = new ExperimentController();
        ExperimentController e3 = new ExperimentController();
        System.out.println("myQueueAddExtended"+e1.myQueueAddExtended());
        System.out.println("myQueueRemoveExtended"+e2.myQueueRemoveExtended());
        System.out.println("myQueuePeekExtended"+e3.myQueuePeekExtended());
        
        ExperimentController e4 = new ExperimentController();
        ExperimentController e5 = new ExperimentController();
        ExperimentController e6 = new ExperimentController();
        System.out.println("myStackPushExtended"+e4.myStackPushExtended());
        System.out.println("myStackPopExtended"+e5.myStackPopExtended());
        System.out.println("myStackPeekExtended"+e6.myStackPeekExtended());
        
    }
    

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {
        this.numberOfItems = 10000;
        this.alength = 10;
    }

    /**
     * myQueueAdd, myQueueRemove, and myQueuePeek
     * return time taken for one after 10 element queue
     */
    public long myQueueAdd(){
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyQueue q = new MyQueue();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                q.add(adder);
            }
            Random r1 = new Random();
            int adder = r1.nextInt(100);
            long start = System.currentTimeMillis();
            q.add(adder);
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems);
    }
    
    
    public long myQueueRemove()
    {
        
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyQueue q = new MyQueue();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                q.add(adder);
            }
            long start = System.currentTimeMillis();
            q.remove();
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems);
        
    }
    
    public long myQueuePeek()
    {
       for(int i = 0; i<= numberOfItems; i++)
        {
            MyQueue q = new MyQueue();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                q.add(adder);
            }
            long start = System.currentTimeMillis();
            q.peek();
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems); 
    }
    
    /*
     * myStackPush, myStackPop, myStackPeek
     * 10 element stack - records time of method after creation of stack
     */
    public long myStackPush()
    {
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyStack s = new MyStack();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                s.push(adder);
            }
            Random r1 = new Random();
            int adder = r1.nextInt(100);
            long start = System.currentTimeMillis();
            s.push(adder);
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems);
    }
    
    public long myStackPop()
    {
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyStack s = new MyStack();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                s.push(adder);
            }
            long start = System.currentTimeMillis();
            s.pop();
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems);
    }
    
    public long myStackPeek()
    {
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyStack s = new MyStack();
            for(int j = 0; j <= alength; j++)
            {
                Random r = new Random();
                int adder = r.nextInt(100);
                s.push(adder);
            }
            long start = System.currentTimeMillis();
            s.peek();
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return (myTime/numberOfItems);
    }
    /*
     * extended methods return total time after desired method
     * has been repeated for number of items chosen
     * in constructor
     */
    public long myQueueAddExtended(){
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyQueue q = new MyQueue();
            Random r = new Random();
            int adder = r.nextInt(10000);
            long start = System.currentTimeMillis();
            q.add(adder);
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return this.myTime;
    }
    
    
    public long myQueueRemoveExtended()
    {
        MyQueue q = new MyQueue();
        for(int i = 0; i<= numberOfItems; i++)
        {            
            Random r = new Random();
            int adder = r.nextInt(10000);
            q.add(adder);
        }
        for(int i = 0; i<= numberOfItems; i++)
        {            
            long start = System.currentTimeMillis();
            q.remove();
            long stop = System.currentTimeMillis();
            this.myTime=+(start-stop);
        }
        return this.myTime;        
    }
    
    public long myQueuePeekExtended()
    {
        MyQueue q = new MyQueue();
        for(int i = 0; i<= numberOfItems; i++)
        {            
            Random r = new Random();
            int adder = r.nextInt(10000);
            q.add(adder);
        }
        for(int i = 0; i<= numberOfItems; i++)
        {            
            long start = System.currentTimeMillis();
            q.peek();
            long stop = System.currentTimeMillis();
            q.remove();
            this.myTime=+(start-stop);
        }
        return this.myTime; 
    } 
    
    
    public long myStackPushExtended(){
        for(int i = 0; i<= numberOfItems; i++)
        {
            MyStack s = new MyStack();
            Random r = new Random();
            int adder = r.nextInt(10000);
            long start = System.currentTimeMillis();
            s.push(adder);
            long stop = System.currentTimeMillis();
            //System.out.println("time is"+(start-stop));
            this.myTime=+(start-stop);
        }
        return this.myTime;
    }
    
    
    public long myStackPopExtended()
    {
        
        MyStack s = new MyStack();
        for(int i = 0; i<= numberOfItems; i++)
        {            
            Random r = new Random();
            int adder = r.nextInt(10000);
            s.push(adder);
        }
        for(int i = 0; i<= numberOfItems; i++)
        {            
            long start = System.currentTimeMillis();
            s.pop();
            long stop = System.currentTimeMillis();
            this.myTime=+(start-stop);
        }
        return this.myTime; 
    }
    
    public long myStackPeekExtended()
    {
        
        MyStack s = new MyStack();
        for(int i = 0; i<= numberOfItems; i++)
        {            
            Random r = new Random();
            int adder = r.nextInt(10000);
            s.push(adder);
        }
        for(int i = 0; i<= numberOfItems; i++)
        {            
            long start = System.currentTimeMillis();
            s.peek();
            long stop = System.currentTimeMillis();
            s.pop();
            this.myTime=+(start-stop);
        }
        return this.myTime; 
    }        

}
