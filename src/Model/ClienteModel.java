package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.persistence.TypedQuery;

import Entity.Cliente;
import Entity.Debito;
import Interfaces.IClienteModel;

public class ClienteModel extends Base<Cliente, Integer> implements IClienteModel{

	public ArrayList<Cliente> listarClienteComDebito(Debito debito) throws  Exception{
		TypedQuery<Cliente> Clientes = this.em.createQuery("Select c.cliente from Debito c where c.status = "+ debito.getStatus(), Cliente.class);
		ArrayList<Cliente> listaClientes = (ArrayList<Cliente>) Clientes.getResultList();
		return listaClientes;
	}
}
