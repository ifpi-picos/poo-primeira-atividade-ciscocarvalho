package br.edu.ifpi.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String nivel;
    private int cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, String nivel, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}