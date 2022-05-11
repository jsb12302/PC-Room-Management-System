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
public class SignUp { //빌더 패턴

    private String id; //필수값
    private String pwd; //필수값

    private String phone;
    private String name;

    public SignUp(String id, String pwd) { //필수값 생성자
        this.id = id;
        this.pwd = pwd;
    }

    public SignUp(Builder builder) {
        this.id = builder.id;
        this.pwd = builder.pwd;
        this.phone = builder.phone;
        this.name = builder.name;

    }

    public void print() {
        System.out.println(id + " " + pwd + " " + phone + " " + name);
    }

    public static class Builder {

        private String id; //필수값
        private String pwd; //필수값

        private String phone;
        private String name;

        public Builder(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public SignUp build() {
            return new SignUp(this);
        }

    }

    public void Sign() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PCmanagement\\AdminInfo.txt", true));
        PrintWriter pw = new PrintWriter(bw, true);
        pw.write(id + " " + pwd + " " + phone + " " + name + "\n");
        pw.flush();
        pw.close();
    }

}
