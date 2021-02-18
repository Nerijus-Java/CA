package lt.codeacademy.hibernatev2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PACIENTAS")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PACIENTAS_ID")
    private Long ID;

    @Column(name = "VARDAS")
    private String name;

    @Column(name = "PAVARDE")
    private String surname;

    @Column(name = "STATUSAS")
    private String status;

    @Column(name = "PALATA_ID")
    private Long roomID;
}
