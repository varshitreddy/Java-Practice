package Day4;

import java.util.Scanner;

public class expHandling {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try{                                                // THIS IS TO LEARN ERROR HANDLING
            sc.nextInt();
        } catch (Exception e) {
            System.out.println("you are a dumb dawg");
            throw new Exception("Input can not be a string");

        }

    }
}
