package br.com.pyetro;

public class ClienteDao implements IClienteDao {
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("não funciona sem config de banco");
    }
}
