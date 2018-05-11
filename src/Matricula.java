/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Matricula {
    String nome;
    String ra;
    String cpf;
    String rg;
    Matricula proximo;

    public Matricula(String nome, String ra, String cpf, String rg) {
        this.nome = nome;
        this.ra = ra;
        this.cpf = cpf;
        this.rg = rg;
        this.proximo = null;
    }
    
    public Matricula(Matricula matricula) {
        this.nome = matricula.nome;
        this.ra = matricula.ra;
        this.cpf = matricula.cpf;
        this.rg = matricula.rg;
        this.proximo = null;
    }
    
    
    
}
