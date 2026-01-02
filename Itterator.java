import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itterator {
    public static void main(String[] args){
        List<Integer> roll=new ArrayList<Integer>();
        roll.add(1);
        roll.add(4);
        roll.add(8);
        roll.add(5);
        roll.add(2);
        Iterator<Integer> t1=roll.iterator();
        while (t1.hasNext()){
            System.out.println("Value are :"+t1.next());
        }
        System.out.println(roll.remove(2));
    }
}
