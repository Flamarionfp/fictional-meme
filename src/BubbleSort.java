import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> list) {
        int n = list.size();
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {

                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return list;
    }
}
