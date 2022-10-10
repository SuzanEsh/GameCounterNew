package unitTest;
import common.CalcTrackAndField;
import common.InputResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestInputResult {

    @Test
            public void TestInputResult(){


        ByteArrayInputStream in = new ByteArrayInputStream("11".getBytes());
        System.setIn(in);



        InputResult myInput = new InputResult();



        //Act
        myInput.enterResult();
        double actual = myInput.returnResult();


        double  expected=11.0;

        Assertions.assertEquals(expected,actual);







    }





    //Arrange

}
