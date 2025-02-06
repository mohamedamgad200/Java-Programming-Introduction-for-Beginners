package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @DisplayName("Equals and Not Equals")
    @Test
    @Order(1)
    void testEqualsAndNotEquals() {
        //System.out.println("Running test: testEqualsAndNotEquals");
        // set up
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
    }


    @DisplayName("Null and Not Null")
    @Test
    @Order(2)
    void testNullAndNotNull() {
        //System.out.println("Running test: testNullAndNotNull");
        String str1 = null;
        String str2 = "luv2code";
        assertNull(demoUtils.checkNull(str1), "Object should be no null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    public void testSameAndNotSame() {
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademyDuplicate(), "Objects should not refer to same object");
    }


    @DisplayName("True and False")
    @Test
    public void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return true");
    }


    @DisplayName("Array Equals")
    @Test
    public void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @DisplayName("Iterable equals")
    @Test
    public void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @DisplayName("Lines match")
    @Test
    public void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    public void testThrowsAndDoesNotTrows() {
        assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        }, "Should throw exception");
        assertDoesNotThrow(() -> {
            demoUtils.throwException(9);
        }, "Should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    public void testTimeout()
    {
        assertTimeoutPreemptively(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();});
    }




    /*
    @AfterEach
    void tearDownAfterEach()
    {

        System.out.println("Running @AfterEach");
        System.out.println();
    }
    @BeforeAll
    static void setupBeforeAll()
    {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }
    @AfterAll
    static void  tearDownAfterAll()
    {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }
     */
}
