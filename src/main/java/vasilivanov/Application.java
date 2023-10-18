package vasilivanov;

import vasilivanov.entities.Event;
import vasilivanov.entities.EventDAO;
import vasilivanov.enums.EventType;

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
      Event event1 = new Event("Event test 2", "28/10/2023", EventType.PUBLIC, 30);


      sd.deleteEventById(4);

    } catch (Exception ex) {
      System.err.println(ex.getMessage());
    } finally {
      em.close();
      emf.close();
    }

  }
}
