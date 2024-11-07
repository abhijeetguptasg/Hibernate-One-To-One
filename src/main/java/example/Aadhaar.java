package example;

import jakarta.persistence.*;


@Entity
public class Aadhaar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String aadhaarNumber;
    
    private String issuedBy;

    // Constructors
    public Aadhaar() {}
    
    public Aadhaar(String aadhaarNumber, String issuedBy) {
        this.aadhaarNumber = aadhaarNumber;
        this.issuedBy = issuedBy;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "id=" + id +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", issuedBy='" + issuedBy + '\'' +
                '}';
    }
}