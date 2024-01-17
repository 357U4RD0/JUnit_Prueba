import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {

    @Test
    public void testSumar() {
        //En caso que el resultado sea 15, el programa funciona como debería
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(8, 7);
        assertEquals(15, resultado);
    }
}
