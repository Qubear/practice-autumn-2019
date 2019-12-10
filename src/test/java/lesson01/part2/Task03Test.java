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

public class Task03Test {
    public static String fileName = "./src/main/java/lesson01/part2/Task03.java";

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
    public void test03Output() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> collect = stream.collect(Collectors.toList());
            boolean div = collect.get(21).contains("System.out.print") ? false : true;
            Assert.assertTrue(
                    "Метод main не должен вызывать System.out.println или System.out.print!",
                    div
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03CallHackSalary() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> collect = stream.collect(Collectors.toList());
            int b = 0;
            int a = 0;
            int num = 0;

            for (int i = 0; i < collect.size(); i++)
                if (collect.get(i).contains("public static void main(String[] args)")) {
                    b = i;
                    break;
                }
            for (int i = b; i < collect.size(); i++)
                if (collect.get(i).contains("}")) {
                    a = i;
                    break;
                }

            for (int i = b; i < a + 1; i++)
                if (collect.get(i).contains("hackSalary"))
                    num++;

            Assert.assertTrue("Метод main должен вызвать метод hackSalary только один раз", num == 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testOutput() {
        Task03.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("Ваша зарплата составляет - 800"));

    }


}
