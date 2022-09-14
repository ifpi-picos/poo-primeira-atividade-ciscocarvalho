import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Ronaldo");
        Curso curso = new Curso("Matemática", "Superior", 2570, professor);

        System.out.printf("Professor de %s: %s\n", curso.getNome(), professor.getNome());
        System.out.printf("Carga horária do curso de %s: %s\n", curso.getNome(), curso.getCargaHoraria());
    }
}