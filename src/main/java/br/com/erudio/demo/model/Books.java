//package br.com.erudio.demo.model;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.DecimalMin;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "books")
//public class Books {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(nullable = false)
//    private String author;
//    @Column(nullable = false)
//    private LocalDateTime launchDate;
//    @Column(nullable = false)
//    @DecimalMin(value = "0.01", inclusive = false, message = "The price must be greater than 0.01")
//    private BigDecimal price;
//
//    @Column(nullable = false)
//    private String title;
//
//}
