import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandlingjava {
    public static void main(String[] args) {
        // creating a new file
        /*
        File myFile = new File("Filejava.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File cannot be created");
            throw new RuntimeException(e);
        }

         */
        // code write to file
/*
        try {
            FileWriter fileWriter = new FileWriter("Filejava.txt");
            fileWriter.write("THis is java writing code on lenovo laptop from room no. 16\n ok now by");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */
        // Reading a file
        /*
        File MyFile = new File("Filejava.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(MyFile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */
        // deleting a file
        File MyFile = new File("Filejava.txt");
    if (MyFile.delete()){
        System.out.println("I have deleted "+ MyFile.getName());
    }else{
        System.out.println("Some problem occured while deleting the file...");
    }
    }
}
