package funcionario;

public enum Cargo implements Salario {

    DBA, DESENVOLVEDOR {
        @Override
        public double calcularSalarioLiquido(double salarioBase) {
            double salarioLiquido;
            if (salarioBase >= 3000) {
                salarioLiquido = salarioBase - ((salarioBase * 20) / 100);
            } else {
                salarioLiquido = salarioBase - ((salarioBase * 10) / 100);
            }
            return salarioLiquido;
        }
    }
}
