package vasilivanov;

import vasilivanov.entities.EventDAO;
import vasilivanov.entities.User;
import vasilivanov.entities.UserDAO;
import vasilivanov.enums.Sex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
  private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d2w3");

  public static void main(String[] args) {
    EntityManager em = emf.createEntityManager();
    System.out.println("Hello World!");

    try {

      EventDAO sd = new EventDAO(em);
      UserDAO ud = new UserDAO(em);
      User user1 = new User("Franco", "Primo", "franco@gmail.com", "27/10/2002", Sex.MALE);

      ud.save(user1);
    } catch (Exception ex) {
      System.err.println(ex.getMessage());
    } finally {
      em.close();
      emf.close();
    }

  }
}
