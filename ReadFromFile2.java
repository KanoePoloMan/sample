package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;



public class ReadFromFile2 {
    private String filePath;

    public void ReadFromFileObject(String filename){
        try(FileReader reader = new FileReader("D:\\Coding\\ButCallibrate_Blue.c"))//filePath
        {
            char[] buf = new char[256];
            char[] arrayOfFile = new char[256];
            int flagToEndOfArray = 0;
            int c;
            String slozenieEndifa = "";
            while((c = reader.read(buf))>0){
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                for(int counter = 0; counter < buf.length - 1; counter++){
                    if("#endif".lastIndexOf(slozenieEndifa) == -1) {
                        slozenieEndifa = "";
                    }
                    else{
                        for(int i = 0; i < slozenieEndifa.length(); i++){

                        }
                    }
                    if(buf[counter] == '#'){
                        if(counter < 251) {
                            for (int i = 0; i < 6; i++) {
                                slozenieEndifa = slozenieEndifa + buf[counter + i];
                            }
                        }
                        else{
                            for(int i = 0; i < buf.length - counter; i++){
                                slozenieEndifa = slozenieEndifa + buf[counter + i];
                            }
                        }
                        System.out.println("-------\u001B[32m" + slozenieEndifa + "-------\u001B[37m");
                    }
                    if(slozenieEndifa == "#endif"){
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    }
                }
                System.out.println(buf);

                System.out.println("\u001B[31m------------------>\u001B[37m");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}

