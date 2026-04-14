/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



import java.util.Arrays;
import java.util.List;
import static org.hibernate.query.sqm.tree.SqmNode.log;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author danto
 */
public class TestCase {
    
    public TestCase() {
    }
    
    /* the method within the @BeforeAll and @AfterAll annotations needs to be static, otherwise the code won’t compile.*/
    @BeforeAll
    public static void setUpClass() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }
    
    @AfterAll
    public static void tearDownClass() {
        log.info("@AfterAll - executed after all test methods");
    }
    
    @BeforeEach
    public void setUp() {
        log.info("@BeforeEach - executes before each test method in this class");
    }
    
    @AfterEach
    public void tearDown() {
        log.info("@AfterEach - executed after each test method");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. 

    @DisplayName("test unico")
    @Test
    void TestCase(){
       log.info("sucesso");
}
    @Test
    @Disabled("Nao foi implementado")
    void TestCase2() {
}
    /*assert servem para garantir que certos metodos vao ter um certo resultado esperado
    
    one advantage of using the lambda expression for the assertion message is that it’s lazily evaluated, 
    which can save time and resources if the message construction is expensive.
    */
    @Test
    void TestCaseLambdaExpressions(){
       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(numeros.stream().mapToInt(Integer::intValue).sum() > 5, () -> "sum tem que ser maior que 5");
        log.info("sucesso");
    }
    
    /*group assertions allow us to pinpoint the exact location of any failure. as its showed in the error report*/
    @Test
    void TestCaseGroupAssertions(){
        int[] numerosArray = {0,1,2,3,4};
         assertAll("numerosArray",
         () -> assertEquals(numerosArray[1], 1),
         () -> assertEquals(numerosArray[3], 3),
         () -> assertEquals(numerosArray[4], 4)
     );
    }
}
