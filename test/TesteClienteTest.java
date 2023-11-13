import org.junit.Assert;
import org.junit.Test;

import br.com.pyetro.service.TesteCliente;

public class TesteClienteTest {
    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Anderson");
        cli.adicionarNome1("Anderson");

        Assert.assertEquals("Anderson", cli.getNome());
    }

}
