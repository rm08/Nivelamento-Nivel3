package recursoshumanos;

public class Vendedor extends Funcionario {

	public Double comissao;

	public Vendedor(Long cpf, Double salario, Double desconto, Double comissao) {
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}

	public static Double calcularSalario(Double salario, Double desconto, Double comissao) {
		return salario = (salario + comissao) - desconto;
	}
	
}
