package org.example.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "phone")
public class PhoneEntity {

    @Id
    @GeneratedValue(generator ="uuid_generator")
    @GenericGenerator(name = "uuid_generator",strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_created")
    private Date time;
    private Boolean onStock;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @ToString.Exclude
    private PersonEntity person;


}
