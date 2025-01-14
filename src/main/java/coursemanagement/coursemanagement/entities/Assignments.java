package coursemanagement.coursemanagement.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int score;

    @OneToMany(mappedBy= "assignment", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Questions> questions;
}
