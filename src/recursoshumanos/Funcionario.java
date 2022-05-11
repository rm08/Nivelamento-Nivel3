package recursoshumanos;

public class Funcionario {
	public Long cpf;
	public Double salario;
	public Double desconto;
	
	public Funcionario() {
	}

	public Funcionario(Long cpf, Double salario, Double desconto) {
		super();
		this.cpf = cpf;
		this.salario = salario;
		this.desconto = desconto;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public static Double calcularSalario(Double salario, Double desconto) {
		return salario - desconto;
	}
	
}
