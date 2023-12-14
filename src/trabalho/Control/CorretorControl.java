/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import java.util.Scanner;
import trabalho.Model.Corretor;

/**
 *
 * @author gabri
 */
public class CorretorControl {
    private static HashMap<Integer,Corretor> corretores;
    private static Scanner sc = new Scanner(System.in);
    public static Corretor create(){
        int matricula;
        int comissaoVenda;
        int comissaoAluguel;
        String Nome;
        String Endereco;
        int telefone;
        System.out.println("Informe a matrícula do Corretor:");
        matricula = sc.nextInt();
        System.out.println("Informe a comissao de venda do Corretor:");
        comissaoVenda = sc.nextInt();
        System.out.println("Informe a comissao de aluguel do Corretor:");
        comissaoAluguel = sc.nextInt();
        System.out.println("Informe o nome do Corretor:");
        Nome = sc.nextLine();
        System.out.println("Informe o endereco do Corretor:");
        Endereco = sc.nextLine();
        System.out.println("Informe o telefone do Corretor:");
        telefone = sc.nextInt();
        Corretor corretor = new Corretor(matricula, comissaoVenda, comissaoAluguel, Nome, Endereco, telefone);
        corretores.put(matricula, corretor);
        return corretor;
    }
    
    public static Corretor read(int matricula){
        return corretores.get(matricula);
    }
    public static HashMap<Integer,Corretor> readAll(){
        return corretores;
    }
    
    public static void Update(int matricula){
        Corretor corretor = corretores.get(matricula);
        int indice = 0;
        System.out.println("Informe o que será alterado:");
        System.out.println("1:Matricula.");
        System.out.println("2:Nome.");
        System.out.println("3:Comissao de venda.");
        System.out.println("4:Comissao de aluguel.");
        System.out.println("5:Telefone.");
        System.out.println("6:Endereco.");
        indice = sc.nextInt();
        switch(indice){
            case 1:
               System.out.print("Informe a matricula:");
               int mat = sc.nextInt();
               corretor.setMatricula(mat);
               corretores.remove(mat);
               corretores.put(mat,corretor);
               break;
            case 2:
                System.out.print("Informe o Nome: ");
                String nome = sc.nextLine();
                corretor.setNome(nome);
                break;
            case 3: 
                System.out.print("Informe a comissão de venda: ");
                int comissaoVenda = sc.nextInt();
                corretor.setComissaoVenda(comissaoVenda);
                break;
            case 4:
                System.out.print("Informe a comissão de aluguel: ");
                int comissaoAluguel = sc.nextInt();
                corretor.setComissaoAluguel(comissaoAluguel);
                break;
            case 5:
                System.out.print("Informe o Telefone: ");
                int telefone = sc.nextInt();
                corretor.setTelefone(telefone);
                break;
            case 6:
                System.out.print("Informe o Endereco: ");
                String endereco = sc.nextLine();
                corretor.setEndereço(endereco);     
        }
    }
    
    public static void delete(int matricula){
        corretores.remove(matricula);
    }
}
