package jp.co.primeservant.practiceudemyjenkins;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void triangleTest(){
        MyCalculator myCalculator = new MyCalculator();
        double result = myCalculator.calcTriangleSquare(4.0,2.5);
        double expected =  5;
        assertThat(result,is(expected));
    }


    @Test
    public void circleTest(){
        MyCalculator myCalculator = new MyCalculator();
        double result = myCalculator.calcCircleSquare(4.0);
        double expected =  50.24;
        assertThat(result,is(expected));
    }
}
