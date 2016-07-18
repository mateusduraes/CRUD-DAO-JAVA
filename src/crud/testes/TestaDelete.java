package crud.testes;

import crud.dao.ClienteDAO;
import crud.model.Cliente;

public class TestaDelete {
	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente(null, null);
		cliente.setId(1);
		clienteDAO.remove(cliente);
	}
}
