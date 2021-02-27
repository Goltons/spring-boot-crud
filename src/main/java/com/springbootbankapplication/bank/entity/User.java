package com.springbootbankapplication.bank.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
public class User extends BaseEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")

    private String userId;
    @Column(length = 11)
    private Long phoneNumber;
    @Column(length = 8)
    private String password;
    private String address;
    @OneToMany
    private List<Cart> carts;

}
