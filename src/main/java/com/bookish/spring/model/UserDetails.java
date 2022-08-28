package com.bookish.spring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details")
public class UserDetails {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    @Column(nullable = false)
    private String firstname;
    
    @NotEmpty
    @Column(nullable = false)
    private String lastname;
    
    @NotEmpty
    @Column(nullable = false)
    private String address1;
    
    @NotEmpty
    @Column(nullable = false)
    private String address2;

    @NotEmpty
    @Column(nullable = false)
    private String zip;

    @NotEmpty
    @Column(nullable = false)
    private String city;

    @NotEmpty
    @Column(nullable = false)
    private String phone;

    @NotEmpty
    @Column(nullable = true)
    private String mail;
    @NotEmpty
    @Column(nullable = false)
    private String bookname;
    @Column(nullable = false)
    private int number;


    public UserDetails(UserDetails userdeDetails) {
        this.firstname = userdeDetails.getFirstname();
        this.lastname = userdeDetails.getLastname();
        this.address1 = userdeDetails.getAddress1();
        this.address2 = userdeDetails.getAddress2();
        this.zip = userdeDetails.getZip();
        this.city = userdeDetails.getCity();
        this.phone = userdeDetails.getPhone();
        this.mail = userdeDetails.getMail();
        this.bookname = userdeDetails.getBookname();
        this.number = userdeDetails.getNumber();
    }
    public UserDetails(){
    }
}
