package Atividade4;
import java.util.Comparator;

public class CompAluno implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
