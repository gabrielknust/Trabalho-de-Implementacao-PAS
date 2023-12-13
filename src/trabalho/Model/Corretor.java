/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

/**
 *
 * @author gabri
 */
public class Corretor extends Pessoa {
    private int matricula;
    private int comissaoVenda;
    private int comissaoAluguel;

    public Corretor(int matricula, int comissaoVenda, int comissaoAluguel, String Nome, String Endereço, int Telefone) {
        super(Nome, Endereço, Telefone);
        this.matricula = matricula;
        this.comissaoVenda = comissaoVenda;
        this.comissaoAluguel = comissaoAluguel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(int comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getComissaoAluguel() {
        return comissaoAluguel;
    }

    public void setComissaoAluguel(int comissaoAluguel) {
        this.comissaoAluguel = comissaoAluguel;
    }
    
}
