import java.io.*;
 public class Filewriter {
    public static void main(String[] args)throws IOException {
        FileWriter fout=new FileWriter("Number.txt");
        fout.write("I am Ashish Giri");
        fout.write("I am currently doing btech");
        fout.write("Id:21240674");
        fout.close();  
    }   
}