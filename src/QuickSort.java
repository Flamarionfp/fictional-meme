import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int pivot = list.get(list.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < pivot) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }

        left = sort(left);
        right = sort(right);

        left.add(pivot);
        left.addAll(right);

        return left;
    }
}
