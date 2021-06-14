package myHashSet;

import java.util.*;

public class MySetMethod<T extends  Comparable<T>> {

    public int myGetHashSet(HashSet<T> hashSet){
        return hashSet.size();
    }

    public boolean myIsEmpty(HashSet<T> hashSet){
        return hashSet.size() != 0;
    }

    public  HashSet<T> myCloneHashSet(HashSet<T> hashSet){
         return (HashSet<T>) hashSet.clone();
    }

    public TreeSet<T> myConvertToTreeSet(HashSet<T> hashSet){
        TreeSet<T> myTreeSet = new TreeSet<T>(hashSet);
        return myTreeSet;
    }

    public ArrayList<T> myConvertToArrayList(HashSet<T> hashSet){
        ArrayList<T> myArrayList = new ArrayList<T>(hashSet);
        return myArrayList;
    }

    public List<T> myConvertToList(HashSet<T> hashSet){
        List<T> myList = new ArrayList<T>(hashSet);
        return myList;
    }

    public boolean myCompareHashSet(HashSet<T> hashSet1, HashSet<T> hashSet2){
        if (hashSet1.size() != hashSet2.size()){
            return false;
        }
        Iterator<T> iterator1 = hashSet1.iterator();
        Iterator<T> iterator2 = hashSet2.iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() != iterator2.next()){
                return false;
            }
        }
        return true;
    }

    public void myClear(HashSet<T> hashSet){
        hashSet.clear();
    }

    public void myIterate(TreeSet<T> treeSet){
        Iterator<T> iterator = treeSet.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    public T myGetLastTreeSet(TreeSet<T> treeSet){
        return treeSet.last();
    }

    public T myGetFirstTreeSet(TreeSet<T> treeSet){
            return treeSet.first();
    }

    public TreeSet<T> myCloneTreeSet(TreeSet<T> treeSet){
        return (TreeSet<T>) treeSet.clone();
    }

    public int myGetTreeSet(TreeSet<T> treeSet){
        return treeSet.size();
    }

    public boolean myCompareTreeSet(TreeSet<T> treeSet1, TreeSet<T> treeSet2){
        if (treeSet1.size() != treeSet2.size()){
            return false;
        }
        Iterator<T> iterator1 = treeSet1.iterator();
        Iterator<T> iterator2 = treeSet2.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() != iterator2.next()){
                return false;
            }
        }
        return true;
    }

    public void myFindTreeSet(TreeSet<T> treeSet, T n){
        Iterator<T> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            T current = iterator.next();
            if(current.compareTo(n) == -1){
                System.out.print(current + " ");
            }
        }
    }

    public boolean myRemoveTreeSet(TreeSet<T> treeSet, T n){
        Iterator<T> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            T current = iterator.next();
            if(current.compareTo(n) == 0){
                treeSet.remove(current);
                return true;
            }
        }
        return false;
    }

    public void myIteratePriorityQueue(PriorityQueue<T> priorityQueue){
        Iterator<T> iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    public boolean myComparePriorityQueue(PriorityQueue<T> priorityQueue1, PriorityQueue<T> priorityQueue2){
        if(priorityQueue1.size() != priorityQueue2.size()){
            return false;
        }
        Iterator<T> iterator1 = priorityQueue1.iterator();
        Iterator<T> iterator2 = priorityQueue2.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().compareTo(iterator2.next()) != 0){
                return false;
            }
        }
        return true;
    }
}