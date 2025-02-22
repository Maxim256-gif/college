package practise.task3.part2;

public class RemoveAttractionCommand extends AbstractCommand {
    private int _attractionId;

    public RemoveAttractionCommand(int attractionId) {
        this._attractionId = attractionId;
    }

    @Override
    public void execute() {
        System.out.println("Attraction with ID " + this._attractionId + " removed.");
    }

    @Override
    public void undo() {
        System.out.println("Attraction with ID " + this._attractionId + " restored.");
    }

    @Override
    public String toString() {
        return "RemoveAttractionCommand{" +
                "attractionId=" + _attractionId +
                '}';
    }
}
