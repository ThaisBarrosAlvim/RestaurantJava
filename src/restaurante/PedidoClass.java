/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim -
 *         RA: 2020008082
 */
public class PedidoClass {
    // Status Possiveis
    static final String STATUS_A = "Aguardando";
    static final String STATUS_P = "Pronto";
    static final String STATUS_E = "Entregue";

    public EventManager events;
    String status = STATUS_A;

    int num;
    double valorTotal = 0.0;
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

    public void addProduto(ProdutoClass produto) {
        valorTotal += produto.preco;
        produtos.add(new ProdutoClass(produto));

    }

    public String getFullName() {
        String fullName = "";
        for (ProdutoClass prod : produtos) {
            if (produtos.indexOf(prod) == (produtos.size() - 1)) {
                fullName += prod.nome;
            } else {
                fullName += prod.nome + ", ";
            }
        }
        return fullName;
    }

    public PedidoClass() {
        this.events = new EventManager("UpdateStatus");
    }

    public void fecharPedido() {
        this.events.notify("UpdateStatus");
    }

    public PedidoClass(PedidoClass obj) {
        this.events = new EventManager("UpdateStatus");
        this.status = obj.status;
        this.num = obj.num;
        this.valorTotal = obj.valorTotal;
        this.produtos = new ArrayList<ProdutoClass>(obj.produtos);
        this.events.listeners = new HashMap<String, List<EventListener>>(obj.events.listeners);
    }

    /**
     * Atribui um valor para o número do pedido
     * 
     * @param value valor a ser atribuído
     */
    public void setNum(int value) {
        this.num = value;
    }
}
