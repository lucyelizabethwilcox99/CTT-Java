package Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.College;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer>{

}
