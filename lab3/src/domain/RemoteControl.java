package domain;

import utilities.CommandHistory;
import utilities.Logger;

public class RemoteControl {
    private Command currentCommand;
    private final CommandHistory history = new CommandHistory();

    public void setCommand(Command command) {
        this.currentCommand = command;
        Logger.log("Command set: " + command.getClass().getSimpleName());
    }

    public void pressButton() {
        if (currentCommand != null) {
            currentCommand.execute();
            history.push(currentCommand);
            Logger.log("Executed command: " + currentCommand.getClass().getSimpleName());
        } else {
            Logger.log("No command set!");
        }
    }

    public void pressUndo() {
        Command lastCommand = history.pop();
        if (lastCommand != null) {
            lastCommand.undo();
            Logger.log("Undone command: " + lastCommand.getClass().getSimpleName());
        } else {
            Logger.log("No commands to undo!");
        }
    }
}
