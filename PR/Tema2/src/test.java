import java.util.*;

public class test {

    public static void main(String[] args) {

        
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c")); 
        System.out.println(list.get(0));
        list.add("o");
        System.out.println(list.get(3));
        list.get(0);
        System.out.println(list.indexOf("a"));

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "hola");
        System.out.println(map.get(10));

    }
}
