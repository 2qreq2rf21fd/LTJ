import java.util.*;

public class CollectionAPIClass {
    public static void main(String[] args) {

        /**
         * ArrayList
         */
       /* ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        System.out.println(strings.get(0));
        strings.remove(0);
        System.out.println(strings.get(0));*/

        /*
        *
         */
        /**
         * LinkedList
         */
       /* LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        System.out.println(list);*/

        /**
         * HashSet
         */
        // HashSet<String> set = new HashSet<>();
        // <String> set = new LinkedHashSet<>();
       /* set.add("1");
        set.add("2");
       // set.add("1");
        System.out.println(set);*/
        /**
         * HashMap
         */
       /* HashMap<String, Integer> map = new HashMap<>();
        map.put("Murza", 22);
        map.put("Petrenko", 22);
        map.put("Murza", 23);
        System.out.println(map);
        //map.clear();
        //System.out.println(map);
        System.out.println(map.get("Murza"));
        System.out.println(map.containsKey("Murza"));*/
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("b", 1);
        map.put("a", 2);
        System.out.println(map);
    }
}
