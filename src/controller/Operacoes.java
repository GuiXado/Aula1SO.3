package controller;

import javax.swing.JOptionPane;

public class Operacoes {

    public Operacoes() {
        super();
    }

    public void executar() {
        int n = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor (até 100):"));
        } while (n < 1 || n > 100);

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
        	vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição " + i + ":"));
        }

        processaVetor(vetor);
    }

    public void processaVetor(int[] vetor) {
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.println(num + " é ímpar");
            } else if (num % 10 == 0) {
                System.out.println(num + " é par e múltiplo de 10");
            }
        }
    }
}
