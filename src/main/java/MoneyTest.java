/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Money {

    int rupee;
    int paisa;

    void setMoney( int x,int y) {
       rupee = x;
       paisa=y;
        
    }

    void displayMoney() {
        System.out.println(rupee+"Rupee" +paisa + "Paisa"); 
    }

    void addMoney(Money m1, Money m2) {

        int temp = m1.paisa + m2.paisa;
        paisa = temp % 100;

        rupee = m1.rupee + m2.rupee;
        rupee += temp / 100;

    }

}

public class MoneyTest {

    public static void main(String[] args) {
        Money m = new Money();
        Money m1 = new Money();
        Money m2 = new Money();

        m.setMoney(15,99);
        m1.setMoney(10,5);
        m2.addMoney(m, m1);
        m2.displayMoney();
    }

}
