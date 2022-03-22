package br.com.devjan.supertrunfo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cartas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nome;
    private Double ataque, defesa, magia, inteligencia, velocidade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }

    public Double getMagia() {
        return magia;
    }

    public void setMagia(Double magia) {
        this.magia = magia;
    }

    public Double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

}
