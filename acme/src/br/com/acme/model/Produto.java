package br.com.acme.model;

import java.util.List;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private int estoqueMinimo;
    private ItemPedido itemPedido;
    private List<Pedido> pedidos;

    public Produto(String nome, double preco, int estoque, int estoqueMinimo, ItemPedido itemPedido, List<Pedido> pedidos) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
        this.itemPedido = itemPedido;
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", estoqueMinimo=" + estoqueMinimo +
                ", itemPedido=" + itemPedido +
                ", pedidos=" + pedidos +
                '}';
    }
}
