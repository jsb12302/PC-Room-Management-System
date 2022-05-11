/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagement;

/**
 *
 * @author 순범
 */
public abstract class TemplateMethod {

    public int coffee = 0;
    public int coffeecount = 0;
    public int snack = 0;
    public int snackcount = 0;
    public int time = 0;
    public int timecount = 0;
    public int milk = 0;
    public int shot = 0;
    public int user = 0;

    abstract String PrintPcNum();

    public void Count(String s) {
        if (s == "커피(2000)") {
            coffee++;
            coffeecount++;
        } else if (s == "과자(1000)") {
            snack++;
            snackcount++;
        } else if (s == "1시간") {
            time++;
            timecount++;
        } else if (s == "우유(500)") {
            milk++;
        } else if (s == "샷(500)") {
            shot++;
        }

    }

    public String show() {
        return String.format(" 커피 주문 수량 : %d \n "
                + "과자 주문 수량 : %d \n" + "우유 추가 : %d \n"
                + "샷 추가 : %d \n" + "충전 시간 : %d\n", coffeecount, snackcount, milk, shot, time);
    }

    public String getCoffee(int c) {
        return String.format("커피 매출 : %d", c);
    }

    public String getSnack(int s) {
        return String.format("과자 매출 : %d", s * 1000);
    }

    public String getTime(int t) {
        return String.format("충전 시간 매출 : %d", t * 1000);
    }

    public String getUser(int u) {
        return String.format("사용 인원 : %d", u);
    }
}
