/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import java.util.Scanner;
import trabalho.Model.Cliente;
import trabalho.Model.Imovel;
import trabalho.Model.Modo;
import trabalho.Model.Tipo;

/**
 *
 * @author gabri
 */
public class ImovelControl {
    static HashMap<Integer,Imovel> imoveis;
    static Imovel imovel;
    static int codigo=1;
    static int indice=0;
    static Scanner sc = new Scanner(System.in);
    public static Imovel create(){
        String modo = null;
        String tipo = null;
        System.out.println("Selecione o modo do imóvel:");
        System.out.println("1:Venda.");
        System.out.println("2:Aluguel.");
        int i=sc.nextInt();
        switch(i){
            case 1:
                modo = Modo.Venda.getDescricao();
            case 2:
                modo = Modo.Aluguel.getDescricao();
            default:
                System.out.println("Código invalido!");
        }
        System.out.println("Informe o CPF do dono:");
        String CPF = sc.nextLine();
        Cliente dono = VendedorControl.read(CPF);
        System.out.println("Informe o  endereço:");
        String endereco = sc.nextLine();
        System.out.println("Selecione o novo tipo do imóvel:");
        System.out.println("1:Casa.");
        System.out.println("2:Apartamento.");
        System.out.println("3:Loja.");
        i=sc.nextInt();
        switch(i){
            case 1:
                tipo = Tipo.Casa.getDescricao();
                break;
            case 2:
                tipo = Tipo.Apartamento.getDescricao();
                break;
            case 3:
                tipo = Tipo.Loja.getDescricao();
                break;
            default:
                System.out.println("Código invalido!");
        }
        System.out.println("Informe o numero de quartos:");
        int numQuartos = sc.nextInt();
        System.out.println("Informe o valor do imovel:");
        float valor = sc.nextFloat();
        imovel = new Imovel(codigo,modo,dono,endereco,tipo,numQuartos,valor);
        imoveis.put(codigo,imovel);
        codigo++;
        return imovel;
    }
    public static Imovel read(int codigo){
        return imoveis.get(codigo);
    }
    public static HashMap<Integer,Imovel> readAll(){
        return imoveis;
    }
    public static void update(int codigo){
        String modo = null;
        String tipo = null;
        String endereco = null;
        String CPF = null;
        imovel = imoveis.get(codigo);
        System.out.println("Informe o que será alterado:");
        System.out.println("1:Modo.");
        System.out.println("2:Dono.");
        System.out.println("3:Endereco.");
        System.out.println("4:Tipo.");
        System.out.println("5:Quantidade de quartos.");
        System.out.println("6:valor do imóvel.");
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println("Selecione o novo modo do imóvel:");
                System.out.println("1:Venda.");
                System.out.println("2:Aluguel.");
                indice=sc.nextInt();
                switch(indice){
                    case 1:
                        modo = Modo.Venda.getDescricao();
                    case 2:
                        modo = Modo.Aluguel.getDescricao();
                    default:
                        System.out.println("Código invalido!");
                }
                imovel.setModo(modo);
                break;
            case 2:
                System.out.println("Informe o CPF do novo dono:");
                CPF = sc.nextLine();
                Cliente dono = VendedorControl.read(CPF);
                imovel.setDono(dono);
                break;
            case 3:
                System.out.println("Informe o novo endereço:");
                endereco = sc.nextLine();
                imovel.setEndereco(endereco);
                break;

            case 4: 
                System.out.println("Selecione o novo tipo do imóvel:");
                System.out.println("1:Casa.");
                System.out.println("2:Apartamento.");
                System.out.println("3:Loja.");
                i=sc.nextInt();
                switch(i){
                    case 1:
                        tipo = Tipo.Casa.getDescricao();
                        break;
                    case 2:
                        tipo = Tipo.Apartamento.getDescricao();
                        break;
                    case 3:
                        tipo = Tipo.Loja.getDescricao();
                        break;
                    default:
                        System.out.println("Código invalido!");
                }
                imovel.setTipo(tipo);
                break;
            case 5: 
                System.out.println("Informe o numero de quartos:");
                int numQuartos = sc.nextInt();
                imovel.setQuartos(numQuartos);
                break;

            case 6: 
                System.out.println("Informe o valor do imovel:");
                float valor = sc.nextFloat();
                imovel.setValor(valor);
                break;
            }
    }
    public static void delete(int codigo){
        imoveis.remove(codigo);
    }
}

