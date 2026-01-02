import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
     public static void main(String[] args) {
//         Queue<Integer> roll =new LinkedList<Integer>();
//         roll.offer(3);
//         roll.offer(8);
//         roll.offer(5);
//         roll.offer(7);
//         roll.offer(2);
//         System.out.println(roll);
//         System.out.println(roll.peek());
//         System.out.println(roll.remove());
//         System.out.println(roll.element());
         PriorityQueue<Integer> roll=new PriorityQueue<Integer>();
         roll.offer(1);
         roll.offer(5);
         roll.offer(3);
         roll.offer(8);
         roll.offer(4);
         roll.offer(7);
         System.out.println(roll);
         System.out.println(roll.contains(8));
     }


}
