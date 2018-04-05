package d4enterprises.daggerdaodemo.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by dakshgargas
 */

@Entity(indexes = {
        @Index(value = "id,name ASEC", unique = true) //the combination of id and name should be unique
})
public class User {

    @Id
    private Long id;

    /**
     * We are NOT using @NonNull annotation.
     * This annotation is provided by Android and is used for argument acceptance
     * whereas @NotNull (by GreenDao) will make DataBase aware that this field can not be null.
     *
     * Acc to GreenDao Documentation:
     * Specifies that property is not null
     * You can also use any another NotNull or
     * NonNull annotation (from any library or your own), they are equal to using this
     */
    @NotNull
    private String name;

    private String address;
    private String createdAt;
    private String updatedAt;



    public User() {
    }

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}

