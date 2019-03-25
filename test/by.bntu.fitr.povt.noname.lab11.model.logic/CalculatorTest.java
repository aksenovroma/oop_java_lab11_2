package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Vector vector1;
    private Vector vector2;
    private Vector vector3;
    private Vector vector4;

    @BeforeTest
    public void setVector(){
        double[] array = {};
        vector1 = new Vector(4.7, 0.0, -5.1, -2.0, 3.0, 2.0, 7.4, 0.0, -1.3);
        vector2 = new Vector(null);
        vector3 = new Vector(array);
        vector4 = null;
    }

    @Test
    public void testSumOfNegativeElem(){
        double expected1 = -8.4;
        double actual1 = Calculator.sumOfNegativeElem(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testSumOfNegativeElemNullArray(){
        double expected2 = 0.0;
        double actual2 = Calculator.sumOfNegativeElem(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testSumOfNegativeElemEmptyArray(){
        double expected3 = 0.0;
        double actual3 = Calculator.sumOfNegativeElem(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testSumOfNegativeElemNullVector(){
        double expected3 = 0.0;
        double actual3 = Calculator.sumOfNegativeElem(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testProdOfElemBetweenMinAndMax(){
        double expected1 = -12.0;
        double actual1 = Calculator.prodOfElemBetweenMinAndMax(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testProdOfElemBetweenMinAndMaxNullArray(){
        double expected2 = 1.0;
        double actual2 = Calculator.prodOfElemBetweenMinAndMax(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testProdOfElemBetweenMinAndMaxEmptyArray(){
        double expected3 = 1.0;
        double actual3 = Calculator.prodOfElemBetweenMinAndMax(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testProdOfElemBetweenMinAndMaxNullVector(){
        double expected3 = 1.0;
        double actual3 = Calculator.prodOfElemBetweenMinAndMax(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfMaxElem(){
        int expected1 = 6;
        int actual1 = Calculator.indexOfMaxElem(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testIndexOfMaxElemNullArray(){
        int expected2 = -1;
        int actual2 = Calculator.indexOfMaxElem(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testIndexOfMaxElemEmptyArray(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfMaxElem(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfMaxElemNullVector(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfMaxElem(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfMinElem(){
        int expected1 = 2;
        int actual1 = Calculator.indexOfMinElem(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testIndexOfMinElemNullArray(){
        int expected2 = -1;
        int actual2 = Calculator.indexOfMinElem(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testIndexOfMinElemEmptyArray(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfMinElem(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfMinElemNullVector(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfMinElem(vector4);

        Assert.assertEquals(expected3, actual3);
    }
}
