package Pets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        InserirPet inserir = new InserirPet();
        AtualizarPet atualizar = new AtualizarPet();
        DeletarPet deletar = new DeletarPet();
        ConsultarPets2 consultar = new ConsultarPets2();
        CriarTabela criar = new CriarTabela();
        
        criar.criar();
        
        int op = -1;
        while(op != 0){
            System.out.println("## TABELA DE PETS ##");
            System.out.println("Escolha um opção:");
            System.out.println("1. Inserir um Pet");
            System.out.println("2. Atualizar um Pet");
            System.out.println("3. Deletar um Pet");
            System.out.println("4. Consultar um Pet");
            System.out.println("0. Fechar Programa");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("Insira o nome do seu Pet: ");
                    String nomeInserir = sc.nextLine();
                    System.out.println("Insira a especie do seu Pet: ");
                    String especieInserir = sc.nextLine();
                    System.out.println("Insira a raça do seu Pet: ");
                    String racaInserir = sc.nextLine();
                    System.out.println("O pet está vacinado? (sim/nao)");
                    String vacinasInserir = sc.nextLine();
                    inserir.inserir(nomeInserir, especieInserir, racaInserir, vacinasInserir);
                    break;
                case 2:
                    System.out.println("Nome do Pet:");
                    String nomeAtualizar = sc.nextLine();
                    System.out.println("Vacina nova:");
                    String vacinasAtualizar = sc.nextLine();
                    atualizar.atualizar(nomeAtualizar, vacinasAtualizar);
                    break;
                case 3:
                    System.out.println("Nome do Pet para deletar: ");
                    String nomeDeletar = sc.nextLine();
                    deletar.deletar(nomeDeletar);
                    break;
                case 4:
                    consultar.consultar();
                     break;
                case 0:
                    System.out.println("Encerrando o programa . . .");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        sc.close();
}}
