
class Counter{
    int count;
    public synchronized void Increment(){
        count++;
    }
}
public class Multiplethread {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

            Runnable obj1= ()-> {

                        for (int i = 1; i <= 10000; i++) {
                            c.Increment();
                        }

            };
            Runnable obj2=()->{
                    for(int i=1;i<=10000;i++){
                        c.Increment();
                    }

            };
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);

            t1.run();
            t2.run();
            t1.join();
            t2.join();
        System.out.println(c.count);
    }
}
