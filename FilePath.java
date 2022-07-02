package sample;
import java.util.Scanner;

public class FilePath {
        private String filePath;
    public String FilePathMethod(String filePath){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a path of array: ");
        filePath = in.nextLine();
        this.filePath = filePath;

        System.out.printf("Path of your file: %s \n", filePath);
        in.close();
        return filePath;
    }
    public String getFilePath(){
        return filePath;
    }
}
