package Controller;

import Entity.Cliente;
import Interfaces.IClienteModel;
import Interfaces.IClienteController;
import Model.ClienteModel;

public class ClienteController extends Controller implements IClienteController{

	IClienteModel clienteModel = new ClienteModel();
	
	public ClienteController() {
		// TODO Auto-generated constructor stub
		IClienteModel conectar = new ClienteModel();
		this.clienteModel = conectar;
	}
	
	public void inserir(Cliente cliente) throws Exception{
		clienteModel.inserir(cliente);
	}
	
	
}
