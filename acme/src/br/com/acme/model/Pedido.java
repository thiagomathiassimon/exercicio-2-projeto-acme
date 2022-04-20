package br.com.acme.model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private Date data;
    private int total;
    private Atendente atendente;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private List<Produto> produtos;

    public Pedido(Date data, int total, Atendente atendente, Cliente cliente, FormaPagamento formaPagamento, List<Produto> produtos) {
        this.data = data;
        this.total = total;
        this.atendente = atendente;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "data=" + data +
                ", total=" + total +
                ", atendente=" + atendente +
                ", cliente=" + cliente +
                ", formaPagamento=" + formaPagamento +
                ", produtos=" + produtos +
                '}';
    }
}
