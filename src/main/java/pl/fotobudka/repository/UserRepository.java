package pl.fotobudka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fotobudka.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
