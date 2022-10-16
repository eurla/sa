package myTest;

import org.junit.Test;
import com.horo.面向对象软件体系结构.Main4;

import java.io.IOException;


public class myTest {
    @Test
    public void myTest1() throws IOException {
        Main4 main4 = new Main4();
        main4.run("1" +
                " 12 " +
                "123 " +
                "1234");
    }

}
