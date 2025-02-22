package practise.task3.part2;

public class Main {
    public static void main(String[] args) {
        AttractionController ac = new AttractionController();

        RemoveAttractionCommand a1 = new RemoveAttractionCommand(4);
        RemoveAttractionCommand a2 = new RemoveAttractionCommand(8);
        RemoveAttractionCommand a3 = new RemoveAttractionCommand(16);

        StopAttractionCommand b1 = new StopAttractionCommand("Roller Coaster");
        StopAttractionCommand b2 = new StopAttractionCommand("Ferris Wheel");

        a1.execute();
        a3.execute();
        b1.execute();
        b2.execute();
        b2.undo();

        ac.addCommand(a1);
        ac.addCommand(a2);
        ac.addCommand(a3);
        ac.addCommand(b1);
        ac.addCommand(b2);

        ac.executeAllPendingCommands();
        System.out.println(ac.get_commandHistory());

        a2.execute();
        a2.undo();
        ac.undoChanges(1);
        a2.execute();
        ac.removeCommand(a2);
        ac.addCommand(a2);
        b2.execute();
        ac.addCommand(b2);
        ac.undoCommand(b2);
        ac.executeAllPendingCommands();
        System.out.println(ac.get_commandHistory());
    }
}
