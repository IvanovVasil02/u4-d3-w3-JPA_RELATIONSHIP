package vasilivanov.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipations")
public class Partecipation {
  @Id
  @GeneratedValue
  private long id;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @OneToOne
  @JoinColumn(name = "event_id")
  private Event event;

  public Partecipation() {
  }

  public Partecipation(User user, Event event) {
    this.user = user;
    this.event = event;
  }

  public long getId() {
    return id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }
}
