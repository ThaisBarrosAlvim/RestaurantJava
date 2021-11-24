/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package restaurante;
import java.util.ArrayList;
/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim - RA: 2020008082 
 */
public class MesaClass {
    int numero;
    ArrayList<PedidoClass> pedidos = new ArrayList<>();
    
    /**
     * Sobrecarga do método padrão toString()
     */
    @Override
    public String toString(){
        String text = String.format("Mesa: " + this.numero);
        return text;
    }
}
