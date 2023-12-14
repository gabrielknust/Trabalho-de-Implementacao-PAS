/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import trabalho.Model.Cliente;
import trabalho.Model.Corretor;
import trabalho.Model.Imovel;
import trabalho.Model.Visita;

/**
 *
 * @author gabri
 */
public class VisitaControl {
    private static HashMap<Integer,Visita> visitas;
    private static Scanner sc = new Scanner(System.in);
    private static int indice = 1;
    private static int custoFixo = 0;
    private static Date data;
    public static Visita Create(){
        int controlador=0;
        ArrayList<Imovel> imoveis = null;
        ArrayList<Corretor> corretores = null;
        Cliente cliente;
        int codigo = 0;
        System.out.println("Informe o codigo dos imoveis a serem visitados:");
        while(controlador !=9){
            codigo = sc.nextInt();
            imoveis.add(ImovelControl.read(codigo));
            System.out.println("Deseja adicionar mais imoveis a visita?:");
            System.out.println("1 - Sim");
            System.out.println("9 - Não");
            controlador = sc.nextInt();
        }
        controlador = 0;
        System.out.println("Informe o codigo dos corretores resposáveis:");
        while(controlador !=9){
            codigo = sc.nextInt();
            corretores.add(CorretorControl.read(codigo));
            System.out.println("Deseja adicionar mais corretores a visita?:");
            System.out.println("1 - Sim");
            System.out.println("9 - Não");
            controlador = sc.nextInt();
        }
        System.out.println("Informe o codigo do cliente:");
        codigo = sc.nextInt();
        cliente = CompradorControl.read(codigo);
        System.out.println("Informe a data da visita:");
        data = sc.next();
        Visita visita = new Visita(imoveis, corretores, cliente, data , custo);
        visitas.put(indice, visita);
    }
}
