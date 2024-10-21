/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.day1;

/**
 *
 * @author vidya
 */
//FIND THE GROSS SALARY OF AN EMPLOYEE
import java.util.Scanner;
public class Day1 {

    public static void main(String[] args) {
        double pay,hra,da,grosspay;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
         pay= sc.nextInt();
        if (pay>=5000)
        {
            hra= pay * 0.10;
            da=pay*0.20;
            
        }
        else
        {
            hra= pay * 0.20;
            da=pay*0.30;
        }
        grosspay=pay+hra+da;
        System.out.println("HRA:"+hra);
        System.out.println("DA:"+da);
        System.out.println("GrossPAY:"+grosspay);
    }
}
