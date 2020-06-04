package _04_hospital;

public class Patient {
Doctor assignedto;
Boolean assigned=false;
Boolean happy=false;
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		return happy;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		if(happy==false) {
			happy=true;
		}
	}

}
