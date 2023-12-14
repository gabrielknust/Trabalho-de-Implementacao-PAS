/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import java.util.Scanner;
import static trabalho.Control.CompradorControl.caracteristicas;
import trabalho.Model.Corretor;
import trabalho.Model.Imovel;
import trabalho.Model.Transacao;

/**
 *
 * @author gabri
 */
public class TransacaoControl {
    static HashMap<String,Transacao> transacoes = new HashMap<String,Transacao>();
    static HashMap<Integer,Corretor> corretores = new HashMap<Integer,Corretor>();
    static Scanner sc = new Scanner(System.in);
    int codigo = 1;
    
    public static Transacao create(){
        System.out.print("Informe o codigo do Imovel: ");
        int codigoImovel = sc.nextInt();
        Imovel imovel = ImovelControl.read(codigoImovel);
        System.out.print("Informe o valor da transacao: ");
        float valor = sc.nextFloat();
        System.out.print("Informe o Email: ");
        String email = sc.nextLine();
        System.out.print("Informe o Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Informe o Endereco: ");
        String endereco = sc.nextLine();
        int controlador = 0;
        while(controlador !=9){
            System.out.println("Deseja adicionar ou remover corretores da transacao?");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("9 - Sair");
            controlador = sc.nextInt();
            if(controlador==1){
                adicionarCorretor(corretores);
            }else if(controlador==2){
                removerCorretor(corretores);
            }
        }
        Transacao transacao = new Transacao(codigoImovel, imovel, valor, corretores);
        return transacao;
    }
}
