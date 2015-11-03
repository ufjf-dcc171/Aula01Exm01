package br.ufjf.dcc;

import javax.swing.JOptionPane;

public class Aula01Exm01b {

    public static void main(String[] args) {
        String nome = "Fulano";

        //Ler o nome
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você deveria ter entrado com um nome!", "Nome ausente", JOptionPane.ERROR_MESSAGE);
        } else {
            //Imprimir uma saudacao
            System.out.println("nome: " + nome);
            JOptionPane.showMessageDialog(null, "Olá " + nome + "! Seja bem vindo!", "Saudação", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
