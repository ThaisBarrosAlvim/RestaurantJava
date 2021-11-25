/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.ArrayList;

/**
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim -
 *         RA: 2020008082
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<ProdutoClass> produtos = new ArrayList<>();
        produtos.add(new ProdutoClass("Suco de couve", 5.0));
        produtos.add(new ProdutoClass("Hamburger", 9.0));
        produtos.add(new ProdutoClass("Sorvete", 2.0));
        produtos.add(new ProdutoClass("Salada", 6.0));

        TelaRestaurante restaurant = TelaRestaurante.getInstance(produtos);
        restaurant.setVisible(true);
    }

}
