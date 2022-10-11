package unitTest;

import decathlon.Deca100M;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class TestDeca100M{

    @Test
    public void TestDeca100M(){

        ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
        System.setIn(in);
        Deca100M cal=new Deca100M();


        String actual= cal.calculateResult(11);
        String expected= "The result is 861";

        Assertions.assertEquals(expected,actual);








    }
}
