package domain;

public interface Command {
    void execute();
    void undo();
}
