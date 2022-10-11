package unitTest;
import common.CalcTrackAndField;
import common.InputName;
import common.InputResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestInputName {

    @Test
    public void TestInputName(){

        ByteArrayInputStream in = new ByteArrayInputStream("Suzan".getBytes());
        System.setIn(in);



        InputName myInput = new InputName();



        //Act

        String actual = myInput.addCompetitor();


        String  expected="Suzan";

        Assertions.assertEquals(expected,actual);






    }

    @Test
    public void TestFelInputName(){

        ByteArrayInputStream in = new ByteArrayInputStream(("#").getBytes());
        System.setIn(in);

        InputName myInput = new InputName();
     //   myInput.addCompetitor1();

        //Act

        String actual = myInput.addCompetitor1();

        String  expected="Only use letters when putting in competitors name.";

        Assertions.assertEquals(expected,actual);
    }








}
