package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Mod11ExemploArrayList {
    public static void main (String[]args){
       exemploListaSimples();
       exemploListaOrdemAscendente();
        exemplosNumeros();

    }
    public static void exemplosNumeros(){
    System.out.println("*****ExemploNumeros*****");
    List<String> numeros = new ArrayList<>();
    numeros.add("2");
    numeros.add("4");
    numeros.add("5");
    numeros.add("1");
    numeros.add("3");
    Collections.sort(numeros);
    System.out.println(numeros);


   

    }
    private static void exemploListaSimples(){
        System.out.println("*****ExemplosListaSimples*****");
            List<String> lista = new ArrayList<>();
            lista.add("Bruno");
            lista.add("Caio");
            lista.add("Acácio");
        System.out.println(lista);

       /*  lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("Caio");
        System.out.println(contem);

        for (String nome :lista) {
            System.out.println(nome);
        }

            System.out.println(lista.get(0));*/


    }
    private static void exemploListaOrdemAscendente(){
        System.out.println("*****exemploListaOrdemAscendente*****");
        ArrayList<String> strings = new ArrayList<>();
        List<String> lista = strings;
        lista.add("Bruno");
        lista.add("Caio");
        lista.add("Acácio");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(""); 
       /* lista.remove(0);*/

    }


}

/* Caixa: List<String> lista = new ArrayList<>();

    Dentro da Caixa:
                lista.add("Bruno");
                lista.add("Caio");
                lista.add("Acácio");*/

