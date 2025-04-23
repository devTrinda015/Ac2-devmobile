package com.example.ac2_mobile.model;

public class Medicamento {
    private int id;
    private String nome;
    private String descricao;
    private String horario;
    private boolean consumido;

    public Medicamento(int id, String nome, String descricao, String horario, boolean consumido) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.consumido = consumido;
    }

    public Medicamento(String nome, String descricao, String horario, boolean consumido) {
        this(-1, nome, descricao, horario, consumido);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public boolean isConsumido() { return consumido; }
    public void setConsumido(boolean consumido) { this.consumido = consumido; }
}
