/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

import java.util.HashMap;

/**
 *
 * @author gabri
 */
public class Vendedor extends Cliente{
    private HashMap<Integer,Imovel> imoveis = new HashMap();

    public Vendedor(String CPF, String email, String nome, String endereço, String telefone) {
        super(CPF, email, nome, endereço, telefone);
    }

    public HashMap<Integer,Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(HashMap<Integer,Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
}
