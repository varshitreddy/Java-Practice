package DAY3;

import java.util.HashMap;
import java.util.Scanner;

public class MainMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to std management system");
        HashMap<Integer,studentMap> map = new HashMap<>();
        int stdid = 0;
        while (true) {
            System.out.println("=========MENU===========");
            System.out.println("1. add std");
            System.out.println("2. search std by id");
            System.out.println("3. remove std by id");
            System.out.println("4. show all stds");
            System.out.println("5. exit");
            System.out.println("Enter you choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the student name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("enter student age");
                    int age = sc.nextInt();
                    studentMap s = new studentMap(name,age);
                    map.put(++stdid,s);
                    break;
                case 2:
                    System.out.println("enter the std id");
                    int id = sc.nextInt();
                    map.get(id).DisplayData();
                    break;
                case 3:
                    System.out.println("enter the std id");
                    int del = sc.nextInt();
                    map.remove(del);
                    System.out.println("std deleted with id "+del);
                    break;
                case 4:
                    for(Integer key : map.keySet()){
                        map.get(key).DisplayData();
                    }
                    break;
                case 5:
                    System.out.println("BYE BYE NIGGAS");
                    return;
                default:
                    System.out.println("are you dumb dawg?!");
            }
        }
    }
}