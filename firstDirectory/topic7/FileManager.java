package firstDirectory.topic7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static firstDirectory.topic7.Main.path;

public class FileManager {


    static void createFile() {
        try {
            File myObj = new File(path + "filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void scriereaInformatietextInFisier(String caleaCatreFisier, String date) {

        try {
            FileWriter writer = new FileWriter(path + "filename.txt", true);
            writer.write(date + "\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    static void alipireaInformatieiLafisier(String caleaCatreFisier, String date) {

        try {
            String filename = "example.txt";
            FileWriter fw = new FileWriter(path + "filename.txt", true); // append to file
            fw.write(date);
            fw.close();
            System.out.println("Text added to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
 static void citireDateDinFisier(String caleaFisier){

    try {

        FileReader fr = new FileReader(caleaFisier);
        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c); // cast to char and print to console
        }
        fr.close();
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}


}

