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
public class Pc1 extends TemplateMethod implements Pc {

    public String PrintPcNum() {
        return String.format("1번 PC\n");
    }

    @Override
    public Pc1 MakePcO() {
        Pc1 p = new Pc1();
        return p;
    }
    
}
