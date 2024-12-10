package aula12.parametrico;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> listaContas;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.listaContas = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
		this.listaContas.add(cb);

		System.out.println("Conta " + numeroConta + " criada com sucesso.");
	}

	public void removerConta(int numeroConta) {

		for (ContaBancaria cb : this.listaContas) {

			if (cb.getNumero() == numeroConta) {

				this.listaContas.remove(cb);

				System.out.println("Conta " + numeroConta + " removida com sucesso.");
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void verificarSaldoConta(int numeroConta) {

		for (ContaBancaria cb : listaContas) {

			if (cb.getNumero() == numeroConta) {

				System.out.println("===============================");
				System.out.println("CNPJ: " + this.cnpj);
				System.out.println("Nome: " + this.nome);

				cb.imprimirSaldo();
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (ContaBancaria cb : listaContas) {

			if (cb.getNumero() == numeroConta) {

				cb.sacar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (ContaBancaria cb : listaContas) {

			if (cb.getNumero() == numeroConta) {

				cb.depositar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void listarTodasContas() {

		for (int i = 0; i < this.listaContas.size(); i++) {

			ContaBancaria cb = this.listaContas.get(i);

			cb.imprimirSaldo();
		}
	}
}