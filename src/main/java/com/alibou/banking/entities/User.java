package com.alibou.banking.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue
    private Integer RIB;
    private String username;
    private String address;
    private Role role;

    @OneToMany(mappedBy = "user_c")
    private List<Contact> contacts;

    @OneToMany(mappedBy="user_t")
    private List<Transaction> transactions;




}
