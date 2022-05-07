package doublelinkedlist;

public class MainList {
    public static void main(String[] args) {
        DoubleLinkedList test = new DoubleLinkedList<String>(new String("hello world"));
        test.add("lol");
        test.add("kek");
        test.insert("whats up", 0);

        System.out.println("index 0: " + test.get(0));
        System.out.println("index 3: " + test.get(3));

        test.add("my test");
        System.out.println("length: " + test.length());

        int val1 = test.indexOf("lol");
        System.out.println(test.toString());
        test.delete(val1);
        System.out.println(test.toString());
        System.out.println("length: " + test.length());
        System.out.println(test.getClass().getName());
        System.out.println("Does it equal? " + test.equals(test));
    }
}
