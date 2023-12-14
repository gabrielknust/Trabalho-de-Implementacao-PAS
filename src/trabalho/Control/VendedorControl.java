/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import trabalho.Model.Vendedor;

/**
 *
 * @author gabri
 */
public class VendedorControl {
    static HashMap<Integer,Cliente> vendedores;
    public static Vendedor read(int CPF){
        return vendedores.get(CPF);
    }
    public static HashMap<Integer,Cliente> readAll(){
        return vendedores;
    }
}
