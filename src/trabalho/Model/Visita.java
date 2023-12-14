/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author gabri
 */
public class Visita {
    private int codigo;
    private HashMap<Integer,Imovel> imoveis;
    private HashMap<Integer,Corretor> corretores;
    private Cliente cliente;
    private Date data;
    private float custo;

    public Visita(int codigo,HashMap<Integer,Imovel> imoveis, HashMap<Integer,Corretor> corretores, Cliente cliente, Date data, float custo) {
        this.codigo = codigo;
        this.imoveis = imoveis;
        this.corretores = corretores;
        this.cliente = cliente;
        this.data = data;
        this.custo = custo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashMap<Integer, Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(HashMap<Integer, Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public HashMap<Integer, Corretor> getCorretores() {
        return corretores;
    }

    public void setCorretores(HashMap<Integer, Corretor> corretores) {
        this.corretores = corretores;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
}
