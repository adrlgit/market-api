package com.andreluis.market.domain;

import com.andreluis.market.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagametno;
    public PagamentoComBoleto(){
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagametno) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagametno = dataPagametno;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagametno() {
        return dataPagametno;
    }

    public void setDataPagametno(Date dataPagametno) {
        this.dataPagametno = dataPagametno;
    }
}
