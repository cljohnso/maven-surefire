package junitplatform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;


public class FlakyFirstTimeTest
{
    private static int failingCount = 0;

    private static int errorCount = 0;


    @Test
    public void testFailingTestOne()
    {
        System.out.println( "Failing test" );
        // This test will fail with only one retry, but will pass with two
        if ( failingCount < 2 )
        {
            failingCount++;
            fail( "Failing test" );
        }
    }

    @Test
    public void testErrorTestOne() throws Exception
    {
        System.out.println( "Error test" );
        // This test will error out with only one retry, but will pass with two
        if ( errorCount < 2 )
        {
            errorCount++;
            throw new IllegalArgumentException( "..." );
        }
    }

    @Test
    public void testPassingTest() throws Exception
    {
        System.out.println( "Passing test" );
    }
}
