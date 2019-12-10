package lesson01.part2;

import lesson01.part1.Task08;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task02Test {
    public static String fileName = "./src/main/java/lesson01/part2/Task02.java";

    @Before
    public void before() {
        SystemOutGatewayUtil.setCustomOut();
    }

    @After
    public void after() {
        SystemOutGatewayUtil.setOriginalOut();
        SystemOutGatewayUtil.clearOutput();
    }



    @Test
    public void test02CallDiv() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> collect = stream.collect(Collectors.toList());
            boolean output = collect.get(21).contains("div(") ? true : false;

            Assert.assertTrue("Функция main должна вызывать функцию div 3 раза", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02SoutMaim() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> collect = stream.collect(Collectors.toList());
            boolean sout = false;
            for (int i = 19; i < 21; i++)
                sout = collect.get(i).contains("System.out.print") ? false : true;
            Assert.assertTrue("Функция main не должна вызывать команду вывода текста на экран.", sout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02Div210() {
        Task02.main(null);
        SystemOutGatewayUtil.setOriginalOut();
        ByteArrayOutputStream outputArr = SystemOutGatewayUtil.getOutputArray();
        String s = outputArr.toString();
        Assert.assertTrue("error", s.contains("2\n1\n0\n"));
    }
    @Test
    public void testOutput2() {
        Task02.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("2"));

    }
    @Test
    public void testOutput1() {
        Task02.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("1"));

    }
    @Test
    public void testOutput0() {
        Task02.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("0"));

    }
}

