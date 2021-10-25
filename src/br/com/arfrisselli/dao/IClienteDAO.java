package br.com.arfrisselli.dao;

import br.com.arfrisselli.domain.Cliente;

import java.util.Collection;

/**
 * @author arfrisselli
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
