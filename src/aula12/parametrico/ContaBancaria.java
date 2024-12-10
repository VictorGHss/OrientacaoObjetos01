package aula12.parametrico;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;

	public ContaBancaria(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");

		this.calcularRendimento();
	}

	private void calcularRendimento() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	public void imprimirSaldo() {

		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("===============================");
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		if (titular != "") {

			this.titular = titular;
		}
	}
}