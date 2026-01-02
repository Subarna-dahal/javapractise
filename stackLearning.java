import java.util.Stack;

public class stackLearning {
    public static void main(String[] args) {
        Stack<Integer> names = new Stack<Integer>();
        names.push(1);
        names.push(2);
        names.push(3);
        names.push(4);
        System.out.println(names);
        System.out.println(names.pop());
        System.out.println(names.peek());
        System.out.println("\n === each value for the stack");
        for (Integer a : names) {
            System.out.println(a);
        }
    }
}
