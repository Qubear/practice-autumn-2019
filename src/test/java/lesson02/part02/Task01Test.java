package lesson02.part02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Task01Test {
    @Before
    public void setUp() {
        SystemOutGatewayUtil.setCustomOut();
    }

    @After
    public void tearDown() {
        SystemOutGatewayUtil.clearOutput();
        SystemOutGatewayUtil.setOriginalOut();
    }

    @Test
    public void checkOutput() {
        Task01.main(null);

        ByteArrayOutputStream output = SystemOutGatewayUtil.getOutputArray();
        Assert.assertTrue("The program must output text", output.toString().length() > 0);
    }

    @Test
    public void checkAdjustAgeOutput() {
        Task01.Person person = new Task01.Person();
        person.adjustAge(20);

        ByteArrayOutputStream output = SystemOutGatewayUtil.getOutputArray();
        Assert.assertTrue("Method adjustAge must output text", output.toString().length() > 0);
    }

    @Test
    public void checkAdjustAgeParams() {
        Method method;
        try {
            method = Task01.Person.class.getMethod("adjustAge", int.class);
            Assert.assertTrue("Method adjustAge must return void", method.toString().contains("void"));
        } catch (NoSuchMethodException e) {
            Assert.fail("Method adjustAge must contain one parameter type of int");
        }
    }


    @Test
    public void checkAdjusting() {
        Task01.Person person = new Task01.Person();
        person.adjustAge(20);

        Assert.assertEquals("Method adjustAge must adjust person age by 20",
                40,
                person.age
        );
    }
}