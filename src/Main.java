public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Aluno> lMatri = new ListaEncadeada<Aluno>(true, new CompAlunMatricula());
        Aluno a1 = new Aluno ("Ze",1);
        Aluno a2 = new Aluno ("Ma",2);
        Aluno a3 = new Aluno();
        lMatri.adicionar(a1);
        lMatri.adicionar(a2);

        a3.setMatricula(2);
        a3 = lMatri.pesquisar(a3);
        System.out.println(a3.getNome());

        System.out.println(lMatri);

    }
}