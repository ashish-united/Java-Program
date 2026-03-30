// This program copies the contents of one file to another file.

import java.io.*;

class Copyfile {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\ag206\\OneDrive\\Desktop\\Java\\file.txt");
        File destinationFile = new File("C:\\Users\\ag206\\OneDrive\\Desktop\\Java\\file1.txt");
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int length;
            while ((length = fis.read()) != -1) {
                fos.write(length);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
        }
    }
}