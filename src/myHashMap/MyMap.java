package myHashMap;

import java.util.LinkedList;

public class MyMap<K, V> {
    private int count = 16;
    private int count1 = 0;

    private LinkedList<MyEntry<K, V>>[] linkedLists = new LinkedList[count];

    public void put(K key, V val) {
        MyEntry<K, V> myEntry = new MyEntry<>(key, val);
        int index = key.hashCode() % count;
        if (count1 > (count / 4) * 3) {
            count *= 2;
            LinkedList<MyEntry<K, V>>[] linkedLists1 = new LinkedList[count];
            for (int i = 0; i < linkedLists.length; i++) {
                if (linkedLists[i] != null) {
                    for (int j = 0; j < linkedLists[i].size(); j++) {
                        MyEntry<K, V> current = linkedLists[i].get(j);
                        int index1 = current.key.hashCode() % count;
                        if (linkedLists1[index1] == null) {
                            linkedLists1[index1] = new LinkedList<>();
                            linkedLists1[index1].add(current);
                        } else {
                            for (int k = 0; k < linkedLists1[index1].size(); k++) {
                                if (linkedLists1[index1].get(k).key == current.key) {
                                    linkedLists1[index1].get(k).val = current.val;
                                } else {
                                    linkedLists1[index1].add(current);
                                }
                            }
                        }
                    }
                }
            }
            index = key.hashCode() % count;
            linkedLists = linkedLists1;
        }
        if (linkedLists[index] == null) {
            count1++;
            linkedLists[index] = new LinkedList<>();
            linkedLists[index].add(new MyEntry<>(key, val));
            return;
        }
        for (int i = 0; i < linkedLists[index].size(); i++) {
            if (linkedLists[index].get(i).key.equals(myEntry.key)) {
                linkedLists[index].get(i).val = new MyEntry<>(key, val).val;
                return;
            }
        }
        linkedLists[index].add(new MyEntry<>(key, val));
    }

    public V get(K key) {
        int index = key.hashCode() % 16;
        for (int i = 0; i < linkedLists[index].size(); i++) {
            if (linkedLists[index].get(i).key.equals(key)) {
                return linkedLists[index].get(i).val;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        int temp = count1;
        for (int i = 0; i < linkedLists.length; i++) {
            if (linkedLists[i] != null) {
                temp--;
                for (int j = 0; j < linkedLists[i].size(); j++) {
                    if (temp == 0) {
                        result.append(linkedLists[i].get(j).key + "=" + linkedLists[i].get(j).val + "}");
                    } else {
                        result.append(linkedLists[i].get(j).key + "=" + linkedLists[i].get(j).val + ", ");
                    }
                }
            }
        }
        return result.toString();
    }
}