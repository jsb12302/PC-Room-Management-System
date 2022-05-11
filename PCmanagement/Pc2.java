/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagement;

import Factory.Pc;

/**
 *
 * @author 순범
 */
public class Pc2 extends TemplateMethod implements Pc {

    public String PrintPcNum() {
        return String.format("2번 PC\n");
    }

    @Override
    public Pc2 MakePcO() {
        Pc2 p2 = new Pc2();
        return p2;
    }

}
