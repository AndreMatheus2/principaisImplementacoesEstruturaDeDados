package one.digitalinnovation;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");
        System.out.println("      Stack a baixo      ");
        System.out.println("");
        System.out.println("");

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);
        System.out.println(stackCarros.empty());

        System.out.println("");
        System.out.println("");
        System.out.println("      Queue a baixo      ");
        System.out.println("");
        System.out.println("");

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);


        System.out.println(queueCarros.isEmpty());

        System.out.println("O tamanho da fila é de= " + queueCarros.size());
    }
}