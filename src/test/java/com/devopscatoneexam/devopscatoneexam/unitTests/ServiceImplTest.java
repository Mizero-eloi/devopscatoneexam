
import main.java.com.devopscatoneexam.devopscatoneexam.service.MathOperator;
import main.java.com.devopscatoneexam.devopscatoneexam.serviceImpl.MathOperatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceImplTest {

    private MathOperator mathService = new MathOperatorImpl();


    @Test
    public void additionReturnNumber(){
        double actualResult = mathService.doMath(5.0,2.0,"+");
        double expectedResults = 7.0;
        assertEquals(actualResult,expectedResults);
    }

    @Test
    public void subtractionReturnCorrectNumber(){
        double actualResult = mathService.doMath(7.0,2.0,"-");
        double expectedResults = 5.0;
        assertEquals(actualResult,expectedResults);
    }

    @Test
    public void MultiplicationReturnCorrectNumber(){
        double actualResult = mathService.doMath(5.0,2.0,"*");
        double expectedResults = 10.0;
        assertEquals(actualResult,expectedResults);
    }

    @Test
    public void divisionReturnCorrectNumber(){
        double actualResult = mathService.doMath(10.0,2.0,"/");
        double expectedResults = 5.0;
        assertEquals(actualResult,expectedResults);
    }

    @Test
    public void powerReturnCorrectNumber(){
        double actualResult = mathService.doMath(5.0,2.0,"**");
        double expectedResults = 25.0;
        assertEquals(actualResult,expectedResults);
    }


}
