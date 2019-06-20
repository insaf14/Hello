package cigma.org.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cigma.org.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
