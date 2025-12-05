package task2;

/**
 * Ітератор для впорядкованого списку.
 */
public class OrderedIterator implements Iterator {

    private OrderedIntegerList list;
    private int index = 0;

    public OrderedIterator(OrderedIntegerList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public int next() {
        int value = list.get(index);
        System.out.println("Повертаємо елемент: " + value);
        index++;
        return value;
    }
}
