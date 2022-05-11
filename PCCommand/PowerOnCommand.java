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
public class PowerOnCommand implements Command {

    Power power;

    public PowerOnCommand(Power power) {
        this.power = power;
    }

    public void execute() {
        power.on();
    }
}
