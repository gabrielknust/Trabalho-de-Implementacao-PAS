/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Control;

import java.util.HashMap;
import trabalho.Model.Cliente;

/**
 *
 * @author gabri
 */
public class ClienteControl {
    static HashMap<Integer,Cliente> clientes;
    public static Cliente read(int CPF){
        return clientes.get(CPF);
    }
    public static HashMap<Integer,Cliente> readAll(){
        return clientes;
    }
}
