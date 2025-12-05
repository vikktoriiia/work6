package task2;

/**
 * Демонстрація роботи шаблону Factory Method
 * на прикладі впорядкованого списку та ітератора.
 */
public class Task2Main {
    public static void main(String[] args) {

        IntegerList list = new OrderedIntegerList();

        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println("\n--- Обхід за допомогою ітератора ---");
        Iterator it = list.createIterator();

        while (it.hasNext()) {
            it.next();
        }
    }
}
