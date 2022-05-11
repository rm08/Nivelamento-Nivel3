package Application;

import recursoshumanos.Funcionario;
import recursoshumanos.Vendedor;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf(12345678901l);
		funcionario.setSalario(1209.75);
		funcionario.setDesconto(102.35);

		System.out.println("Salário líquido: " + funcionario.calcularSalario(funcionario.getSalario(), funcionario.getDesconto()));
	
		Vendedor vendedor = new Vendedor(12345678902l, 1620.50, 120.45, 50.55);
		
		System.out.println("Salário líquido: " + vendedor.calcularSalario(vendedor.salario, vendedor.desconto, vendedor.comissao));
		
	}

}
