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
public class Transacao {
    private Imovel imovel;
    private float valor;
    private HashMap<Integer,Corretor> corretores;

    public Transacao(Imovel imovel, float valor, HashMap<Integer,Corretor> corretores) {
        this.corretores = new HashMap();
        this.imovel = imovel;
        this.valor = valor;
        this.corretores = corretores;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public HashMap<Integer, Corretor> getCorretores() {
        return corretores;
    }

    public void setCorretores(HashMap<Integer, Corretor> corretores) {
        this.corretores = corretores;
    }
    
    
}
