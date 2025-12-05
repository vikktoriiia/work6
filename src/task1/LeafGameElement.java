package task1;

/**
 * Клас-лист. Не містить піделементів.
 */
public class LeafGameElement implements GameElement {

    private String name;

    public LeafGameElement(String name) {
        this.name = name;
    }

    @Override
    public GameElement cloneShallow() {
        System.out.println("Створюємо поверхневу копію Leaf: " + name);
        return new LeafGameElement(this.name);
    }

    @Override
    public GameElement cloneDeep() {
        System.out.println("Створюємо глибоку копію Leaf: " + name);
        return new LeafGameElement(this.name);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- Leaf: " + name);
    }
}
