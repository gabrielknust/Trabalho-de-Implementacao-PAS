/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package trabalho.Model;

/**
 *
 * @author gabri
 */
public enum Tipo {
    Casa("Casa"),Apartamento("Apartamento"),Loja("Loja");
    private String descricao;
    Tipo(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
