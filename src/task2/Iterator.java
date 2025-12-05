package task2;

/**
 * Інтерфейс ітератора для обходу списку.
 */
public interface Iterator {

    /**
     * Перевіряє, чи є наступний елемент.
     */
    boolean hasNext();

    /**
     * Повертає наступний елемент.
     */
    int next();
}
