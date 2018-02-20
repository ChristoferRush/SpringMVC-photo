package pl.fotobudka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fotobudka.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
