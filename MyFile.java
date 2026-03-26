import java.io.*;

public class MyFile {
    public static void main(String[] args) throws IOException { 
        File f = new File("Introduction5.txt");
        if(f.createNewFile()){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
