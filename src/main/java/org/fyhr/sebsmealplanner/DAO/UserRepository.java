package org.fyhr.sebsmealplanner.DAO;

import org.fyhr.sebsmealplanner.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
