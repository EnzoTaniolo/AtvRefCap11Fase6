package br.com.fiap.model;

import java.util.Date;

public class Transacao {
    private int cdTransacao;
    private int cdContaBancaria;
    private String dsTipoTransacao;
    private double vlTransacao;
    private Date dtTransacao;
    private int cdBanco;

    public Transacao(int cdTransacao, int cdContaBancaria, String dsTipoTransacao, double vlTransacao, Date dtTransacao, int cdBanco) {
        this.cdTransacao = cdTransacao;
        this.cdContaBancaria = cdContaBancaria;
        this.dsTipoTransacao = dsTipoTransacao;
        this.vlTransacao = vlTransacao;
        this.dtTransacao = dtTransacao;
        this.cdBanco = cdBanco;
    }

    public double getCdTransacao() {
        return cdTransacao;
    }

    public void setCdTransacao(int cdTransacao) {
        this.cdTransacao = cdTransacao;
    }

    public double getCdContaBancaria() {
        return cdContaBancaria;
    }

    public void setCdContaBancaria(int cdContaBancaria) {
        this.cdContaBancaria = cdContaBancaria;
    }

    public String getDsTipoTransacao() {
        return dsTipoTransacao;
    }

    public void setDsTipoTransacao(String dsTipoTransacao) {
        this.dsTipoTransacao = dsTipoTransacao;
    }

    public double getVlTransacao() {
        return vlTransacao;
    }

    public void setVlTransacao(double vlTransacao) {
        this.vlTransacao = vlTransacao;
    }

    public Date getDtTransacao() {
        return dtTransacao;
    }

    public void setDtTransacao(Date dtTransacao) {
        this.dtTransacao = dtTransacao;
    }

    public double getCdBanco() {
        return cdBanco;
    }

    public void setCdBanco(int cdBanco) {
        this.cdBanco = cdBanco;
    }
}