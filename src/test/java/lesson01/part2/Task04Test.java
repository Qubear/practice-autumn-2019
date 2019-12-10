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

public class Task04Test {
    public static String fileName = "./src/main/java/lesson01/part2/Task04.java";

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
    public void test04OutputScreen() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> collect = stream.collect(Collectors.toList());
            boolean var = false;
            for (int i = 25; i < 27; i++)
                var = collect.get(i).contains("System.out.print") ? false : true;
            Assert.assertTrue(
                    "Программа должна выводить текст на экран!",
                    var
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testOutput() {
        Task04.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("Сумма - 14"));
    }
    @Test
    public void testOutput2() {
        Task04.main(null);
        String str, str1;
        ByteArrayOutputStream outputArray = SystemOutGatewayUtil.getOutputArray(); //SystemOutGatewayUtil.getOutputArray();
        str = outputArray.toString();
        Assert.assertTrue("Вывод не верен", outputArray.toString().contains("Произведение - 24"));
    }


}
