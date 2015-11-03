package br.ufjf.dcc;

import javax.swing.JOptionPane;

public class Aula01Exm01 {

    public static void main(String[] args) {
        String nome = "Fulano";
        
        //Ler o nome
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        //Imprimir uma saudacao
        System.out.println("nome: "+nome);
        JOptionPane.showMessageDialog(null, "Olá "+nome+"! Seja bem vindo!", "Saudação", JOptionPane.PLAIN_MESSAGE);
    }
    
}
