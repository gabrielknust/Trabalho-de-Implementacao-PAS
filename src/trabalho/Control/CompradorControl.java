    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import trabalho.Model.Comprador;

/**
 *
 * @author gabri
 */

public class CompradorControl {  
    static HashMap<String,Comprador> compradores;
    static Scanner sc = new Scanner(System.in);
    public static Comprador create(){
        System.out.print("Informe o CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Informe o Nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe o Email: ");
        String email = sc.nextLine();
        System.out.print("Informe o Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Informe o Endereco: ");
        String endereco = sc.nextLine();
        int controlador = 0;
        ArrayList<String> caracteristicas = null;
        while(controlador !=9){
            System.out.println("Deseja adicionar ou remover caracteristicas do comprador?");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("9 - Sair");
            controlador = sc.nextInt();
            if(controlador==1){
                adicionarCaracteristica(caracteristicas);
            }else if(controlador==2){
                removerCaracteristica(caracteristicas);
            }
        }
        Comprador comprador = new Comprador(caracteristicas, cpf, email, nome, endereco, telefone);
        compradores.put(cpf, comprador);
        return comprador;
    }
    public static Comprador read(String CPF){
        return compradores.get(CPF);
    }
    public static HashMap<String,Comprador> readAll(){
        return compradores;
    }
    public static void update(String CPF){
        Comprador comprador = compradores.get(CPF);
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
            comprador.setCPF(cpf);
            compradores.remove(CPF);
            compradores.put(cpf, comprador);
            break;
        case 2:
            System.out.print("Informe o Nome: ");
            String nome = sc.nextLine();
            comprador.setNome(nome);
            break;
        case 3: 
            System.out.print("Informe o Email: ");
            String email = sc.nextLine();
            comprador.setEmail(email);
            break;
        case 4:
            System.out.print("Informe o Telefone: ");
            String telefone = sc.nextLine();
            comprador.setTelefone(telefone);
            break;
        case 5:
            System.out.print("Informe o Endereco: ");
            String endereco = sc.nextLine();
            comprador.setEndereço(endereco);
        case 6:
            int controlador = 0;
            while(controlador !=9){
                System.out.println("Deseja adicionar ou remover imoveis do vendedor?");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Remover");
                System.out.println("9 - Sair");
                controlador = sc.nextInt();
                if(controlador==1){
                    adicionarCaracteristica(comprador.getCaracteristicas());
                }else if(controlador==2){
                    removerCaracteristica(comprador.getCaracteristicas());
                }
            }
            break;
        }
    }
    public static void delete(String CPF){
        compradores.remove(CPF);
    }
    private static void adicionarCaracteristica(ArrayList<String> caracteristicas){
        System.out.println("informe a caracteristica");
        String caracteristica = sc.nextLine();
        caracteristicas.add(caracteristica);
    }
    private static void removerCaracteristica(ArrayList<String> caracteristicas){
        System.out.println("informe a caracteristica");
        String caracteristica = sc.nextLine();
        caracteristicas.remove(caracteristica);
    }
}
