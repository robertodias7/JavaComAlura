package br.com.alura.ed.pilha;

import java.util.Stack;

public class TesteDePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.insere("Julio");
        System.out.println(pilha);
        pilha.insere("Danilo");
        System.out.println(pilha);

        String r1 = pilha.remove();
        System.out.println(r1);
        String r2 = pilha.remove();
        System.out.println(r2);
        System.out.println(pilha);

        System.out.println(pilha.vazia());
        pilha.insere("Julio");
        System.out.println(pilha.vazia());

        Stack<String> stack = new Stack<String>();
        stack.push("Julio");
        stack.push("Danilo");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);
    }
}
