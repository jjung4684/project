package app.survey.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Entity
@Data
public class SvTest {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @Column
    String description;

    @Column
    String name;

    @Column
    String password;


}
