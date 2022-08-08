import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyStack {
    public static void main(String[] args){
        String name = "lớp này là lớp master về java nhé";
        System.out.println(name);
        name = name.replace(",","");
        String[] arr = name.split(" ");
        String key = "";
        Integer value;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i ++){
            key = arr[i];
            if (map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value +1);
            }else {
                map.put(key, 1);
            }
        }
        Set set = map.keySet();
        Iterator i =set.iterator();

        while (i.hasNext()){
            key=(String)i.next();
            System.out.println("Từ " + key + " xuất hiện " + map.get(key) + " lần");
        }
    }
}
