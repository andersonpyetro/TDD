package br.com.pyetro;

public class ContratoService implements IContratoService{
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem o banco");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não funciona sem o banco");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Não funciona sem o banco");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Não funciona sem o banco");
    }
}
