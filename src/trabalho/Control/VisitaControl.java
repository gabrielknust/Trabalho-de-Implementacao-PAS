/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import trabalho.Model.Cliente;
import trabalho.Model.Comprador;
import trabalho.Model.Corretor;
import trabalho.Model.Imovel;
import trabalho.Model.Visita;

/**
 *
 * @author gabri
 */
public class VisitaControl {
    private static HashMap<Integer,Visita> visitas;
    private static final Scanner sc = new Scanner(System.in);
    private static int indice = 1;
    private static float custoFixo = 0;
    private static Date data;
    
    public static Visita Create() throws ParseException{
        float custo;
        int controlador=0;
        ArrayList<Imovel> imoveis = null;
        ArrayList<Corretor> corretores = null;
        Cliente cliente;
        int codigo;
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
        System.out.println("Informe o CPF do cliente:");
        String CPF = sc.nextLine();
        cliente = CompradorControl.read(CPF);
        System.out.println("Informe a data da visita (dd/mm/yyyy):");
        String dataStr = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        data = sdf.parse(dataStr);
        custo = imoveis.size()*custoFixo;
        Visita visita = new Visita(imoveis, corretores, cliente, data , custo);
        visitas.put(indice, visita);
        indice++;
        return visita;
    }
    
    public static Visita read(int codigo){
        return visitas.get(codigo);
    }
    public static HashMap<Integer,Visita> readAll(){
        return visitas;
    }
    
    public static void Update(int codigo) throws ParseException{
        int controlador=0;
        Visita visita = VisitaControl.read(codigo);
        System.out.println("Informe o que será alterado:");
        System.out.println("1:Imoveis.");
        System.out.println("2:Corretores.");
        System.out.println("3:Cliente.");
        System.out.println("4:Data.");
        int i =sc.nextInt();
        switch(i){
            case 1:
                ArrayList<Imovel> imoveis = null;
                int cod = 0;
                System.out.println("Informe o codigo dos imoveis a serem visitados:");
                while(controlador !=9){
                    cod = sc.nextInt();
                    imoveis.add(ImovelControl.read(cod));
                    System.out.println("Deseja adicionar mais imoveis a visita?:");
                    System.out.println("1 - Sim");
                    System.out.println("9 - Não");
                    controlador = sc.nextInt();
                }
                visita.setImoveis(imoveis);
                visita.setCusto(imoveis.size()*custoFixo);
                break;
            case 2:
                ArrayList<Corretor> corretores = null;
                System.out.println("Informe o codigo dos corretores resposáveis:");
                while(controlador !=9){
                    cod = sc.nextInt();
                    corretores.add(CorretorControl.read(cod));
                    System.out.println("Deseja adicionar mais corretores a visita?:");
                    System.out.println("1 - Sim");
                    System.out.println("9 - Não");
                    controlador = sc.nextInt();
                }
                visita.setCorretores(corretores);
                break;
            case 3:
                System.out.println("Informe o CPF do cliente:");
                String CPF = sc.nextLine();
                Comprador cliente = CompradorControl.read(CPF);
                visita.setCliente(cliente);
                break;
            case 4:
                System.out.println("Informe a data da visita (dd/mm/yyyy):");
                String dataStr = sc.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                data = sdf.parse(dataStr);
                visita.setData(data);
                break;
            default:
                System.out.println("Codigo invalido");
        }
    }
    public static void delete(int codigo){
        visitas.remove(codigo);
    }
    public static void atualizaTaxa(float novoCusto){
        custoFixo = novoCusto;
        visitas.forEach((key,value)->{
            value.setCusto(value.getImoveis().size()*custoFixo);
        });
    }
}
