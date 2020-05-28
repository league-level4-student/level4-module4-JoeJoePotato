package _04_hospital;

import java.util.ArrayList;
import java.util.List;


public class Doctor {


ArrayList <Patient> patients=new ArrayList<Patient>();

public void assignPatient(Patient patient) {
	// TODO Auto-generated method stub
	if(patients.size()<3) {
	patients.add(patient);
	patient.assignedto=this;
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




