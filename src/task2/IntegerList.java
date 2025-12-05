package task2;

/**
 * Інтерфейс списку цілих чисел.
 * Містить фабричний метод для створення ітератора.
 */
public interface IntegerList {

    void add(int x);

    void remove(int x);

    int get(int index);

    int size();

    /**
     * Фабричний метод, який повертає ітератор.
     */
    Iterator createIterator();
}
