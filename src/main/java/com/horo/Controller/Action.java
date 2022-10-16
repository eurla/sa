package com.horo.Controller;

import com.horo.主程序_子程序软件体系结构.Demo1;
import com.horo.管道_过滤软件体系结构.Main2;
import com.horo.观察者模式软件体系结构.Main3;
import com.horo.面向对象软件体系结构.Main4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class Action extends HttpServlet {
    Main4 m4 = new Main4();
    Main3 m3 = new Main3();
    Main2 m2 = new Main2();
    Demo1 m1 = new Demo1();

    @RequestMapping(value = "select.action")
    public String selectMethod(Integer num){
        switch (num){
            case 4:
                return "four";
            case 3:
                return "three";
            case 2:
                return "two";
            case 1:
                return "one";
        }
        return "index";
    }

    @RequestMapping(value = "/four.action")
    public void DoFour(String text, HttpServletResponse response) throws IOException {
        m4.run(text);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            BufferedReader in = new BufferedReader(new FileReader("E:\\output.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.print(str);
                out.print("<br>");
            }
        } catch (IOException e) {}
    }

    @RequestMapping(value = "three.action")
    public void DoThree(String text, HttpServletResponse response) throws IOException {
        m3.run(text);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            BufferedReader in = new BufferedReader(new FileReader("E:\\output.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.print(str);
                out.print("<br>");
            }
        } catch (IOException e) {}
    }

    @RequestMapping(value = "two.action")
    public void DoTwo(String text, HttpServletResponse response) throws IOException {
        m2.run(text);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            BufferedReader in = new BufferedReader(new FileReader("E:\\output.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.print(str);
                out.print("<br>");
            }
        } catch (IOException e) {}
    }

    @RequestMapping(value = "one.action")
    public void DoOne(String text, HttpServletResponse response) throws IOException {
        m1.run(text);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            BufferedReader in = new BufferedReader(new FileReader("E:\\output.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.print(str);
                out.print("<br>");
            }
        } catch (IOException e) {}
    }

}
