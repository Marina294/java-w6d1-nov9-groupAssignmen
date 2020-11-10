package marina1109w6d1assignment;


import java.time.LocalDateTime;


public class Appointment {

	private Patient patient;
	private LocalDateTime appointmentDate;

	public Appointment(Patient patient, LocalDateTime time) {
		this.patient = patient;
		setAppointmentDate(time);
	}

	public Patient getPatient() {
		return patient;
	}

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public void setAppointmentDate(LocalDateTime time) {
		this.appointmentDate = time;
	}

	@Override
	public String toString() {
		return "AppointmentDate : " +
				appointmentDate.getYear() + " " +
				appointmentDate.getMonth() +" " +
				appointmentDate.getDayOfMonth() + " " +
				appointmentDate.getHour() + ":" + appointmentDate.getMinute() 
//				 + "\nPatient is "+ patient.getFirstName() + " "+ patient.getLastName()
				 + "\n----------------";
		}

}

