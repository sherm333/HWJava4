//    Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 1, 8, 7, 9, 4,};

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int number = 99; // элемент добавлен в конец списка

        System.out.println("Основная очередь: ");
        System.out.println(list);


        enqueue(list, number);
        System.out.println("Метод <enqueue>, элемент " + number + " добавлен в конец очереди:");
        System.out.println(list);

        System.out.println("Метод <dequeue>, возвращает первый элемент из очереди [" + dequeue(list) + "] и удаляет его.");
        System.out.println("Очередь после метода <dequeue>:");
        System.out.println(list);

        System.out.println("Метод <first>, возвращает первый элемент из очереди [" + first(list) + "] не удаляя его.");
        System.out.println("Очередь после метода <first>:");
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> arr, int num) {
        arr.add(num);
    }

    public static int dequeue(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        arr.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        return number;
    }

}