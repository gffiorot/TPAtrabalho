package Atividade4;

public class Aluno {
    private String nome;
    private int id;
    private float nota;

    public Aluno(int id, String nom, float nota ) {
        this.nome = nom;
        this.id = id;
        this.nota = nota;
    }

    public Aluno() {}


    @Override
    public String toString() {
        return Integer.toString(id) + " - " + nome + " (nota: "+nota+")";
    }

    @Override
    public boolean equals(Object a) {
        if(a instanceof Aluno)
            return this.id ==((Aluno) a).id;
        else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

}
