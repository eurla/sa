package com.horo.面向对象软件体系结构;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public void run(String text) throws IOException {

        //创建input文件
        File file = new File("E:\\input.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.flush();
        writer.close();

        Input input = new Input();
        input.input("E:\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("E:\\output.txt");
    }

}