package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.Number;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {
    Number number;

    @BeforeEach
    void setUp(){number = new Number();}

    @Test
    void testPositiveNumber(){

        boolean res = number.evenOddNumber(2);
        assertTrue(res);
    }


    @Test
    void testNegativeNumber(){

        boolean res = number.evenOddNumber(1);
        assertFalse(res);}


    @ParameterizedTest
    @ValueSource(ints ={26,30,99})
    void testTheNumIncludes(int val){
        boolean actual = number.numberInInterval(val);
        assertTrue(actual);

    }
    @ParameterizedTest
    @ValueSource(ints ={23,0,24,100})
    void testTheNumDoNotIncludes(int val){
        boolean actual = number.numberInInterval(val);
        assertFalse(actual);}
}
