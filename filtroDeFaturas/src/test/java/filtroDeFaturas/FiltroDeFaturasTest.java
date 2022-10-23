package filtroDeFaturas;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroDeFaturasTest {
	
	
    private ClienteController clienteController;
    
    @BeforeEach
    public void before() {
        this.clienteController = new ClienteController();
    }
	
	@Test
	void cadastrarClienteComDadosCorretos() throws ParseException {
		Cliente cliente = new Cliente("Maicao", "10/05/2022", "Paraiba");
		
		Assertions.assertEquals(cliente.getNome(), "Maicao");
        Assertions.assertEquals(cliente.getEstado(), "Paraiba");
	}
	
	@Test
    void criarFaturaComDadosCorretos() throws ParseException {
		String cliente = clienteController.VerificaECriaCliente("Eli", "03/02/2022", "Rio Grande do Norte");
		Fatura fatura = new Fatura("4442", 1900, "10/05/2022", cliente);

        Assertions.assertEquals(fatura.getValor(), 1900);
        Assertions.assertEquals(fatura.getCodigo(), "4442");
    }
	
	@Test
	void criarFaturaComValorNegativo() throws ParseException{
		String cliente = clienteController.VerificaECriaCliente("Angelo", "03/02/2022", "Rio Grande do Norte");
		Fatura fatura = new Fatura("44432", -500, "10/05/2022", cliente);

		try {
			fatura.checaValor(fatura.getValor());
		} catch (RuntimeException e) {
			Assertions.assertEquals("Valor negativo!", e.getMessage());
		}
    }
}
