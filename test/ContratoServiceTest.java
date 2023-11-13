import br.com.pyetro.ContratoDao;
import br.com.pyetro.ContratoService;
import br.com.pyetro.IContratoDao;
import br.com.pyetro.IContratoService;
import br.com.pyetro.dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService();
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService();
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService();
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService();
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService();
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService();
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
