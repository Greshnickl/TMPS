package client;

import domain.*;
import utilities.Logger;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        Logger.log("Starting the system...");

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Undo turning the light ON
        remote.pressUndo();

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();

        // Undo turning the light OFF
        remote.pressUndo();

        Logger.log("System terminated.");
    }
}
