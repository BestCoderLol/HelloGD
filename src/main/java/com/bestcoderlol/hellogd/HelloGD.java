package com.bestcoderlol.hellogd;

import java.util.Scanner;

public class HelloGD {
    public static void main(String[] args) {
        System.out.println("Hallo ich bin der GD Bot willst du mit mir schreiben ? ");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String tx = sc.next();
        System.out.println("Deine Antwort war : " + tx);
        System.out.println("wie alt bist du eigentlich ?");
        String tx1 = sc.next();
        System.out.println("Du bist " + tx1 + " jahre alt");
        System.out.println("was machst du eig. gerade");
        String tx2 = sc.next();
        System.out.println("cool ich mag " + tx2);
        if (tx2.equalsIgnoreCase("programmieren")) {
            System.out.println("macht einfach spass");
        } else{
                System.out.println("programmieren ist aber cooler");
                String tx3 = sc.next();
                System.out.println("ok bye bis später");
                String tx4 = sc.next();
                System.out.println("Tschau");
                System.out.println("Test erfolgreich Abgeschlossen " +
                        "Schreibe Dialog um eine unterhaltung zu starten");
                String tx5 = sc.next();
                if (tx5.equalsIgnoreCase("Dialog")) {
                    System.out.println("Dialog wird gestartetet...");
                } else {
                    System.out.println("Dialog wird nicht gestartet, drücke F5 um erneut zu beginnen");
                }
                }
            }

        }

