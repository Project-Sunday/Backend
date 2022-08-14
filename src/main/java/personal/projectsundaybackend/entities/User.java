package personal.projectsundaybackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String username;
    private String email;
    private String password;

    enum role {USER, ADMIN};

    @OneToMany(mappedBy = "userId")
    private List<Post> posts;

    @OneToMany(mappedBy = "userId")
    private List<Comment> comments;
}
