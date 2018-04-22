package pl.queensparty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.queensparty.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
