package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Впорядкований список цілих чисел.
 * Підтримує автоматичне сортування при додаванні.
 */
public class OrderedIntegerList implements IntegerList {

    private List<Integer> data = new ArrayList<>();

    @Override
    public void add(int x) {
        System.out.println("Додаємо: " + x);
        data.add(x);
        data.sort(Integer::compareTo);
    }

    @Override
    public void remove(int x) {
        System.out.println("Видаляємо: " + x);
        data.remove(Integer.valueOf(x));
    }

    @Override
    public int get(int index) {
        return data.get(index);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public Iterator createIterator() {
        System.out.println("Створюємо OrderedIterator");
        return new OrderedIterator(this);
    }
}
