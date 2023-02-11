package QuestaoDois;

public class QuestaoDoisResposta {
    
    private int idade;

    private double altura;
    
    private char letra;
    
    private String nome;;
    
    public QuestaoDoisResposta(int idade, double altura, char letra, String nome)
    {
        this.idade = idade;
        this.altura = altura;
        this.letra = letra;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Idade: " + this.idade + 
        " altura: " + this.altura +
        " Primeira letra: " + this.letra +
        " Nome: " + this.nome;
    }
}
