package ar.org.icaro.automatizacion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatematicaTest {

    @Test
    public void deberiaRetornarElMismoNumeroAlSumarCero() {

        //Codigo a ejecutar
        int resultado = Matematica.suma(1, 0);

        //Verificamos que el resultado sea el esperado
        Assert.assertEquals(resultado,1,"Sumar 0 deberia devolver el mismo numero");
    }
}
