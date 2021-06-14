package maps;

import java.util.HashMap;
import java.util.TreeMap;

public class MyMapMethods<K, V> {

    public HashMap<K, V> copyHashMap(HashMap<K, V> hashMap) {
        HashMap<K, V> hashMap1 = new HashMap<>();
        for (K key : hashMap.keySet()) {
            hashMap1.put(key, hashMap.get(key));
        }
        return hashMap1;
    }

    public void removeAll(HashMap<K, V> hashMap) {
        int count = hashMap.size();
        while (count > 0) {
            K key1 = null;
            for (K key : hashMap.keySet()) {
                key1 = key;
            }
            hashMap.remove(key1);
            count--;
        }
    }

    public boolean myIsEmpty(HashMap<K, V> hashMap) {
        return hashMap.size() == 0;
    }

    public void myKey(HashMap<K, V> hashMap) {
        for (K key : hashMap.keySet()) {
            System.out.print(key + " ");
        }
    }

    public void myValue(HashMap<K, V> hashMap) {
        for (K key : hashMap.keySet()) {
            System.out.print(hashMap.get(key) + " ");
        }
    }

    public void myFirstAndLastKey(HashMap<K, V> hashMap) {
        int i = 0;
        for (K key : hashMap.keySet()) {
            i++;
            if (i == 1 || i == hashMap.size()) {
                System.out.print(key + " ");
            }
        }
    }

    public void myPutTreeMap(TreeMap<K, V> treeMap, K key, V val) {
        treeMap.put(key, val);
    }

    public TreeMap<K, V> myCopyTreeMap(TreeMap<K, V> treeMap) {
        TreeMap<K, V> treeMap1 = new TreeMap<>();
        for (K key : treeMap.keySet()) {
            treeMap1.put(key, treeMap.get(key));
        }
        return treeMap1;
    }

   /* public void myReverse(HashMap<K, V> hashMap){
        HashMap<K, V>[] array = new HashMap[hashMap.size()];
        int i = 0;
        for (K key : hashMap.keySet()){
            array[i] = hashMap.
            i++;
        }
    }*/

    public K myGetKey(HashMap<K, V> hashMap, K key){
        for (K key1 : hashMap.keySet()){
           if (key1.hashCode() >= key.hashCode()){
                return key1;
            }
        }
        return null;

    }

    public void myGetKey1(HashMap<K, V> hashMap, K key){
        for (K key1 : hashMap.keySet()){
            if (key1.hashCode() >= key.hashCode()){
                System.out.print(key1 + " ");
            }
        }
    }
}