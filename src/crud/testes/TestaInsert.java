package crud.testes;

import crud.dao.ClienteDAO;
import crud.model.Cliente;

public class TestaInsert {
	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente("Mateus Durães", 22);
		clienteDAO.adiciona(cliente);		
	}
}
