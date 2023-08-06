import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MedicalKnowledgeServiceImpl implements PatientService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MedicalKnowledgeServiceImpl.class);
	
	@Autowired
	private MedicalRepository medicalRepository;



}
