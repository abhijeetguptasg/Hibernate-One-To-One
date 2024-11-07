package example;

import jakarta.persistence.*;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String city;
    
    @OneToOne
    @JoinColumn(name = "aadhaar_id") // Foreign key column in 'Person' table
    private Aadhaar aadhaar;

    // Constructors
    public Person() {}

    public Person(String name, String city, Aadhaar aadhaar) {
        this.name = name;
        this.city = city;
        this.aadhaar = aadhaar;
    }

    // Getters and Setters
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Aadhaar getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", aadhaar=" + aadhaar +
                '}';
    }
}

