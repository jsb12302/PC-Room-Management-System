/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 순범
 */
public class ManagerInfoChange {

    public void ManagerInfoCahnge(String a) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PCmanagement\\AdminInfo.txt", false));
        PrintWriter pw = new PrintWriter(bw, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

}
