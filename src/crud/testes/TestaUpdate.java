package crud.testes;

import crud.dao.ClienteDAO;
import crud.model.Cliente;

public class TestaUpdate {
	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente("Nome Atualizado", 40);
		cliente.setId(2);
		clienteDAO.atualiza(cliente);
	}
}
