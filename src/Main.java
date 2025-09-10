public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Aluno> lMatri = new ListaEncadeada<Aluno>(true, new CompAlunMatricula());
        Aluno a1 = new Aluno ("Zé",1);
        Aluno a2 = new Aluno ("Mané",2);
        Aluno a3 = new Aluno ("José",3);
        Aluno pesq = new Aluno();

        lMatri.adicionar(a1);
        lMatri.adicionar(a2);
        lMatri.adicionar(a3);

        pesq.setMatricula(2);
        pesq = lMatri.pesquisar(pesq);
        System.out.println("Aluno da matricula 2: "+pesq.getNome());

        System.out.println("Lista total: "+lMatri);

        lMatri.remover(pesq);
        System.out.println("------------------------------------");
        System.out.println("Lista ao remover a matrícula 2: "+lMatri);
    }
}