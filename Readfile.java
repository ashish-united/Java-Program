// This program reads a file and displays its properties and contents.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Readfile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\ag206\\OneDrive\\Desktop\\Java\\file.txt");
             Scanner sc = new Scanner(f);
             while (sc.hasNextLine()) { 
                String data = sc.nextLine();
                System.out.println(data);
            } 
            if (f.exists()) {
                System.out.println("File name: " + f.getName());
                System.out.println("Absolute path: " + f.getAbsolutePath());
                System.out.println("Writeable: " + f.canWrite());
                System.out.println("Readable: " + f.canRead());
                System.out.println("File size in bytes: " + f.length());
        }else {
                System.out.println("The file does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }      
}
