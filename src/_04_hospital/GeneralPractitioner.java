package _04_hospital;

public class GeneralPractitioner extends Doctor {

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
	for (int i = 0; i < patients.size(); i++) {
		patients.get(i).happy=true;
	}	
	}

}
