package firstDirectory.topic7;

public class Main {
    static String path ="C:\\Users\\user\\IdeaProjects\\tekwillautomation\\out\\resources\\";
    static String path2 = "C:\\Users\\user\\IdeaProjects\\tekwillautomation\\out\\resources\\filename.txt";
    public static void main(String[] args) {
        FileManager file =new FileManager();
      //  file.createFile();

        file.scriereaInformatietextInFisier(path, "TestData");
        file.alipireaInformatieiLafisier(path, "TestData2");
        file.citireDateDinFisier(path2);

    }
}
