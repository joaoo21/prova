/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Administrador
 */
public class Cidade {
    private Integer codigo;
    private String nome;
    private String sigla;
    private Integer nrhabitantes;
    private LocalDate dataemancipacao;
    private Double areatotal;
    private Integer distanciacapital;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getNrhabitantes() {
        return nrhabitantes;
    }

    public void setNrhabitantes(Integer nrhabitantes) {
        this.nrhabitantes = nrhabitantes;
    }

    public LocalDate getDataemancipacao() {
        return dataemancipacao;
    }

    public void setDataemancipacao(LocalDate dataemancipacao) {
        this.dataemancipacao = dataemancipacao;
    }

    public Double getAreatotal() {
        return areatotal;
    }

    public void setAreatotal(Double areatotal) {
        this.areatotal = areatotal;
    }

    public Integer getDistanciacapital() {
        return distanciacapital;
    }

    public void setDistanciacapital(Integer distanciacapital) {
        this.distanciacapital = distanciacapital;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
