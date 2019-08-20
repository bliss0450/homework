package lesson_16;

//6. Create a separate class to represent a user. This class should have all the fields according to the mock service.


public class usersDTO {
    int id;
    String FirstName;
    String LastName;
    String email;
    int age;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public usersDTO(int id, String firstName, String lastName, String email, int age) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
        this.age = age;
    }
    public usersDTO() {

    }
}
