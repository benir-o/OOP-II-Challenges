package java_fundamentals;

import java.util.Scanner;

public class HelloTillStop {
    Scanner sc=new Scanner(System.in);
    void showHello(){
        String choice; //guard variable
        System.out.print("For Hello type h, anything else to stop: ");
        choice=sc.next();
        while("h".equals(choice)){
            System.out.println("Hello!");
            choice=sc.next();
        }
    }

    public static void main(String[] args) {
        new HelloTillStop().showHello();
    }
}
