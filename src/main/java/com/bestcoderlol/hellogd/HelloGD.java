package com.bestcoderlol.hellogd;

import java.util.Scanner;

public class HelloGD {
    public static void main(String[] args) {
        System.out.println("Hallo ich bin der GD Bot willst du mit mir schreiben?");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String tx = sc.next();
        System.out.println("Deine Antwort war: " + tx);
        System.out.println("Wie alt bist du eigentlich?");
        String tx1 = sc.next();
        System.out.println("Du bist " + tx1 + " Jahre alt");
        System.out.println("Was machst du eig. gerade");
        String tx2 = sc.next();
        System.out.println("Cool ich mag " + tx2);
        if (tx2.equalsIgnoreCase("programmieren")) {
            System.out.println("Macht einfach Spass");
        } else{
                System.out.println("Programmieren ist aber cooler");
                String tx3 = sc.next();
                System.out.println("Ok bye bis später");
                String tx4 = sc.next();
                System.out.println("Tschau");
                System.out.println("Test erfolgreich abgeschlossen " +
                        "Schreibe Dialog um eine Unterhaltung zu starten");
                String tx5 = sc.next();
                if (tx5.equalsIgnoreCase("Dialog")) {
                    System.out.println("Dialog wird gestartetet...");
                } else {
                    System.out.println("Dialog wird nicht gestartet, drücke F5 um erneut zu beginnen");
                }
                }
            }

        }

