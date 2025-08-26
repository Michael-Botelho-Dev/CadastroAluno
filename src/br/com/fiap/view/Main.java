package br.com.fiap.view;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Cidade;
import br.com.fiap.model.Endereco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        Aluno aluno = new Aluno();

        do {
            System.out.println("Escolha a opção: " +
                    " \n1-Cadastrar Aluno. " +
                    " \n2-Exbir Informações do Aluno." +
                    " \n0-Sair");
                    op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Qual o nome do aluno?");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Qual o RM?");
                    int rm = sc.nextInt();
                    System.out.println("Qual o logradouro do aluno?");
                    String logradouro = sc.next() + sc.nextLine();
                    System.out.println("Qual o número?");
                    String numero = sc.next() + sc.nextLine();
                    System.out.println("Qual o CEP?");
                    String cep = sc.next() + sc.nextLine();
                    System.out.println("Qual o nome da cidade?");
                    String nomeCidade = sc.next() + sc.nextLine();
                    System.out.println("Qual o estado?");
                    String estado = sc.next() + sc.nextLine();
                    Cidade cidade = new Cidade(nomeCidade, estado);
                    Endereco endereco = new Endereco(logradouro, numero, cep, cidade);
                    aluno.setNome(nome);
                    aluno.setRm(rm);
                    aluno.setEndereco(endereco);
                    System.out.println("Aluno registrado!");
                    break;
                case 2:
                    System.out.println(aluno.getNome() + ", rm: " + aluno.getRm());
                    System.out.println(aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero() + ", CEP: " + aluno.getEndereco().getCep());
                    System.out.println(aluno.getEndereco().getCidade().getNome() + "/" + aluno.getEndereco().getCidade().getEstado());
                case 0:
                    System.out.println("Finalizando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (op != 0);

        sc.close();

    }

}