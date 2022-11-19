import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationsTest {
    StringOperations stringOperations = new StringOperations();


    @Test
    void palindromeIsTrue(){
        assertTrue(stringOperations.isPalindrome("kajak"));
    }

    @Test
    void shouldReturnReverseString(){
        assertEquals("abyr", stringOperations.reverse("ryba"));
    }

    @Test
    void reversingOneLetterWord(){
        assertEquals("S", stringOperations.reverse("S"));
    }

    @Test
    void shouldConcatTwoWords(){
        assertEquals("Orange Juice", stringOperations.concat("Orange", " Juice"));
    }

    @Test
    void shouldReturnNull(){
        assertEquals(null, stringOperations.concat("",""));
    }





}