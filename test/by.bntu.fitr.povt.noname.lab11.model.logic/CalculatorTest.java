package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Vector vector1;
    private Vector vector2;
    private Vector vector3;
    private double[] doubleArray1 = {4.7, 0.0, -5.1, -2.0, 3.0, 2.0, 7.4, 0.0, -1.3};
    private double[] doubleArray2 = null;
    private double[] doubleArray3 = {};

    @BeforeTest
    public void setVector(){
        vector1 = new Vector(doubleArray1);
        vector2 = new Vector(doubleArray2);
        vector3 = new Vector(doubleArray3);
    }

    @Test
    public void sumOfNegativeElemTest(){
        double expected1 = -8.4;
        double actual1 = Calculator.sumOfNegativeElem(vector1);

        double expected2 = 0.0;
        double actual2 = Calculator.sumOfNegativeElem(vector2);

        double expected3 = 0.0;
        double actual3 = Calculator.sumOfNegativeElem(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void prodOfElemBetweenMinAndMaxTest(){
        double expected1 = -12.0;
        double actual1 = Calculator.prodOfElemBetweenMinAndMax(vector1);

        double expected2 = 1.0;
        double actual2 = Calculator.prodOfElemBetweenMinAndMax(vector2);

        double expected3 = 1.0;
        double actual3 = Calculator.prodOfElemBetweenMinAndMax(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void indexOfMaxElemTest(){
        int expected1 = 6;
        int actual1 = Calculator.indexOfMaxElem(vector1);

        int expected2 = -1;
        int actual2 = Calculator.indexOfMaxElem(vector2);

        int expected3 = -1;
        int actual3 = Calculator.indexOfMaxElem(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void indexOfMinElemTest(){
        int expected1 = 2;
        int actual1 = Calculator.indexOfMinElem(vector1);

        int expected2 = -1;
        int actual2 = Calculator.indexOfMinElem(vector2);

        int expected3 = -1;
        int actual3 = Calculator.indexOfMinElem(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }
}
