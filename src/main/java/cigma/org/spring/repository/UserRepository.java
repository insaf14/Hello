package cigma.org.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cigma.org.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
