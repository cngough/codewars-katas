package uk.chrisgough.sandbox.codewars.fifthkyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("notherAay unfay tringsay !", PigLatin.pigIt("Another fun string !"));
    }
}