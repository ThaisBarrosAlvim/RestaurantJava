/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
import java.util.ArrayList;
/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim - RA: 2020008082 
 */
public class PedidoClass {
    String status= "Aguardando";
    int num;
        
    ArrayList<ProdutoClass> produtos = new ArrayList<>();
    
    /**
     * Sobrecarga do método padrão toString()
     */
    @Override
    public String toString() {
        String text = String.format("(Pedido #" + this.num + " " + this.status + ")");
        text = this.produtos.stream().map(produto -> "\n -  " + produto.nome).reduce(text, String::concat);
        return text;
    }
    
    /**
     * Atribui um valor para o número do pedido
     * @param value valor a ser atribuído
     */
        public void setNum(int value){
        this.num = value;
        }
}
