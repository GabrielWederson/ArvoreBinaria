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

}
