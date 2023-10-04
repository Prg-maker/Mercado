package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Produto;
import java.util.Map;

public class Mercado {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	
	private static  Map<Produto , Integer> carrinho;
	
	public static void main(String[] args) {
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}
	
	
	private static void menu() {
		
		System.out.println("------------------------------------------------------");
		System.out.println("-------------Bem vindos a Ze Market---------------");
		System.out.println("------------------------------------------------------");
		System.out.println("***** Selecione uma operação que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - Cadastrar	    |");
		System.out.println("|   Opção 2 - Listar 		|");
		System.out.println("|   Opção 3 - Comprar 		|");
		System.out.println("|   Opção 4 - Carrinho      |");
		System.out.println("|   Opção 5 - Sair          |");
		
		int option = input.nextInt();
		
		switch (option) {
		case 1: {
			cadastrarProdutos();
			break;
		}
		case 2:{
			listarProdutos();
			break;
		}
		case 3:{
			comprarProdutos();
			break;
		}
		case 4:{
			verCarrinho();
			break;
		}
		case 5:{
			System.out.println("Volte sempre");
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
		
	}
	
	private static void cadastrarProdutos() {
		System.out.println("Nome do produto: ");
		String nome = input.next();
		
		System.out.println("Preço do produto: ");
		Double preco = input.nextDouble();
		
		Produto produto = new Produto(nome , preco);
		
		produtos.add(produto);
		
		System.out.println(produto.getNome() + " FOI CADASTRADO COM SUCESSO");
		menu();
	}
	
	
}
