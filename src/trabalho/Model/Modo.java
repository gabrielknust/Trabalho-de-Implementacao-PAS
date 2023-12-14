/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package trabalho.Model;

/**
 *
 * @author gabri
 */
public enum Modo {
    Venda("Venda"),Aluguel("Aluguel");
    private String descricao;
    Modo(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
