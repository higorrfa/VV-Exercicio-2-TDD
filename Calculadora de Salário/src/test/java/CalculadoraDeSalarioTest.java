package test.java;


import funcionario.*;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraDeSalarioTest {

    @Test
    public void calculaSalarioDesenvolvedor() {
        double salarioBase = 5000.00;
        Funcionario funcionario = new Funcionario("Jose", "jose@email.com", salarioBase, Cargo.DESENVOLVEDOR);
        Assertions.assertEquals(this.calculadora.calcularSalario(funcionario), 4000.00);
    }
}