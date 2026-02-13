package teste;


import com.gabrielwederson.arvorebinaria.Arvore;
import com.gabrielwederson.arvorebinaria.Folha;

public class Main {
    public static void main(String[] args) {
        Arvore arvorebinaria = new Arvore(new Folha(30));
        arvorebinaria.criar(new Folha(15));
        arvorebinaria.criar(new Folha(45));
        arvorebinaria.criar(new Folha(7));
        arvorebinaria.criar(new Folha(19));
    }
}
