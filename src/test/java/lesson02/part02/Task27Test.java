package lesson02.part02;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(JUnit4.class)

public class Task27Test {
    private static String fileName = "./src/main/java/lesson02/part02/Task27.java";

    @Before
    public void setUp() throws Exception {
        SystemOutGatewayUtil.setCustomOut();
    }

    @After
    public void tearDown() throws Exception {
        SystemOutGatewayUtil.setOriginalOut();
        SystemOutGatewayUtil.clearOutput();
    }

    @Test
    public void task27ifPrintWasUsed() {
        boolean isPrintUsed = false;
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> collect = stream.collect(Collectors.toList());
            for (String s : collect) {
                if (s.contains("System.out.println()") || s.contains("System.out.print()")) {
                    isPrintUsed = true;
                    break;
                }
            }
            Assert.assertTrue("Программа должна содержать консольный вывод.",
                    isPrintUsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void task27ifKeyboardInput() {
        boolean isInputExist = false;
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> collect = stream.collect(Collectors.toList());
            for (String s : collect) {
                if (s.contains("nextInt()") || s.contains("nextLine()") || s.contains("readLine()")) {
                    isInputExist = true;
                    break;
                }
            }
            Assert.assertTrue("Программа должна получать числа с клавиатуры",isInputExist);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void task27ifOnlyOneOutput() {
        int inputLOCCount = 0;
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> collect = stream.collect(Collectors.toList());
            for (String s : collect) {
                if (s.contains("System.out.println()") || s.contains("System.out.print()")) {
                    inputLOCCount++;
                }
            }
            Assert.assertEquals("Программа должна выводить только строку-описание числа и больше ничего.",
                    1,inputLOCCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void task27isOneDigitEven() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число четное и имеет одну цифру, вывести \"четное однозначное число\".",
                "четное однозначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isOneDigitOdd() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число нечетное и имеет одну цифру, вывести \"нечетное однозначное число\".",
                "нечетное однозначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isTwoDigitEven() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число четное и имеет две цифры, вывести \"четное двузначное число\".",
                "четное двузначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isTwoDigitOdd() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число нечетное и имеет две цифры, вывести \"нечетное двузначное число\".",
                "нечетное двузначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isThreeDigitEven() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число четное и имеет три цифры, вывести \"четное трехзначное число\".",
                "четное трехзначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isThreeDigitOdd() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если число нечетное и имеет три цифры, вывести \"нечетное трехзначное число\".",
                "нечетное трехзначное число",result.split("\n")[0]);
        stream.reset();
    }

    @Test
    public void task27isInInterval() throws Exception {
        Task27.main(null);
        ByteArrayOutputStream stream = SystemOutGatewayUtil.getOutputArray();
        String result = stream.toString();
        Assert.assertEquals("Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран",
                "",result);
        stream.reset();
    }
}