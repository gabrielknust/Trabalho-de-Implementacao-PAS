/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.View;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import trabalho.Control.CompradorControl;
import trabalho.Control.CorretorControl;
import trabalho.Control.ImovelControl;
import trabalho.Control.RelatorioControl;
import trabalho.Control.VendedorControl;
import trabalho.Control.VisitaControl;
import trabalho.Model.Visita;

/**
 *
 * @author gabri
 */
public class Trabalho {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        while(opcao!=13){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Cliente Comprador");
            System.out.println("2 - Cadastrar Cliente Vendedor");
            System.out.println("3 - Cadastrar Corretor");
            System.out.println("4 - Cadastrar Imóvel");
            System.out.println("5 - Agendar visita");
            System.out.println("6 - Imprimir Agenda");        
            System.out.println("7 - Mudar taxa de visita");
            System.out.println("8 - Vender ou Alugar");
            System.out.println("9 - listar Cliente Comprador");
            System.out.println("10 - listar Cliente Vendedor");
            System.out.println("11 - listar imoveis");
            System.out.println("12 - listar corretores");
            System.out.println("13 - relatorio mensal");
            System.out.println("14 - relatorio anual");
            System.out.println("15 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    CompradorControl.create();
                    break;
                case 2:
                    VendedorControl.create();
                    break;
                case 3:
                    CorretorControl.create();
                    break;
                case 4:
                    ImovelControl.create();
                    break;
                case 5:
                    try{
                        VisitaControl.create();
                    }catch (ParseException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    HashMap<Integer,Visita> visitas = VisitaControl.readAll();
                    visitas.forEach((key,value)->{
                        System.out.println("Visita no dia " +value.getData());
                        System.out.println("Imoveis: ");
                        value.getImoveis().forEach((keyImovel,imovel)->{
                            System.out.println("Chave: " + keyImovel);
                        });
                        System.out.println("Corretores: ");
                        value.getCorretores().forEach((keyCorretor,Corretor)->{
                           System.out.println("Matricula: " + keyCorretor);
                        });
                        System.out.println("Cliente :" + value.getCliente().getCPF());
                        System.out.println("Custo: "+value.getCusto());
                    });
                case 7:
                    System.out.println("Digite a nova taxa");
                    float taxa = sc.nextFloat();
                    VisitaControl.atualizaTaxa(taxa);             
                    break;
                case 8:
                    break;
                case 9:
                    CompradorControl.readAll().forEach((key,value)->{});
                    break;
                case 10:
                    ImovelControl.readAll();
                    break;    
                case 11:
                    CorretorControl.readAll();
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;   
                case 14:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}