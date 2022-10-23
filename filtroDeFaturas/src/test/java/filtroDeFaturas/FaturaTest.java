package filtroDeFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FaturaTest {

	@Test
    public void criarFaturaComDadosCorretos() {
        Calendar data = Calendar.getInstance();
        data.set(2022, 5, 10);
        Fatura fatura = new Fatura("6503d", 650.40, data);

        Assertions.assertEquals(fatura.getValor(), 650.40);
    }

}
