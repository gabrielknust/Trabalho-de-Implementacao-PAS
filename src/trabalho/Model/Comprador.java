/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Comprador extends Cliente{
    private ArrayList<Imovel> imoveis;

    public Comprador(ArrayList<Imovel> imoveis, String CPF, String email, String nome, String endereço, int telefone) {
        super(CPF, email, nome, endereço, telefone);
        this.imoveis = imoveis;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
}
