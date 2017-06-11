package by.itacademy.entity;

import by.itacademy.entity.userEntity.Client;
import by.itacademy.entity.userEntity.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promotions")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
public class Promotion extends BaseEntity {
    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;

    @Column(name = "closing_date")
    private LocalDateTime closingDate;

    @Column(name = "content")
    private String content;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "promotions", cascade = CascadeType.PERSIST)
    private Set<Client> clients = new HashSet<>();
}
