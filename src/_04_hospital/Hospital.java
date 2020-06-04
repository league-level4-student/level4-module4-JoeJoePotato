package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList <Doctor> doctors=new ArrayList <Doctor> ();
ArrayList <Patient> patients=new ArrayList <Patient> ();
	
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
		for (int i = 0; i < doctors.size(); i++) {
			try {
				doctors.get(i).assignPatient(patient);
			} catch (DoctorFullException dfe) {
			}
		}
	}

	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		doctors.add(d);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

}
