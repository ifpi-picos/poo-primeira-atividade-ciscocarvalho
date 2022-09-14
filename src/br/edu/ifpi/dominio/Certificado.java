package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Certificado {
    public Aluno aluno;
    public Curso curso;
    public LocalDate dataDeEmissao;

    public Certificado(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeEmissao = LocalDate.now();
    }

    public Certificado(Aluno aluno, Curso curso, LocalDate dataDeEmissao) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeEmissao = dataDeEmissao;
    }
}