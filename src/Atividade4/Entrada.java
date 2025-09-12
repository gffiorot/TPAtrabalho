package Atividade4;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class Entrada {
    private Scanner input;
    private LinkedList<Aluno> linkedL;
    private ArrayList<Aluno> arrayL;


    public Entrada(LinkedList<Aluno> linkedL ,ArrayList<Aluno> arrayL) {
        input = new Scanner(System.in);
        this.linkedL = linkedL;
        this.arrayL = arrayL;
    }

    private String lerLinha(String msg){
        System.out.println(msg);
        return input.nextLine();
    }

    private int lerInt(String msg){
        String linha = lerLinha(msg);
        return Integer.parseInt(linha);
    }

    private float lerFloat(String msg){
        String linha = lerLinha(msg);
        return Float.parseFloat(linha);
    }

    public int menu() {
        String msg = "*********************\n" +
                "Escolha uma opção\n" +
                "1) Inserir no fim\n" +
                "2) Inserir no início\n" +
                "3) Inserir no meio\n" +
                "4) Buscar último\n"+
                "5) Buscar penúltimo\n"+
                "6) Buscar meio\n"+
                "0) Sair\n";

        int opcao = lerInt(msg);

        while(opcao<0 || opcao>6){
            System.out.println("Opção inválida. Tente novamente: ");
            opcao = this.lerInt(msg);
        }
        return opcao;
    }

    public void InserirFim(){
        long inicio, fim;
        int id = lerInt("Digite o id do aluno: ");
        String nome = lerLinha("Digite o nome do aluno: ");
        float nota = lerFloat("Digite a nota do aluno: ");
        Aluno alu = new Aluno(id, nome, nota);

        inicio = System.nanoTime();
        linkedL.add(alu);
        fim = System.nanoTime();
        System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

        inicio = System.nanoTime();
        arrayL.add(alu);
        fim = System.nanoTime();
        System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
    }

    public void InserirInicio(){
        long inicio, fim;
        int id = lerInt("Digite o id do aluno: ");
        String nome = lerLinha("Digite o nome do aluno: ");
        float nota = lerFloat("Digite a nota do aluno: ");
        Aluno alu = new Aluno(id, nome, nota);

        inicio = System.nanoTime();
        linkedL.addFirst(alu);
        fim = System.nanoTime();
        System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

        inicio = System.nanoTime();
        arrayL.addFirst(alu);
        fim = System.nanoTime();
        System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
    }

    public void InserirMeio(){
        long inicio, fim;
        int id = lerInt("Digite o id do aluno: ");
        String nome = lerLinha("Digite o nome do aluno: ");
        float nota = lerFloat("Digite a nota do aluno: ");
        Aluno alu = new Aluno(id, nome, nota);

        inicio = System.nanoTime();
        linkedL.add((linkedL.size()/2),alu);
        fim = System.nanoTime();
        System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

        inicio = System.nanoTime();
        arrayL.add((arrayL.size()/2),alu);
        fim = System.nanoTime();
        System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
    }

    public void BuscaUlt(){
        long inicio, fim;

        if (arrayL.isEmpty()){
            System.out.println("As listas estão vazias");
        }
        else {
            inicio = System.nanoTime();
            Aluno a1 = linkedL.getLast();
            fim = System.nanoTime();
            System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

            inicio = System.nanoTime();
            Aluno a2 = arrayL.getLast();
            fim = System.nanoTime();
            System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
        }
    }

    public void BuscaPenult(){
        long inicio, fim;

        if (arrayL.size() < 2 ){
            System.out.println("Não há elementos o suficiente");
        }
        else {
            inicio = System.nanoTime();
            Aluno a1 = linkedL.get(linkedL.size()-2);
            fim = System.nanoTime();
            System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

            inicio = System.nanoTime();
            Aluno a2 = arrayL.get(linkedL.size()-2);
            fim = System.nanoTime();
            System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
        }
    }

    public void BuscaMeio(){
        long inicio, fim;
        if (arrayL.isEmpty()){
            System.out.println("As listas estão vazias");
        }
        else {
            inicio = System.nanoTime();
            Aluno a1 = linkedL.get(linkedL.size()/2);
            fim = System.nanoTime();
            System.out.println("LinkedList Tempo total: " + (fim-inicio)/1000 + " microsegundos");

            inicio = System.nanoTime();
            Aluno a2 = arrayL.get(arrayL.size()/2);
            fim = System.nanoTime();
            System.out.println("ArrayList Tempo total: " + (fim-inicio)/1000 + " microsegundos");
        }
    }
}
