package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Композитний елемент. Може містити інші GameElement.
 */
public class CompositeGameElement implements GameElement {

    private String name;
    private List<GameElement> children = new ArrayList<>();

    public CompositeGameElement(String name) {
        this.name = name;
    }

    public void add(GameElement element) {
        children.add(element);
    }

    @Override
    public GameElement cloneShallow() {
        System.out.println("Створюємо поверхневу копію Composite: " + name);
        CompositeGameElement copy = new CompositeGameElement(this.name);
        copy.children = this.children; // ті самі посилання
        return copy;
    }

    @Override
    public GameElement cloneDeep() {
        System.out.println("Створюємо глибоку копію Composite: " + name);
        CompositeGameElement copy = new CompositeGameElement(this.name);
        for (GameElement child : children) {
            copy.children.add(child.cloneDeep());
        }
        return copy;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ Composite: " + name);
        for (GameElement child : children) {
            child.print(indent + "  ");
        }
    }
}
