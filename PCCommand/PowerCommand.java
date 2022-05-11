/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCCommand;

/**
 *
 * @author xorh
 */
public class PowerCommand {

    Command[] onCommands;
    Command[] offCommands;

    public PowerCommand() {
        onCommands = new Command[6];
        offCommands = new Command[6];
        EmptyCommand EmptyCommand = new EmptyCommand();

        for (int i = 0; i < 6; i++) {
            onCommands[i] = EmptyCommand;
            offCommands[i] = EmptyCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }
}
