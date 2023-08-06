import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.patientdataservice.entity.PatientData;
import com.virtusa.patientdataservice.service.PatientService;

@RestController
@RequestMapping("api/patient-data")
public class PatientDataController {
	
	    @Autowired
	    private PatientService patientService;
	
	    @PostMapping
	    public ResponseEntity<PatientData> savePatient(@RequestBody PatientData patientData){
	        PatientData savedPatient = patientService.savePatient(patientData);
	        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
	    }

	    @GetMapping("{patient_id}")
	    public ResponseEntity<PatientData> getEmployee(@PathVariable("patient_id") Long patientId){
	    	PatientData patientData = patientService.getPatientById(patientId);
	        return new ResponseEntity<>(patientData, HttpStatus.OK);
	    }

}
