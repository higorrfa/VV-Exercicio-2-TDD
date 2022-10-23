package filtroDeFaturas;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FaturaTest {
	
	Calendar data = Calendar.getInstance();

	@Test
    public void criarFaturaComDadosCorretos() {
        data.set(2022, 5, 10);
        Fatura fatura = new Fatura("6503d", 650.40, data);

        Assertions.assertEquals(fatura.getValor(), 650.40);
        Assertions.assertEquals(fatura.getCodigo(), "6503d");
        Assertions.assertEquals(fatura.getData(), data);
    }

    @Test()
	public void criarFaturaComValorNegativo() {
		data.set(2022, 6, 10);
		Fatura fatura = new Fatura("6503d", -650.40, data);
		
		try {
			fatura.checaValor(fatura.getValor());
		} catch (RuntimeException e) {
			Assertions.assertEquals("Valor negativo!", e.getMessage());
		}
    }

    @Test()
	public void criarFaturaComValorNulo() {
		data.set(2022, 6, 10);
		Fatura fatura = new Fatura("6503d", null, data);
		
		try {
			fatura.checaValor(fatura.getValor());
		} catch (RuntimeException e) {
			Assertions.assertEquals("Valor nulo!", e.getMessage());
		}
    }
}
