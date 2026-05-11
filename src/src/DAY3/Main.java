package DAY3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<student> arr = new ArrayList<>();

        System.out.println("enter new student");
        String stdName = sc.next();
        int stdAge = sc.nextInt();
        student s1 = new student(stdName,stdAge);
        arr.add(s1);

        for(student s: arr ){
            s.DisplayData();
        }

    }
}
