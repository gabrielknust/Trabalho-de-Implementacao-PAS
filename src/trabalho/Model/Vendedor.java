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
public class Vendedor extends Cliente{
    private ArrayList<String> caracteristicas;

    public Vendedor(ArrayList<String> caracteristicas, String CPF, String email, String nome, String endereço, int telefone) {
        super(CPF, email, nome, endereço, telefone);
        this.caracteristicas = caracteristicas;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public void addCaracteristicas(String caracteristica){
        this.caracteristicas.add(caracteristica);
    }
}
