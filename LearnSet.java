import java.util.*;

class School{
    String name;
    int address;
    public School(String name,int address){
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "School{ "+"name:"+name+", address:"+address+" }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return address == school.address && Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
public class LearnSet {
    public static void main(String[] args){
//        Set<Integer> roll=new HashSet<>();
//        roll.add(34);
//        roll.add(51);
//        roll.add(26);
//        roll.add(60);
//        roll.add(47);
//        roll.add(92);//has genrate hunxa backend ma new element rakxa repeatation audaina has vlaue compare garxa
//        System.out.println(roll);
//        System.err.println(roll.remove(26));
//        System.out.println(roll.contains(92));
//        System.out.println(roll.isEmpty());
//        Set<Integer> roll=new LinkedHashSet<>();
//        Set<Integer> roll=new TreeSet<>();//set and shorted in order
//        roll.add(33);
//        roll.add(87);
//        roll.add(12);
//        roll.add(60);
//        System.out.println(roll);
        Set<School> obj1=new HashSet<>();
        obj1.add(new School("abc",221));
        obj1.add(new School("citycentre",233));
        obj1.add(new School("newTown",44));
        System.out.println(obj1);


    }
}
