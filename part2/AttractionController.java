package practise.task3.part2;

import java.util.ArrayList;

public class AttractionController {
    private ArrayList<AbstractCommand> _commandsToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        _commandsToExecute.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        _commandsToExecute.remove(command);
    }

    public void undoCommand(AbstractCommand command) {
        _commandHistory.remove(command);
    }

    public void executeAllPendingCommands() {
        _commandHistory.addAll(_commandsToExecute);
        _commandsToExecute.clear();
    }

    public void undoChanges(int changesToUndo) {
        for (int i = 0; i < changesToUndo; i++) {
            if (!_commandHistory.isEmpty()) {
                _commandHistory.remove(_commandHistory.size() - 1);
            }
        }
    }

    public ArrayList<AbstractCommand> get_commandHistory() {
        return _commandHistory;
    }
}
