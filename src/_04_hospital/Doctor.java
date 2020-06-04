package _04_hospital;

import java.util.ArrayList;
import java.util.List;


public class Doctor {


ArrayList <Patient> patients=new ArrayList<Patient>();

public void assignPatient(Patient patient) throws DoctorFullException {
	// TODO Auto-generated method stub
	if(patients.size()<3 && patient.assigned==false) {
	patients.add(patient);
	patient.assignedto=this;
	patient.assigned=true;
	}else {	
		throw new DoctorFullException();
	}
	}

public Object performsSurgery() {
	// TODO Auto-generated method stub
	return false;
}

public Object makesHouseCalls() {
	// TODO Auto-generated method stub
	return false;
}

public ArrayList<Patient> getPatients() {
	// TODO Auto-generated method stub
	return patients;
}

public void doMedicine() {
	// TODO Auto-generated method stub
	
}


}




