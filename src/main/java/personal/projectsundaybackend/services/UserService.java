package personal.projectsundaybackend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import personal.projectsundaybackend.daos.UserDAO;
import personal.projectsundaybackend.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDAO userDAO;
    @Autowired
    HttpServletRequest req;

    public boolean register(User u) {
        LOGGER.info("Executing register() service");
        return false;
    }

    public User login(User u) {
        LOGGER.info("Executing login() service");
        return u;
    }

    public void logout() {
        LOGGER.info("Executing logout() service");
        HttpSession session = req.getSession(false);
        if(session == null) return;
        session.invalidate();
    }

    public List<User> getUsers() {
        LOGGER.info("Executing getUsers() service");
        return userDAO.findAll();
    }

    public User getUser() {
        LOGGER.info("Executing getUser() service");
        return new User();
    }

    public boolean updateUser() {
        LOGGER.info("Executing updateUser() service");
        return false;
    }

    public boolean deleteUser() {
        LOGGER.info("Executing deleteUser() service");
        return false;
    }
}
