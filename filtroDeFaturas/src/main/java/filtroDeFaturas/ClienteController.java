package filtroDeFaturas;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class ClienteController {
	
	private Map<String, Cliente> clientes;

	public ClienteController() {
        this.clientes = new HashMap<>();
    }
	
	public String VerificaECriaCliente(String nome, String dataDeInclusao, String estado) {
        try {
            Cliente cliente = new Cliente(nome, dataDeInclusao, estado);
            this.clientes.put(cliente.getGuid(), cliente);
            return cliente.getGuid();
        } catch (ParseException exception) {
            System.out.println(exception);
        }
        return null;
    }
	
	public Cliente getCliente(String cliente) {
        return this.clientes.get(cliente);
    }
}
