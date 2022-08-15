package personal.projectsundaybackend.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.projectsundaybackend.entities.User;

public interface UserDAO extends JpaRepository<User, Integer> {
}
