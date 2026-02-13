package com.gabrielwederson.arvorebinaria;

public class Arvore {
    public Folha folha;
    public Arvore esquerda;
    public Arvore direita;

    public Arvore(){
         this.folha = null;
         this.esquerda = null;
         this.direita = null;
    }
    public Arvore(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }
    public boolean vazio(){
        return folha == null;
    }

    public void criar(Folha novo){
        if(vazio()){
            this.folha = folha;
        } else {
            Arvore arvorebinaria = new Arvore(novo);
            if(novo.getValor() < this.folha.getValor()){
                if(this.esquerda == null){
                    this.esquerda = arvorebinaria;
                    System.out.println("Folha: " + novo.getValor() + " a esquerda de: " + this.folha.getValor());
                } else {
                    this.esquerda.criar(novo);
                }
            } else if (novo.getValor() > this.folha.getValor()){
                if(this.direita == null){
                    this.direita = arvorebinaria;
                    System.out.println("Folha: " + novo.getValor() + " a direita de: " + this.folha.getValor());
                } else {
                    this.direita.criar(novo);
                }
            }
        }
    }
}
