/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package restaurante;

import java.util.ArrayList;

/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim -
 *         RA: 2020008082
 */
public class MesaClass implements EventListener {
    int numero;
    double precoTotal = 0.0;
    boolean prontoPagamento = false;

    ArrayList<PedidoClass> pedidos = new ArrayList<>();

    public void addPedido(PedidoClass pedido) {
        precoTotal += pedido.valorTotal;
        pedidos.add(new PedidoClass(pedido));
        prontoPagamento = false;
        pedido.events.subscribe("UpdateStatus", this);
    }

    /**
     * Sobrecarga do método padrão toString()
     */
    @Override
    public String toString() {
        String text = String.format("Mesa: " + this.numero);
        return text;
    }

    public MesaClass() {
    }

    public MesaClass(MesaClass obj) {
        this.numero = obj.numero;
        this.precoTotal = obj.precoTotal;
        this.prontoPagamento = obj.prontoPagamento;
        this.pedidos = new ArrayList<PedidoClass>(obj.pedidos);
    }

    @Override
    public void update() {
        for (PedidoClass pedido : pedidos) {
            if (pedido.status != PedidoClass.STATUS_E) {
                prontoPagamento = false;
                return;
            }
        }
        prontoPagamento = true;
    }
}
