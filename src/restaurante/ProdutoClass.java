/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Thiago Henrique Cruz de Moura - RA: 2020023875, Thaís Barros Alvim - RA: 2020008082 
 */
public class ProdutoClass {    
    double preco;
    String nome;
    
    /**
     * Atribui aos atributos do Objeto valores específicos
     * @param nome Nome do produto
     * @param preco Preço do produto
     */
    public ProdutoClass(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Atribui a este o valor de um objeto da mesma classe
     * @param obj
     */
    public ProdutoClass(ProdutoClass obj){
        this.nome = obj.nome;
        this.preco = obj.preco;
    }
}
