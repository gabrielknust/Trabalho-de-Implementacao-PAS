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
    
    public static Imovel create(String modo, Cliente dono, String endereco, String tipo, int quartos, float valor){
        imovel = new Imovel(codigo,modo,dono,endereco,tipo,quartos,valor);
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
        imovel = imoveis.get(codigo);
        System.out.println("Informe o que será alterado:");
        System.out.println("1:Modo.");
        System.out.println("2:Dono.");
        System.out.println("3:Endereco.");
        System.out.println("4:Tipo.");
        System.out.println("5:Quantidade de quartos.");
        System.out.println("6:valor do imóvel.");
        indice=sc.nextInt();
        switch(indice){
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
            case 2:
                System.out.println("Informe o código do novo dono:");
                int condigo = sc.nextInt();
                Cliente dono = VendedorControl.read(condigo);
                imovel.setDono(dono);
            }
    }
    public void delete(int codigo){
        imoveis.remove(codigo);
    }
}
