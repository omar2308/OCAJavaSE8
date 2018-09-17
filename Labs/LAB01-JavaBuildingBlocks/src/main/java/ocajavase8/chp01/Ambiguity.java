/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chp01;

/**
 *
 * @author Omar
 */
public class Ambiguity {
    static class G {
        void A() {
            System.out.println("Regular Method");
        }
    }

    static class b {
        static void A() {
            System.out.println("Static Method");
        }
    }

    public static void main(String[] args) {
        G b = new G();
        b.A();
    }
}
