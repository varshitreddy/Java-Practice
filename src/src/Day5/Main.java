package Day5;

import java.awt.desktop.ScreenSleepEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Main {

    public void addData(File file, Scanner sc ) throws IOException {
        try{
            FileWriter writer = new FileWriter(file,true);
            writer.write(sc.nextLine()+"\n");
            System.out.println("we have written into file gang");
            writer.close();
        } catch (Exception e){
            throw new FileSystemException("damn dawg this file aint letting me write");
        }
    }

    public void readFile(File file, Scanner sc){
        while(sc.hasNextLine()){
            String file_content = sc.nextLine();
            System.out.println(file_content);
        }
        System.out.println("printed the file content");
    }


    public static void main(String[] args) throws Exception {
        Scanner sc_write = new Scanner(System.in);
        File file = new File("notes.txt");
        Scanner sc_read = new Scanner(file);
        String choice_input = sc_write.nextLine();
        Main obj = new Main();
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }
            if(file.canWrite() && (choice_input.equals("write into file"))){
               obj.addData(file,sc_write);
            }
            else if (file.canRead() && (choice_input.equals("read file"))) {
                obj.readFile(file,sc_read);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
