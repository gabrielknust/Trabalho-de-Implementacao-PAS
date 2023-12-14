/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import trabalho.Model.Vendedor;

/**
 *
 * @author gabri
 */
public class VendedorControl {
    Static Vendedor vendedor;
    static HashMap<Integer,Vendedor> vendedores;
    public static Vendedor read(String CPF){
        return vendedores.get(CPF);
    }

    public static HashMap<Integer,Vendedor> readAll(){
        return vendedores;
    }

    public static void update(int codigo){
            vendedor = vendedor.get(codigo)
            System.out.println("Informe o que será alterado:");
            System.out.println("1:CPF.");
            System.out.println("2:Nome.");
            System.out.println("3:Email.");
            System.out.println("4:Telefone.");
            System.out.println("5:Endereco.");
            System.out.println("6:Lista dos imoveis.");
            switch(indice){
                case 1:
                   System.out.print("Informe o CPF: ");
                   String cpf = scanner.nextLine();
                   vendedor.setCPF(cpf);
                   break;
                case 2:
                    System.out.print("Informe o Nome: ");
                    String nome = scanner.nextLine();
                    vendedor.setNome(nome);
                    break
                case 3: 
                    System.out.print("Informe o Email: ");
                    String email = scanner.nextLine();
                    vendedor.setEmail(email);
                    break;

                case 4:
                    System.out.print("Informe o Telefone: ");
                    String telefone = scanner.nextLine();
                    vendedor.setTelefone(telefone);
                    break;

                case 5:
                    System.out.print("Lista dos imoveis: ");
                    String imoveis = scanner.nextLine();
            
    }

    public void delete(int codigo){
    }
}

