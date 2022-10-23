package filtroDeFaturas;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiltroDeFaturasTest {
	
	@Test
	void cadastrarClienteComDadosCorretos() throws ParseException {
		Fatura fatura = new Fatura("423234", 1900, "25/05/2022");
		Fatura[] faturas = new Fatura[]{fatura};
		Cliente cliente = new Cliente("Maicao", "19/04/2022", "PB", faturas);
		
		Assertions.assertEquals(cliente.getNome(), "Maicao");
        Assertions.assertEquals(cliente.getEstado(), "PB");
	}
	
	@Test
    public void criarFaturaComDadosCorretos() throws ParseException {
		Fatura fatura = new Fatura("423234", 1900, "25/05/2022");

        Assertions.assertEquals(fatura.getValor(), 1900);
        Assertions.assertEquals(fatura.getCodigo(), "423234");
    }
	
	@Test()
	public void criarFaturaComValorNegativo() throws ParseException{
		Fatura fatura = new Fatura("6503", -650.40, "25/05/2022");
		
		try {
			fatura.checaValor(fatura.getValor());
		} catch (RuntimeException e) {
			Assertions.assertEquals("Valor negativo!", e.getMessage());
		}
    }
}
