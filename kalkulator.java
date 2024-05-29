package kalkulator;

import java.util.*;
import java.util.Locale.IsoCountryCode;

import javax.swing.SpinnerDateModel;

import input.input;

public class kalkulator {
    public static void main(String[] args) {
        
     // a operator b
     Scanner inputUser;
     float a,b,hasil;
     char operator;

    inputUser = new Scanner(System.in);
    System.out.print("nilai a = ");
    a = inputUser.nextFloat();
    System.out.print("operator = ");
    operator = inputUser.next().charAt(0);
    System.out.print("nilai b = ");
    b = inputUser.nextFloat();

    System.out.println("input user : " + a + " " + operator + " " + b );

    if (operator == '+'){
        hasil = a + b;
        System.out.print("hasil = " + hasil);

    }else if (operator == '-'){
        hasil = a - b;
        System.out.println("hasil =" + hasil);
    }else if (operator == '*'){
        hasil = a * b;
        System.out.println("hasil = " + hasil);
    }else if (operator == '/'){
        if (b == 0){
            System.out.println("pembagi 0 = tidak terhingga");
        }else {
            hasil = a / b;
            System.out.println("hasil = " + hasil);
        }
    }
    
    System.out.println("program selesai");


    }
}
