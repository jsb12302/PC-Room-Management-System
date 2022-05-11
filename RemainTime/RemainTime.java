/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemainTime;

//import PCmanagement.Pc1;
//import java.util.Calendar;
/**
 *
 * @author 순범
 */
public class RemainTime {

    int sec;
    String tmp;

    public void GetTime(int a) {
        sec = a * 3600;
    }

    public String RemainTime() {
        if (sec > 0) {
            sec--;
            tmp = String.format("%d 분 " + "%d" + "초 남았습니다.", sec / 60, sec % 60);
        }
        return tmp;
    }

}
