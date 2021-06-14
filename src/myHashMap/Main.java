package myHashMap;

public class Main {
    public static void main(String[] args) {
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("Aa", "AA");
        myMap.put("Aa", "BB");
        myMap.put("3", "CC");
        myMap.put("kh", "klh");
        myMap.put("lgu", "jhkj");
        myMap.put("hj", "klj");
        myMap.put("45", "klj");
        myMap.put("7", "klj");
        myMap.put("8", "klj");
        myMap.put("9", "klj");
        myMap.put("10", "klj");
        myMap.put("11", "klj");
        myMap.put("12", "klj");
        myMap.put("13", "klj");
        myMap.put("14", "klj");
        myMap.put("17", "klj");
        myMap.put("10", "klj");
        System.out.println(myMap.get("45"));
        System.out.println(myMap.toString());

    }
}
