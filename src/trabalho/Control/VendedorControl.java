/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import java.util.Scanner;
import trabalho.Model.Vendedor;

/**
 *
 * @author gabri
 */
public class VendedorControl {
    static Vendedor vendedor;
    static HashMap<Integer,Vendedor> vendedores;
    static Scanner sc = new Scanner(System.in);
    public static Vendedor read(String CPF){
        return vendedores.get(CPF);
    }

    public static HashMap<Integer,Vendedor> readAll(){
        return vendedores;
    }

    public static void update(int codigo){
            vendedor = vendedores.get(codigo);
            int indice = 0;
            System.out.println("Informe o que será alterado:");
            System.out.println("1:CPF.");
            System.out.println("2:Nome.");
            System.out.println("3:Email.");
            System.out.println("4:Telefone.");
            System.out.println("5:Endereco.");
            System.out.println("6:Lista dos imoveis.");
            indice = sc.nextInt();
            switch(indice){
                case 1:
                   System.out.print("Informe o CPF: ");
                   String cpf = sc.nextLine();
                   vendedor.setCPF(cpf);
                   break;
                case 2:
                    System.out.print("Informe o Nome: ");
                    String nome = sc.nextLine();
                    vendedor.setNome(nome);
                    break;
                case 3: 
                    System.out.print("Informe o Email: ");
                    String email = sc.nextLine();
                    vendedor.setEmail(email);
                    break;

                case 4:
                    System.out.print("Informe o Telefone: ");
                    int telefone = sc.nextInt();
                    vendedor.setTelefone(telefone);
                    break;

                case 5:
                    System.out.print("Lista dos imoveis: ");
                    String imoveis = sc.nextLine();      
            }
    }
    public static void delete(int codigo){
        vendedores.remove(codigo);
    }
}

