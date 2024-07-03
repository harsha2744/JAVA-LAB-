import java.lang.*;  
  
public class ThreadPriorityDemo extends Thread   
{  
    public void run()  
    {  
    System.out.println("Inside run : "+Thread.currentThread().getName() +" : "+Thread.currentThread().getPriority());  
    }  
  
    public static void main(String args[])  
    {  
    ThreadPriorityDemo th1 = new ThreadPriorityDemo();  
    ThreadPriorityDemo th2 = new ThreadPriorityDemo();  
    ThreadPriorityDemo th3 = new ThreadPriorityDemo(); 
    th1.setName("First");
    th2.setName("Second");
    th3.setName("Third");
    
    th1.setPriority(MIN_PRIORITY);  
    th2.setPriority(NORM_PRIORITY);  
    th3.setPriority(MAX_PRIORITY);

    th1.start();
    th2.start();
    th3.start();    
    }  
}  