package unitTest;

import common.CalcTrackAndField;
import common.InputResult;
import common.SelectDiscipline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
public class TestSelectDiscipline {

    @Test
    public void TestSelectDiscipline(){

        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);

        SelectDiscipline select=new  SelectDiscipline ();

        String actual=select.inputSelection1();

        String expected="3";

        Assertions.assertEquals(expected,actual);













    }



        @Test
        public void TestSelectDiscipline1(){

            ByteArrayInputStream in = new ByteArrayInputStream("Hej".getBytes());
            System.setIn(in);

            SelectDiscipline select=new  SelectDiscipline ();

            String actual=select.inputSelection1();

            String expected="Invalid input, try again.";

            Assertions.assertEquals(expected,actual);













        }



}
