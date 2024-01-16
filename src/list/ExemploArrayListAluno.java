package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExemploArrayListAluno {


    public static void main (String[]args){
        exemploListasimplesOrdenadaComparatorAluno();
        exemploListasimplesOrdenadaClasseExterna();
        operecaoLouca();

    }
    private static void exemploListasimplesOrdenadaClasseExterna() {
        System.out.println("*****exemploListasimplesOrdenadaClasseExterna*****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Vinicius ", "Linux básico", 0 );
        Aluno b = new Aluno("Antonio de Souza ", "Back-end Java",  0);
        Aluno c = new Aluno("João Carlos ", "Internet",  0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");


    }
    private static void exemploListasimplesOrdenadaComparatorAluno() {
        System.out.println("*****exemploListasimplesOrdenadaComparatorAluno*****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Vinicius Silva ", "Linux básico", 20);
        Aluno b = new Aluno("Antonio de Souza ", "Back-end Java",  30);
        Aluno c = new Aluno("João Carlos ", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("lista sem ordenação" + lista);
        //Collections.sort(lista);
        System.out.println("lista com ordenação" + lista);


        /*ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista.comparaNotaAluno);
        System.out.println("lista com ordenação por nota" + lista);
        System.out.println("a");*/


    }

    }


}
