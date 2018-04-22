package pl.queensparty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.queensparty.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
