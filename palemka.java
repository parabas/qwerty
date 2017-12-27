/*
 * Compilation:  javac palemka.java
 *  Execution:    java palemka
 */
import java.util.Scanner;
import java.lang.Runtime;
import java.util.*;
import java.io.*;

public class palemka {

	public static void zad1(){
		System.out.println("Zad 1.");
		for(int i = 0; i <= 20; i++)
			System.out.println(i);
	}
	public static void zad2(){
		System.out.println("Zad 2.");
		for(int i = 0; i <= 20; i++)
			System.out.println("liczba nr " + i);
	}
	public static void zad3(){
		System.out.println("Zad 3.");
		for(int i = 20; i >= 0; i--)
			System.out.println(i);
	}
	public static void zad4(){
		System.out.println("Zad 4.");
		for(int i = 0; i <= 5; i++)
			System.out.println(i*2);
	}
	public static void zad5(){
		System.out.println("Zad 5.");
		for(int i = 100; i <= 120; i++)
			if (i%3 == 1)
				System.out.println(i);
	}
	public static void zad6(){
		System.out.println("Zad 6.");
		int a=0;
		for(int i = 0; i <= 20; i++)
			a+=i;
		System.out.println(a);
	}
	public static void zad7(){
		System.out.println("Zad 7.");
		int a=0;
		int b=0;
		for(int i = 0; i <= 20; i++){
			if (i%2 == 0)
				a+=i;
			else
				b+=i;
		}
		if (a>b)
			System.out.println("p: "+a);
		else
			System.out.println("np: "+b);
	}
	public static void zad8(){
		System.out.println("Zad 8.");
		int a=0;
		int i=0;
		while (a<=1000){
			a+=i;
			i++;
		}
			System.out.println(i+" liczb");
	}
	public static void zad9(){
		System.out.println("Zad 9.");
		int a=0, b=0, i=0, j=0;
		while (a<=1000){
			if (i%2==0)
				a+=i;
			i++;
		}
		while (b<=1000){
			if (j%2!=0)
				b+=j;
			j++;
		}
			System.out.println(i+" liczb parz i "+j+" liczb np");
	}
	public static void zad10(){
		System.out.println("Zad 10.");
		int a, b, c;
		for(int i = 0; i <= 100; i++){
			System.out.print(i+"\t");
			if (i%4==3)
				System.out.println();
		}
		System.out.println();
	}

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
	Scanner keyboard = new Scanner(System.in);
	zad1();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad2();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad3();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad4();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad5();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad6();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad7();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad8();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad9();
	System.out.println("\n\nenter to go to next exercise");
	keyboard.nextLine();
	zad10();
	System.out.println("\n\nenter to go to next exercise");
    }

}
