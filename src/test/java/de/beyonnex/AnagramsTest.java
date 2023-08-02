package de.beyonnex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    private final Anagrams anagrams = new Anagrams();

    @Test
    public void shouldReturnFalseWhenEitherInputStringIsNull() {
        assertFalse(anagrams.isAnagrams("anagram", null));
        assertFalse(anagrams.isAnagrams(null, null));
    }

    @Test
    public void shouldReturnTrueWhenInputStringAreAnagrams() {
        assertTrue(anagrams.isAnagrams("anagram", "magaran"));
        assertTrue(anagrams.isAnagrams("car", "arc"));
        assertTrue(anagrams.isAnagrams("map", "pam"));
        assertTrue(anagrams.isAnagrams("hannah", "hannah"));
    }

    @Test
    public void shouldReturnFalseWhenInputStringAreNotAnagrams() {
        assertFalse(anagrams.isAnagrams("anagram", "togaran"));
    }

    @Test
    public void shouldReturnFalseWhenInputStringsAreOfDifferentLengthMakingThemNonAnagrams() {
        assertFalse(anagrams.isAnagrams("anagram", "aanagramss"));
    }

    @Test
    public void shouldReturnTrueWhenInputStringsWithDifferentCasesAreAnagrams() {
        assertTrue(anagrams.isAnagrams("Anagram", "magarAn"));
    }

    @Test
    public void shouldReturnFalseWhenInputStringsWithDifferentCasesAreNotAnagrams() {
        assertFalse(anagrams.isAnagrams("Anagram", "magaran"));
    }

    @Test
    public void shouldReturnTrueWhenInputStringsWithSpecialCharsAreAnagrams() {
        assertTrue(anagrams.isAnagrams("anagram$", "$magaran"));
    }

    @Test
    public void shouldReturnFalseWhenInputStringsWithSpecialCharsAreNotAnagrams() {
        assertFalse(anagrams.isAnagrams("anagram$", "@magaran"));
    }
}