public interface PatientService {

	PatientData savePatient(PatientData patientData);

	PatientData getPatientById(Long patientId);
}