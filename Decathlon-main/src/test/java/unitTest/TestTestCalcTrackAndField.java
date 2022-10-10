package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestTestCalcTrackAndField {

    @Test
    public void TestCalcTrackAndField(){


        double A= 25.4347;
        double B= 18.0;
        double C= 1.81;
        double time= 11.0;


        CalcTrackAndField cal= new CalcTrackAndField();

        int actual=cal.calculateTrack(A,B,C,time);

        int expected=861;






        assertEquals(expected, actual);



    }





}
