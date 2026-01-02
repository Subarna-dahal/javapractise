import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> roll=new ArrayDeque<Integer>();
        roll.offer(4);
        roll.offer(9);
        roll.offer(1);
        roll.offerFirst(7);
        roll.offerLast(2);
        System.out.println(roll);
        System.out.println(roll.pollFirst());
        System.out.println(roll.peekFirst());
        System.out.println(roll.peekLast());
        System.out.println(roll.pollLast());


    }
}
