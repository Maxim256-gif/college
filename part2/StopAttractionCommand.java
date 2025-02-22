package practise.task3.part2;

public class StopAttractionCommand extends AbstractCommand {
    private String _name;

    public StopAttractionCommand(String name) {
        this._name = name;
    }

    @Override
    public void execute() {
        System.out.println("Attraction " + this._name + " stopped.");
    }

    @Override
    public void undo() {
        System.out.println("Attraction " + this._name + " is back in operation.");
    }

    @Override
    public String toString() {
        return "StopAttractionCommand{" +
                "name='" + _name + '\'' +
                '}';
    }
}
