package QA.hsbc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QA.hsbc.Entities.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Integer>{

}
