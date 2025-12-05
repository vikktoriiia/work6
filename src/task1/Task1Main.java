package task1;
/**
 * Демонстрація роботи поверхневого та глибокого клонування.
 */
public class Task1Main {
    public static void main(String[] args) {

        CompositeGameElement level = new CompositeGameElement("Level 1");
        CompositeGameElement room = new CompositeGameElement("Room A");

        room.add(new LeafGameElement("Player"));
        room.add(new LeafGameElement("Chest"));

        level.add(room);

        System.out.println("\n--- Оригінал ---");
        level.print("");

        System.out.println("\n--- Поверхнева копія ---");
        GameElement shallow = level.cloneShallow();
        shallow.print("");

        System.out.println("\n--- Глибока копія ---");
        GameElement deep = level.cloneDeep();
        deep.print("");
    }
}
