package list;

public class Aluno  implements Comparable<Aluno>{
    private static String nome;
    private String curso;
    private int nota;

    public Aluno(String nome, String curso, int nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;

    }

    // Implemente o método toString() na classe AlunoList
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", curso=" + curso + ", nota=" + nota + "]";
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;

    }


    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nota - outroAluno.nota;
    }
}