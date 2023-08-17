import entity.Endereco;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua 1", "Cidade A");
        Endereco e2 = new Endereco("Rua 2", "Cidade B");
        Endereco e3 = new Endereco("Rua 3", "Cidade C");
        Endereco e4 = new Endereco("Rua 4", "Cidade D");
        Endereco e5 = new Endereco("Rua 5", "Cidade E");

        Pessoa p1 = new Pessoa("calleri", "Guedes", "patinho@gmail", e1);
        Pessoa p2 = new Pessoa("Valkiria", "Milhomem", "maedorafinha@hotmail", e2);
        Pessoa p3 = new Pessoa("Tiabete", "Calvo", "cabeludo2005@gmail", e3);
        Pessoa p4 = new Pessoa("Gustavinho", "Gameplays", "minecraft2013@gmail", e4);
        Pessoa p5 = new Pessoa("Mamonas", "Assassinas", "mamonas1996@gmail", e5);

        Session session = hibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p));

    }
}
