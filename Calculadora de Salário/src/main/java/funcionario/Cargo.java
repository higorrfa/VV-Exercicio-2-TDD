package funcionario;

public enum Cargo implements Salario {

    DESENVOLVEDOR {
        @Override
        public double calcularSalarioLiquido(double valor) {
            return 0;
        }
    }
}
