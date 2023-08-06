
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medical")
public class MedicalKnowledge {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String firstName;
	    private String lastName;
	    @Column(nullable = false, unique = true)
	    private String email;
	    private String mobileno;
	    private String gender;
	    private String digonasis;
	    private String medicalKnowledge;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDigonasis() {
			return digonasis;
		}
		public void setDigonasis(String digonasis) {
			this.digonasis = digonasis;
		}
		public String getMedicalKnowledge() {
			return medicalKnowledge;
		}
		public void setMedicalKnowledge(String medicalKnowledge) {
			this.medicalKnowledge = medicalKnowledge;
		}
		public PatientData(Long id, String firstName, String lastName, String email, String mobileno, String gender,
				String digonasis, String medicalKnowledge) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobileno = mobileno;
			this.gender = gender;
			this.diagonasis = diagonasis;
			this.medicalKnowledge = medicalKnowledge;
		}
		public PatientData() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	    
	    
}
