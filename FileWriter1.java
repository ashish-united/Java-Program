import java.io.*;
public class FileWriter1 {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("AshishA.txt");
        fw.write("Hello World");
        fw.close();
        FileReader fr=new FileReader("AshishA.txt");
        int i;
        while ((i=fr.read())!=-1){
            System.out.println(""+(char)i);
      
            
        }
        fr.close();
        
    }
    
}
