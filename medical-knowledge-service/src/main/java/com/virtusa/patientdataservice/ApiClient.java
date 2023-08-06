
@FeignClient(name = "PATIENT-DATA-SERVICE")
public interface APIClient {
    // Build get department rest api
    @GetMapping("api/patient-data/{patient_id}")
    PatientData getPatientById(@PathVariable("patient_id") String patientId);
}