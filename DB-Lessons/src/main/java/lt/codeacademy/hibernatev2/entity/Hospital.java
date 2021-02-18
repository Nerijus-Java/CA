package lt.codeacademy.hibernatev2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "LIGONINE")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LIGONINE_ID")
    private Long id;

    @Column(name = "PAVADINIMAS")
    private String name;

    @Column(name = "MIESTAS")
    private String city;

    @Column(name = "ADRESAS")
    private String address;

}
