package coursemanagement.coursemanagement.repository;

import coursemanagement.coursemanagement.entities.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topics, Integer> {
}
