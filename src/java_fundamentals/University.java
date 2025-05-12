package java_fundamentals;

import java.util.Scanner;

public class University {
    int population;
    String name;


    public  University(String name,int population){
        this.name=name;
        this.population=population;


    }
    public String toString(){
        return name + "University";
    }




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of universities in your country: ");
        int population=scanner.nextInt();
        University [] universities=new University[population];
        for (int i=0;i<universities.length;i++){
            System.out.print("Enter your university name: ");
            String universityName=scanner.next();
            System.out.print("Enter university population: ");
            int uniPopulation=scanner.nextInt();
            universities[i]=new University(universityName,uniPopulation);
            if (universities[i].population>10000||universities[i].population<0){
                //Universities cannot have more than 10k students or less than 0 students
                System.out.println("Invalid population input for "+ universities[i]);
                System.out.println("Try again...");
                i--;
            }

        }

    }

}
