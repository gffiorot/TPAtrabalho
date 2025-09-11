package Atividade4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ArrayList;

public class LeitorArquivos {
    private static final String NOME_ARQUIVO = "alunosBalanceados.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            int numRegistros = Integer.parseInt(reader.readLine().trim());
            System.out.println("Número de registros: " + numRegistros);

            LinkedList<Aluno> linkAluno = new LinkedList<>();
            ArrayList<Aluno> arrayAluno = new ArrayList<>();

            Entrada menu = new Entrada(linkAluno, arrayAluno); // menu para deixar o main mais limpo

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                float nota = Float.parseFloat(partes[2]);
                Aluno alu = new Aluno(id,nome,nota);

                linkAluno.add(alu);
                arrayAluno.add(alu);
            }

            int opcao = menu.menu();

            while (opcao != 0){
                switch (opcao){
                    case 1: menu.InserirFim(); break;
                    case 2: menu.InserirInicio(); break;
                    case 3: menu.InserirMeio(); break;
                    case 4: menu.BuscaUlt(); break;
                    case 5: menu.BuscaPenult(); break;
                    case 6: menu.BuscaMeio(); break;
                    default: System.out.println("Opção invalida"); break;
                }

                opcao = menu.menu();
            }


        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao processar um dos valores numéricos: " + e.getMessage());
        }
    }
}