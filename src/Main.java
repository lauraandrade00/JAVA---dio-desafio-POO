import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Laura:" + devLaura.getConteudosInscritos());

        devLaura.progredir();
        devLaura.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Laura:" + devLaura.getConteudosInscritos());
        System.out.println("Conteúdos ConcluídosLaura:" + devLaura.getConteudosConcluidos());
        System.out.println("XP:" + devLaura.calcularTotalXp());

        System.out.println("--------");
        
        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Paulo:" + devPaulo.getConteudosInscritos());

        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Paulo:" + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo:" + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

       
    }
}