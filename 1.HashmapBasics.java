import java.util.HashMap;
import java.util.Map;

class HashmapBasics {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        mp.put("aa",1);
        mp.put("bb",2);
        System.out.println(mp.get("aa"));

        //check key is present or not
        System.out.println(mp.containsKey("bb"));

        //check the key is present or not if key will present then it will do nothing otherwise store the new entry
        mp.putIfAbsent("bb",3);
        mp.putIfAbsent("cc",4);

        //print all entries
        System.out.println(mp.entrySet());

        //print all the keys
        for(String s:mp.keySet()){
            System.out.println(s);
        }

        //print all the values
        for(int v:mp.values()){
            System.out.println(v);
        }

        // print key value pair
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("key = %s and value=%d\n",e.getKey(),e.getValue());
        }
        //            OR
        for(var e:mp.entrySet()){
            System.out.printf("key = %s and value=%d\n",e.getKey(),e.getValue());
        }
    }
}
