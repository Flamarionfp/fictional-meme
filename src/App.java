import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = createList(100_000);
        /*
         * Recomendo comentar a chamada dos métodos e chamar apenas um por vez, para
         * melhor visualização dos logs.
         */

        System.out.println("Lista original: ");
        printList(list);

        handleBubbleSort(list);
        handleQuickSort(list);
    }

    static List<Integer> createList(Integer quantity) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            var random = (int) (Math.random() * 100);
            list.add(random);
        }
        return list;
    }

    static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }

    static void handleBubbleSort(List<Integer> list) {
        System.out.println("Executando BubbleSort...");

        long duration = measureExecutionTime(() -> {
            BubbleSort bubbleSort = new BubbleSort();
            var sortedList = bubbleSort.sort(list);
            printList(sortedList);
        });

        System.out.println("BubbleSort execução levou: " + duration + " milissegundo(s)");
    }

    static void handleQuickSort(List<Integer> list) {
        System.out.println("Executando QuickSort...");

        long duration = measureExecutionTime(() -> {
            QuickSort quickSort = new QuickSort();
            var sortedList = quickSort.sort(list);
            printList(sortedList);
        });

        System.out.println("QuickSort execução levou: " + duration + " milissegundo(s)");
    }

    static long measureExecutionTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
