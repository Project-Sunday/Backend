package personal.projectsundaybackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

import java.io.File;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int userId;
    private int likes;
    private File image;

    @OneToMany()
    @JoinColumn()
    private Comment[] comments;
}
