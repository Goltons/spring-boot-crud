package com.springbootbankapplication.bank.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
public class Cart extends BaseEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String cartId;
    private Double deposit;
    @Column(length = 2)
    private String countryCode;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 8)
    private int accountNumber;
    @Column(length = 1)
    private int checkSum;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,optional=true)
    @JoinColumn(name = "userId")
    private User user;

    @Enumerated
    private cartTypeCode cartTypeCode;
    @Enumerated
    private bankCode bankCode;
    public enum cartTypeCode {
        AIRPORT(1),
        ENTERTAINMENT(2),
        FINANCE(3),
        OTHERS(7),
        PATROL(5),
        TELECOMMUNICATION(6),
        TRADE(4);
        private int cartCode;

        cartTypeCode(int cartCode) {
            this.cartCode = cartCode;
        }
    }

    public enum bankCode{
        ZIRAATBANK(12345),
        HALKBANK(23456),
        OTHERS(34567);

        private int bankCode;

        bankCode(int bankCode) {
            this.bankCode = bankCode;
        }
    }
}
