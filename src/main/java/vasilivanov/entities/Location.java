package vasilivanov.entities;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String address;
  @OneToOne(mappedBy = "location")
  private Event event;

  public Location() {
  }

  public Location(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }
}
