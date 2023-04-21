package example;

public class CustomCounter implements Runnable{
    private int val = 0;  
    public void increment() {   
        val++;  
    }

    public void decrement() {      
        val--;  
    }  
    public int getValue() {  
        return val;  
    }  
    
    @Override  
    public void run() {
        //incrementing  
        this.increment();  
        System.out.println("Value for Thread after increment: " + Thread.currentThread().getName() + " " + this.getValue());  
        //decrementing  
        this.decrement();  
        System.out.println("Value for Thread after decrement: " + Thread.currentThread().getName() + " " + this.getValue());          
    }  
}  

