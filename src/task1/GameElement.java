package task1;

/**
 * Базовий інтерфейс елементів гри.
 * Містить методи поверхневого та глибокого клонування.
 */
public interface GameElement {

    /**
     * Повертає поверхневу копію елемента.
     */
    GameElement cloneShallow();

    /**
     * Повертає глибоку копію елемента разом з піделементами.
     */
    GameElement cloneDeep();

    /**
     * Виводить структуру елемента.
     */
    void print(String indent);
}
