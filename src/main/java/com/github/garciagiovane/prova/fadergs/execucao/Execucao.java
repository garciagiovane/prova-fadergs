package com.github.garciagiovane.prova.fadergs.execucao;

import javax.swing.JOptionPane;

import com.github.garciagiovane.prova.fadergs.gerenciamento.Gerenciamento;

public class Execucao {

	public static void main(String[] args) {
		Gerenciamento gerenciamento = new Gerenciamento();
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção " + "\n1 - Cadastrar Produto" + "\n2 - Buscar Produtos" + "\n3 - Excluir"
							+ "\n4 - Listar Produtos" + "\n5 - Sair"));

			switch (opcao) {
			case 1:
				gerenciamento.cadastrarProduto();
				break;
			case 2:
				gerenciamento.buscarProdutos();
				break;
			case 3:
				gerenciamento.excluirProduto();
				break;
			case 4:
				gerenciamento.listarProduto();
				break;
			case 5:
				System.exit(1);
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 5);
	}
}
