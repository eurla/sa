package com.horo.管道_过滤软件体系结构;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
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

        File inFile = new File("E:\\input.txt");
        File outFile = new File("E:\\output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}