package filtroDeFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

	Calendar dataDeInclusao = Calendar.getInstance();
	
	@Test
	void cadastrarClienteComDadosCorretos() {
		dataDeInclusao.set(2022, 2, 9);
		Cliente cliente = new Cliente("Maicao", dataDeInclusao, "PB");
		
		Assertions.assertEquals(cliente.getNome(), "Maicao");
        Assertions.assertEquals(cliente.getDataDeInclusao(), dataDeInclusao);
        Assertions.assertEquals(cliente.getEstado(), "PB");
	}

}
