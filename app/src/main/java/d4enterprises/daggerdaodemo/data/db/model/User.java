package d4enterprises.daggerdaodemo.data.db.model;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;

import d4enterprises.daggerdaodemo.data.db.converter.GenderTypeConverter;
import d4enterprises.daggerdaodemo.enums.Gender;

import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dakshgargas
 */
//This annotation marks a Java class as a persistable(that can be made permanent) entity for greenDAO
@Entity(
        // specifies the name of the table in Database
        nameInDb = "AWESOME_USERS",

        //Define indexes spanning multiple columns here
        indexes = {
                @Index(value = "id,name DESC", unique = true)}, //the combination of id and name should be unique

        generateConstructors = true,

        generateGettersSetters = true
)
public class User {

    @Id(autoincrement = true)
    private Long id;

    /**
     * We are NOT using @NonNull annotation.
     * This annotation is provided by Android and is used for argument acceptance
     * whereas @NotNull (by GreenDao) will make DataBase aware that this field can not be null.
     * <p>
     * Acc to GreenDao Documentation:
     * Specifies that property is not null
     * You can also use any another NotNull or
     * NonNull annotation (from any library or your own), they are equal to using this
     */
    @NotNull
    @Property(nameInDb = "USERNAME")
    private String name;

    private String address;
    private String createdAt;
    private String updatedAt;

    @Convert(converter = GenderTypeConverter.class, columnType = String.class)
    private Gender gender;


    @Generated(hash = 591700353)
    public User(Long id, @NotNull String name, String address, String createdAt, String updatedAt,
                Gender gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.gender = gender;
    }


    @Generated(hash = 586692638)
    public User() {
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

    //region Getters and Setters
    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return this.address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getCreatedAt() {
        return this.createdAt;
    }


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    public String getUpdatedAt() {
        return this.updatedAt;
    }


    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    public Gender getGender() {
        return this.gender;
    }


    public void setGender(Gender gender) {
        this.gender = gender;
    }
    //endregion
}

