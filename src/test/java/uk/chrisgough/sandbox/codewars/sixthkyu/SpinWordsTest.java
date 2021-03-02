package uk.chrisgough.sandbox.codewars.sixthkyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SpinWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }


}