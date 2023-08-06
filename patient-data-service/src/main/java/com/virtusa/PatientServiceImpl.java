import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.patientdataservice.entity.PatientData;
import com.virtusa.patientdataservice.repository.PatientRepository;
import com.virtusa.patientdataservice.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientServiceImpl.class);
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public PatientData savePatient(PatientData patientData) {
		PatientData savedPatient = patientRepository.save(patientData);
		return savedPatient;
	}

	@Override
	public PatientData getPatientById(Long patientId) {
		Optional<PatientData> patientData = patientRepository.findById(patientId);
		
		return patientData.get();
	}

}
