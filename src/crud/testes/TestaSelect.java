package crud.testes;

import java.util.List;

import crud.dao.ClienteDAO;
import crud.model.Cliente;

public class TestaSelect {
	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.getLista();
		
		lista.forEach(cliente -> System.out.println(cliente));
		
	}
}
