package web.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", catalog = "users")
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_photo")
    private String userPhoto;

    public User(String name, String lastName, String userPhoto) {
        this.name = name;
        this.lastName = lastName;
        this.userPhoto = userPhoto;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", userPhoto='" + userPhoto + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
}
