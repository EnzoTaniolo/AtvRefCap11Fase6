package br.com.fiap.model;

public class Banco {
    private int cdBanco;
    private String nmBanco;

    public Banco(int cdBanco, String nmBanco){
        this.cdBanco = cdBanco;
        this.nmBanco = nmBanco;
    }

    public String getNmBanco() {
        return nmBanco;
    }

    public void setNmBanco(String nmBanco) {
        this.nmBanco = nmBanco;
    }

    public int getCdBanco() {
        return cdBanco;
    }

    public void setCdBanco(int cdBanco) {
        this.cdBanco = cdBanco;
    }
}

