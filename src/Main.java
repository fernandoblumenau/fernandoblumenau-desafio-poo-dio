import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 =new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(4);

        Curso curso2 =new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setTitulo("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:"+camila.getConteudosInscristos());
        camila.progredir();
        System.out.println("-------");
        System.out.println("Conteudos Inscritos:"+camila.getConteudosInscristos());
        System.out.println("Conteudos Concluido:"+camila.getConteudosConcluidos());
        System.out.println("XP:"+camila.calcularXP());


        System.out.println("*************");

        Dev fernando = new Dev();
        fernando.setNome("Fernando");
        fernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:"+fernando.getConteudosInscristos());
        fernando.progredir();
        fernando.progredir();
        fernando.progredir();
        System.out.println("-------");
        System.out.println("Conteudos Inscritos:"+fernando.getConteudosInscristos());
        System.out.println("Conteudos Concluido:"+fernando.getConteudosConcluidos());
        System.out.println("XP:"+fernando.calcularXP());



    }
}
