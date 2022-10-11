package unitTest;

import decathlon.Deca100M;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class TestDeca100M1 {

    @Test
    public void TestDeca100M1() {

        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        Deca100M cal = new Deca100M();

        String actual = cal.calculateResult(4);
        String expected = "Value too low";

        Assertions.assertEquals(expected, actual);


    }
}