package Lab3.lr3;

import java.util.*;

public class Example14 {
    private static final int N = 100_000; // количество элементов
    private static final int WARMUP = 10; // число прогревочных итераций
    private static final int REPEAT = 10; // число измеряемых повторений

    public static void main(String[] args) {
        // Прогрев
        for (int i = 0; i < WARMUP; i++) {
            benchAll();
        }

        System.out.println("Операция                   | ArrayList (нс) | LinkedList (нс) | ArrayDeque (нс)");
        System.out.println("---------------------------------------------------------------");

        long[] sumArrayList = new long[7];
        long[] sumLinkedList = new long[7];
        long[] sumArrayDeque = new long[7];

        for (int r = 0; r < REPEAT; r++) {
            long[] times = benchAll();
            for (int i = 0; i < 7; i++) {
                sumArrayList[i] += times[i];
                sumLinkedList[i] += times[7 + i];
                sumArrayDeque[i] += times[14 + i];
            }
        }

        String[] ops = {
                "Добавление в начало       ",
                "Добавление в конец        ",
                "Добавление в середину     ",
                "Удаление из начала        ",
                "Удаление из конца         ",
                "Удаление из середины      ",
                "Получение по индексу      "
        };

        for (int i = 0; i < 7; i++) {
            System.out.printf("%s | %14d | %15d | %15d%n",
                    ops[i],
                    sumArrayList[i] / REPEAT,
                    sumLinkedList[i] / REPEAT,
                    sumArrayDeque[i] / REPEAT);
        }
    }

    private static long[] benchAll() {
        long[] times = new long[21];

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++)
            arrayList.add(i);

        long start = System.nanoTime();
        arrayList.add(0, -1); // добавление в начало
        times[0] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.add(N / 2); // добавление в конец
        times[1] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.add(N / 2, -2); // добавление в середину
        times[2] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.remove(0); // удаление из начала
        times[3] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.remove(arrayList.size() - 1); // удаление из конца
        times[4] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.remove(N / 2); // удаление из середины
        times[5] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.get(N / 2); // получение по индексу
        times[6] = System.nanoTime() - start;

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++)
            linkedList.add(i);

        start = System.nanoTime();
        linkedList.add(0, -1); // начало
        times[7] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.add(N / 2); // конец
        times[8] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.add(N / 2, -2); // середина
        times[9] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.remove(0); // начало
        times[10] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.remove(linkedList.size() - 1); // конец
        times[11] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.remove(N / 2); // середина
        times[12] = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.get(N / 2); // по индексу
        times[13] = System.nanoTime() - start;

        // ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < N; i++)
            arrayDeque.addLast(i);

        start = System.nanoTime();
        arrayDeque.addFirst(-1); // начало
        times[14] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayDeque.addLast(N); // конец
        times[15] = System.nanoTime() - start;

        // Добавление в середину (реализуем копированием в список)
        start = System.nanoTime();
        addMiddle(arrayDeque, N / 2, -2);
        times[16] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayDeque.removeFirst(); // удаление из начала
        times[17] = System.nanoTime() - start;

        start = System.nanoTime();
        arrayDeque.removeLast(); // удаление из конца
        times[18] = System.nanoTime() - start;

        // Удаление из середины через итератор
        start = System.nanoTime();
        removeMiddle(arrayDeque, N / 2);
        times[19] = System.nanoTime() - start;

        // Получение по индексу (эмуляция обходом)
        start = System.nanoTime();
        getByIndex(arrayDeque, N / 2);
        times[20] = System.nanoTime() - start;

        return times;
    }

    // Вставка элемента в середину ArrayDeque
    private static void addMiddle(Deque<Integer> deque, int index, int element) {
        List<Integer> list = new ArrayList<>(deque);
        list.add(index, element);
        deque.clear();
        deque.addAll(list);
    }

    // Удаление элемента из середины ArrayDeque через итератор
    private static void removeMiddle(Deque<Integer> deque, int index) {
        Iterator<Integer> it = deque.iterator();
        for (int i = 0; i < index; i++)
            it.next();
        it.next();
        it.remove();
    }

    // Эмуляция получения по индексу для ArrayDeque
    private static Integer getByIndex(Deque<Integer> deque, int index) {
        Iterator<Integer> it = deque.iterator();
        for (int i = 0; i < index; i++)
            it.next();
        return it.next();
    }
}