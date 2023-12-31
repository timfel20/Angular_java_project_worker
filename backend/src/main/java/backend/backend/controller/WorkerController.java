package backend.backend.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.model.Worker;
import backend.backend.repository.WorkerRepository;


@CrossOrigin(origins = "http://localhost:4200") 

@RestController
@RequestMapping("/api/v1/")
public class WorkerController {

	@Autowired
	private WorkerRepository workerRepository;
	
	// get all workers
	@GetMapping("/workers")
	public List<Worker> getAllWorkers(){
		return workerRepository.findAll();
	}	
	
	@PostMapping("/workers")
	public Worker createWorkers(@RequestBody Worker worker) {
		return workerRepository.save(worker);
	}
}