/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.View;
import trabalho.Control;

/**
 *
 * @author gabri
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Corretor");
            System.out.println("3 - Cadastrar Imóvel");
            System.out.println("4 - Agendar visita");
            System.out.println("5 - Imprimir Agenda");        
            System.out.println("6 - mudar a taxa de visita");
            System.out.println("7 - Vender ou Alugar");
            System.out.println("8 - listar clientes");
            System.out.println("9 - listar imoveis");
            System.out.println("10 - listar corretores");
            System.out.println("11 - relatorio mensal");
            System.out.println("12 - relatorio anual");            
            System.out.println("13 - Sair");

            int opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                   CompradorControl.create();
                    break;
                case 2:
                    CorretorControl.create();
                    break;
                case 3:
                    ImovelControl.create();
                    break;
                case 4:
                    VisitaControl.create();
                    break;
                case 5:
                    VisitaControl.readAll();
                    break;
                case 6:
                    System.out.println("Digite a nova taxa");
                    taxa = scanner.nextFloat();
                    VisitaControl.atualizaTaxa(taxa);             
                    break;
                    
                case 7:
                    TransacaoControl.create();
                    break;
                case 8:
                    CompradorControl.readAll();
                    break;
                case 9:
                    ImovelControl.readAll();
                    break;    
                case 10:
                    CorretorControl.readAll();
                    break;
                case 11:
                    RelatorioControl.mensal();
                    break;
                case 12:
                    RelatorioControl.anual();
                    break;
               
                case 13:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
}
