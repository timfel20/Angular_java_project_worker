package backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.backend.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

}