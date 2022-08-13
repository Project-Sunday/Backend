package personal.projectsundaybackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne()
    @JoinColumn()
    private int userId;
    private int postId;

    private String content;
}
