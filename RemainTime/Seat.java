/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemainTime;

/**
 *
 * @author 순범
 */
public class Seat {

    public UseState useState;

    public Seat() {
        useState = new Use();
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }

    public String Useable() {
        return useState.Useable();
    }

}
