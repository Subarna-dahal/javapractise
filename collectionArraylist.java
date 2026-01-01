import java.util.*;

public class collectionArraylist {
    public static void main(String[] args) {
        Map<Integer, String> names = new LinkedHashMap<Integer, String>();
        names.put(1, "Subarna");
        names.put(2, "Beena");
        names.put(3, "sudharshan");
        System.out.println("using forEacH LOOP WE GET:");
        names.forEach((key, value) -> System.out.println(key + ":" + value));

        System.out.println("\n ====Using forEach loop we get with Entryset");
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("key:" + entry.getKey() + ",Value:" + entry.getValue());
        }
        System.out.println("\n === Using forEach loop we get on keyset");
        for (Integer key : names.keySet()) {
            System.out.println(key + ":" + names.get(key));
        }
        System.out.println("\n ==== using Itterator");
        Iterator<Map.Entry<Integer, String>> iterator = names.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
