package myHashSet;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        MySetMethod<Integer> mySetMethod = new MySetMethod<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(6);
        priorityQueue.add(4);
        priorityQueue1.add(1);
        priorityQueue1.add(2);
        priorityQueue1.add(6);
        priorityQueue1.add(5);

        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(9);
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(7);
        hashSet1.add(6);
        treeSet1.add(0);
        treeSet1.add(3);
        treeSet1.add(1);
        treeSet2.add(1);
        treeSet2.add(2);
        treeSet2.add(3);

        System.out.println(hashSet);
        System.out.println(mySetMethod.myGetHashSet(hashSet));
        System.out.println(mySetMethod.myIsEmpty(hashSet));
        System.out.println(mySetMethod.myCloneHashSet(hashSet));
        System.out.println(mySetMethod.myConvertToTreeSet(hashSet));
        System.out.println(mySetMethod.myConvertToArrayList(hashSet));
        System.out.println(mySetMethod.myConvertToList(hashSet));
        System.out.println(mySetMethod.myCompareHashSet(hashSet, hashSet1));
        mySetMethod.myClear(hashSet);
        System.out.println(hashSet);
        mySetMethod.myIterate(mySetMethod.myConvertToTreeSet(hashSet));
        System.out.println(mySetMethod.myGetFirstTreeSet(mySetMethod.myConvertToTreeSet(hashSet)));
        System.out.println(mySetMethod.myGetLastTreeSet(mySetMethod.myConvertToTreeSet(hashSet)));
        System.out.println(mySetMethod.myCloneTreeSet(treeSet1));
        System.out.println(mySetMethod.myGetTreeSet(treeSet1));
        System.out.println(treeSet1);
        System.out.println(mySetMethod.myCompareTreeSet(treeSet1, treeSet2));
        mySetMethod.myFindTreeSet(treeSet1, 2);
        System.out.println(mySetMethod.myRemoveTreeSet(treeSet1,0));
        mySetMethod.myIteratePriorityQueue(priorityQueue);
        System.out.println(mySetMethod.myComparePriorityQueue(priorityQueue1, priorityQueue));


    }
}
