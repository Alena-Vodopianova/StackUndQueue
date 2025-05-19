package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       /* MyStackArray<String> stack = new MyStackArray<>();

        System.out.println("Stack leer? " + stack.isEmpty()); // true
        stack.push("Hallo");
        stack.push("Welt");
        stack.push("!");

        System.out.println("Groesse: " + stack.size()); // 3
        System.out.println("Pop: " + stack.pop());    // !
        System.out.println("Pop: " + stack.pop());    // Welt
        System.out.println("Groesse: " + stack.size()); // 1
        System.out.println("Leer? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());    // Hallo
        System.out.println("Leer? " + stack.isEmpty()); // true */

        MyStackList<Integer> stack = new MyStackList<>();

        System.out.println("Leer? " + stack.isEmpty()); // true
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Groesse: " + stack.size()); // 3
        System.out.println("Pop: " + stack.pop());    // 3
        System.out.println("Pop: " + stack.pop());    // 2
        System.out.println("Groesse: " + stack.size()); // 1
        System.out.println("Leer? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());    // 1
        System.out.println("Leer? " + stack.isEmpty()); // true

        MyQueueArray<String> queueArray = new MyQueueArray<>();
        System.out.println("Leer? " + queueArray.isEmpty()); // true
        queueArray.put("A");
        queueArray.put("B");
        queueArray.put("C");
        System.out.println("Groesse: " + queueArray.size()); // 3
        System.out.println("Get: " + queueArray.get());    // A
        System.out.println("Get: " + queueArray.get());    // B
        System.out.println("Groesse: " + queueArray.size()); // 1
        System.out.println("Leer? " + queueArray.isEmpty()); // false
        System.out.println("Get: " + queueArray.get());    // C
        System.out.println("Leer? " + queueArray.isEmpty()); // true

        MyQueueList<Integer> queueList = new MyQueueList<>();
        System.out.println("Leer? " + queueList.isEmpty()); // true
        queueList.put(10);
        queueList.put(20);
        queueList.put(30);
        System.out.println("Groesse: " + queueList.size()); // 3
        System.out.println("Get: " + queueList.get());    // 10
        System.out.println("Get: " + queueList.get());    // 20
        System.out.println("Get: " + queueList.get());    // 30
        System.out.println("Leer? " + queueList.isEmpty()); // true
    }
}
