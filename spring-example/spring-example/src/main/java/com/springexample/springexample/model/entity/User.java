package com.springexample.springexample.model.entity;



import com.springexample.springexample.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Column(name = "username", nullable = false, unique = true)
    private String username;


    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private UserRole role;

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails ;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Booking> bookings;


}

