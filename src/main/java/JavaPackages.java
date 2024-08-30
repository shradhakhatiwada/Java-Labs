/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.text.SimpleDateFormat;
/**
 *
 * @author hp
 */
public class JavaPackages {

    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(date));

    }

}
