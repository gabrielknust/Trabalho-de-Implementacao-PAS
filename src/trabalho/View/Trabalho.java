/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.View;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import trabalho.Control.CompradorControl;
import trabalho.Control.CorretorControl;
import trabalho.Control.ImovelControl;
import trabalho.Control.VendedorControl;
import trabalho.Control.VisitaControl;
import trabalho.Model.Imovel;
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
        while(opcao!=25){
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
            System.out.println("15 - Alterar Cliente Comprador");
            System.out.println("16 - Alterar Cliente Vendedor");
            System.out.println("17 - Alterar Corretor");
            System.out.println("18 - Alterar Imóvel");
            System.out.println("19 - Alterar visita");
            System.out.println("20 - Remover Cliente Comprador");
            System.out.println("21 - Remover Cliente Vendedor");
            System.out.println("22 - Remover Corretor");
            System.out.println("23 - Remover Imóvel");
            System.out.println("24 - Remover visita");
            System.out.println("25 - Sair");
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
                    CompradorControl.readAll().forEach((key,value)->{
                        System.out.println("Comprador de CPF " + value.getCPF());
                        System.out.println("Nome: " + value.getNome());
                        System.out.println("Telefone: " + value.getTelefone());
                        System.out.println("E-mail " + value.getEmail());
                        System.out.println("Endereço " + value.getEndereço());
                        System.out.println("Caracteristicas: ");
                        ArrayList<String> caracteristicas = value.getCaracteristicas();
                        caracteristicas.forEach((caracteristica)->{
                            System.out.println(caracteristica);
                        });
                    });
                    break;
                case 10:
                    VendedorControl.readAll().forEach((key,value)->{
                        System.out.println("Comprador de CPF " + value.getCPF());
                        System.out.println("Nome: " + value.getNome());
                        System.out.println("Telefone: " + value.getTelefone());
                        System.out.println("E-mail " + value.getEmail());
                        System.out.println("Imoveis: ");
                        HashMap<Integer,Imovel> imoveis = value.getImoveis();
                        imoveis.forEach((codigo,imovel)->{
                            System.out.println("Codigo do imovel: " + imovel.getCodigo());
                        });
                    });
                    break;    
                case 11:
                    ImovelControl.readAll().forEach((key,value)->{
                        System.out.println("Comprador de codigo " + value.getCodigo());
                        System.out.println("Endereco: " + value.getEndereco());
                        System.out.println("Modo: " + value.getModo());
                        System.out.println("Tipo: " + value.getTipo());
                        System.out.println("CPF do dono: " + value.getDono().getCPF());
                        System.out.println("Quartos: " + value.getQuartos());
                        System.out.println("Valor: " + value.getValor());
                    });
                    break;
                case 12:
                    CorretorControl.readAll().forEach((key,value)->{
                        System.out.println("Corretor de matricula: " + value.getMatricula());
                        System.out.println("Nome: " + value.getNome());
                        System.out.println("Telefone: " + value.getTelefone());
                        System.out.println("Endereço: " + value.getEndereço());
                        System.out.println("Comissão de aluguel: " + value.getComissaoAluguel());
                        System.out.println("Comissão de venda: " + value.getComissaoVenda());
                    });
                    break;
                case 13:
                    break;  
                case 14:
                    break;
                case 15:
                    System.out.println("Informe o CPF do Cliente Comprador: ");
                    String CPF = sc.nextLine();
                    CompradorControl.update(CPF);
                case 16:
                    
                case 25:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}