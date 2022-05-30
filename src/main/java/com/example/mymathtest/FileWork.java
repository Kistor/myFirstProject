package com.example.mymathtest;

import java.io.*;

public class FileWork {

    public String TakeNumStr(int number) throws IOException {
        File file = new File("src/main/java/com/example/mymathtest/Quests.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        for(int i =0; i< number; i++)
        {
            line = reader.readLine();
        }
        return line;
    }

}
