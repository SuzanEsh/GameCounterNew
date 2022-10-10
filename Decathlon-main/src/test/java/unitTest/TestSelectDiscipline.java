package unitTest;
import common.CalcTrackAndField;
import common.InputResult;
import common.InputSelection;
import common.SelectDiscipline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
public class TestSelectDiscipline {

    @Test
    public void TestSelectDiscipline(){

        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);

       InputSelection select=new  InputSelection();
        select.inputSelection();

        int actual=select.returnSelection();

        int expected=3;

        Assertions.assertEquals(expected,actual);













    }



}
