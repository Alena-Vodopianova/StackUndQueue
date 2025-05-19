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

    }
}
