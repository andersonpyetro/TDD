import br.com.pyetro.ClienteDao;
import br.com.pyetro.ClienteService;
import br.com.pyetro.IClienteDao;
import br.com.pyetro.dao.mocks.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService();
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

}
