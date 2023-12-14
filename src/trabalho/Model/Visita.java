/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Visita {
    private ArrayList<Imovel> imoveis;
    private ArrayList<Corretor> corretores;
    private Cliente cliente;
    private Date data;
    private float custo;

    public Visita(ArrayList<Imovel> imoveis, ArrayList<Corretor> corretores, Cliente cliente, Date data, float custo) {
        this.imoveis = imoveis;
        this.corretores = corretores;
        this.cliente = cliente;
        this.data = data;
        this.custo = custo;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Corretor> getCorretores() {
        return corretores;
    }

    public void setCorretores(ArrayList<Corretor> corretores) {
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
