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
public class EmptyCommand implements Command {

    @Override
    public void execute() {
        System.out.println("빈 슬롯입니다.");
    }
}
