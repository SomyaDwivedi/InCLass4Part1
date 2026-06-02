/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectsomya;

import java.util.Scanner;

/**
 *
 * @author Somya Dwivedi, 2026
 */
public class ProjectSomya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub=num1-num2;
        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        
    }
}
