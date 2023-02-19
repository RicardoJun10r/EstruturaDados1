package util;

import java.io.Serializable;

public class Pessoa implements Serializable  {
    
    private String nome;

    private String cpf;

    private int idade;

    private char sexo;

    private double peso;

    private double altura;

    private double imc;

    public Pessoa(String nome, String cpf, int idade, char sexo, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.calcImc();
    }

    public Pessoa()
    {
        
    }

    public void calcImc()
    {
        this.imc = this.peso/(this.altura*this.altura);
    }

    public double getImc()
    {
        return this.imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + ", imc=" + imc + "]";
    }
}
