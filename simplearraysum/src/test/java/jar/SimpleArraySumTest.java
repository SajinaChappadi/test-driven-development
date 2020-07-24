package jar;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for SimpleArraySum
 */
public class SimpleArraySumTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calculateArraySumShouldReturnSumOfArrayElements()
    {
        //Arrange
        int expectedResult = 10;
        int arr[] = {1,2,3,4};

        //Act
        int actualResult = SimpleArraySum.calculateArraySum(arr);

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateArraySumShouldReturnZeroForEmptyArray()
    {
        //Arrange
        int expectedResult = 0;
        int arr[] = {};
        
        //Act
        int actualResult = SimpleArraySum.calculateArraySum(arr);

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateArraySumShouldReturnTheMemberValueForSingleElementArray()
    {
        //Arrange
        int expectedResult = 1000;
        int arr[] = {1000};
        
        //Act
        int actualResult = SimpleArraySum.calculateArraySum(arr);

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateArraySumShouldReturnTheSumOfElementsBetweenZeroAndThousand()
    {
        //Arrange
        int expectedResult = 1210;
        int arr[] = {-1, 1000, 1001, 10, 200};
        
        //Act
        int actualResult = SimpleArraySum.calculateArraySum(arr);

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }
}
