import java.util.ArrayList;
import java.util.Scanner;

public class Day2Class {

    public static void addStd(String name, int age,ArrayList<Student> arr){
        Student std = new Student(name,age);
        arr.add(std);

    }

    public static void DisplayAllStd(ArrayList<Student> arr){
        for(Student x: arr){
            System.out.println(x.DisplayData());
        }
    }
    public static void main(String[] args){
    Student std1 = new Student("varshit",22);
    Student std2 = new Student("reddy",22);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice of 1. add std 2. view std 3. delete std");

        ArrayList<Student> arr= new ArrayList<>();
        while(true){
            int choice = sc.nextInt();
    switch(choice){
        case 1:
            System.out.println("enter name of std");
            String name = sc.next();
            System.out.println("enter the age of std");
            int age = sc.nextInt();
            addStd(name, age,arr);
            break;
        case 2:
            System.out.println("Display all stds");
            DisplayAllStd(arr);
            break;
        case 3:
            System.out.println("seeya niggas");
            return;
        default:
            System.out.println(" you dumb dawg?!");
            break;
    }
        }
    }
}
