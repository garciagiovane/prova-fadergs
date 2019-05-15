package com.github.garciagiovane.prova.fadergs.gerenciamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.github.garciagiovane.prova.fadergs.Produto;

public class Gerenciamento {
	ArrayList<Produto> produtos = new ArrayList<>();
	public void cadastrarProduto(){
		int opcao =  Integer.parseInt(JOptionPane.showInputDialog("Qual produto deseja cadastrar?"
				+ "\n1 - Alimento"
				+ "\n2 - Produto de bazar"));
		int sabeValidade;
		switch (opcao) {
		case 1:
			String tipo = "alimento";
			do {
				sabeValidade = Integer.parseInt(JOptionPane.showInputDialog("Você sabe a data de validade?"
						+ "\n1 - Sim"
						+ "\n2 - Não"));
			} while (sabeValidade != 1 && sabeValidade != 2);
			
			if (sabeValidade == 1) {
				String nome = JOptionPane.showInputDialog("Digite o nome ");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor ").replaceAll(",", "."));				
				String validade = JOptionPane.showInputDialog("Digite o prazo de validade. Ex: dd/mm/AAAA");				
				
				Produto produto = new Produto(nome, valor, tipo);
				produto.setPrazoValidade(validade);				
				produtos.add(produto);
			} else {
				String nome = JOptionPane.showInputDialog("Digite o nome ");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor ").replaceAll(",", "."));	
				
				Produto produto = new Produto(nome, valor, tipo);
				produtos.add(produto);
			}
			
			break;
		case 2:
			tipo = "bazar";
			do {
				sabeValidade = Integer.parseInt(JOptionPane.showInputDialog("Você sabe a marca?"
						+ "\n1 - Sim"
						+ "\n2 - Não"));
			} while (sabeValidade != 1 && sabeValidade != 2);
			
			if (sabeValidade == 1) {
				String nome = JOptionPane.showInputDialog("Digite o nome ");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor ").replaceAll(",", "."));				
				String marca = JOptionPane.showInputDialog("Digite a marca ");		
				
				Produto produto = new Produto(nome, valor, tipo);
				produto.setMarca(marca);
				produtos.add(produto);
			} else {
				String nome = JOptionPane.showInputDialog("Digite o nome ");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor ").replaceAll(",", "."));	
				
				Produto produto = new Produto(nome, valor, tipo);
				produtos.add(produto);
			}
			break;
		default:
			break;
		}
	}
	
	public void buscarProdutos() {
		String produtoParaPesquisa = JOptionPane.showInputDialog("Digite o nome do produto");
		boolean resposta = false;
		for (Produto produto : produtos) {
			if (produto.getNome().equals(produtoParaPesquisa)) {
				System.out.println("Nome: " + produto.getNome()
				+ "\nValor: " + produto.getValor());
				resposta = true;
			}
		}
		if (!resposta) {
			System.out.println("Produto inexistente");
		}
	}
	
	public void excluirProduto(){
		String produtoParaExclusao = JOptionPane.showInputDialog("Digite o nome do produto");
		boolean resposta = false;
		if (!produtos.isEmpty()) {
			for (int i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).getNome().equals(produtoParaExclusao)) {
					produtos.remove(produtos.get(i));
					resposta = true;
				}
			}
			if (resposta) {
				System.out.println("Produto Excluído");
			}
		}else {
			System.out.println("Nenhum produto encontrado");
		}
		
	}
	
	public void listarProduto(){
		if (!produtos.isEmpty()) {
			produtos.forEach(p -> {
				System.out.println("Nome: " + p.getNome()
				+ "\nValor: " + p.getValor());
			});
		}else {
			System.out.println("Nenhum produto cadastrado");
		}
	}
}
