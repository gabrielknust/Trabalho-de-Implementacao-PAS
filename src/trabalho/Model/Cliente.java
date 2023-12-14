/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Model;

/**
 *
 * @author gabri
 */
public class Cliente extends Pessoa{
    private String CPF;
    private String email;

    public Cliente(String CPF, String email, String nome, String endereço, String telefone) {
        super(nome, endereço, telefone);
        this.CPF = CPF;
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
