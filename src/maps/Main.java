package maps;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
         HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("1", "7");
        hashMap1.put("2", "5");
        hashMap1.put("3", "6");
        hashMap1.put("4", "9");



        MyMapMethods<String, String> maps = new MyMapMethods<>();
        /*System.out.println(hashMap1);
        System.out.println(maps.copyHashMap(hashMap1));
        System.out.println(maps.myIsEmpty(hashMap1));
        maps.removeAll(hashMap1);
        System.out.println(hashMap1);
        System.out.println(maps.myIsEmpty(hashMap1));
        maps.myKey(hashMap1);
        System.out.println();
        maps.myValue(hashMap1);
        System.out.println();
        maps.myFirstAndLastKey(hashMap1);
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("3","30");
        treeMap.put("1","10");
        treeMap.put("4","40");
        treeMap.put("2","20");
        treeMap.put("5","50");
        maps.myPutTreeMap(treeMap, "6", "60");
        maps.myPutTreeMap(treeMap, "0", "100");
        System.out.println(maps.myCopyTreeMap(treeMap));*/
        System.out.println(hashMap1);
        //System.out.println(maps.myGetKey(hashMap1, "8"));
        maps.myGetKey1(hashMap1,"2");
    }
}
