/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import PCmanagement.Pc1;
import PCmanagement.Pc2;

/**
 *
 * @author 순범
 */
public class PcFactory implements Factory {

    public Pc createPc(String s) {
        switch (s) {
            case "pc1":
                return new Pc1();
            case "pc2":
                return new Pc2();
        }
        return null;
    }
}
