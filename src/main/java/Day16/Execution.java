package Day16;

public class Execution implements Interface, Conclision {

	// Execution is the child class
	// What is Execution class doing ?
	// it is implementing all the unimplemented methods of the interface

	// So Execution is what ? It is the implementing Class of the interface

	public static void main(String[] args) {
		Conclision refrence = new Execution();
        refrence.codeEnd();
        refrence.disconnectDB();
        refrence.tearDown();
        refrence.codeEnd();
        Interface refr = new Execution();
        refr.hashCode();
        
	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void codeEnd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disconnectDB() {
		// TODO Auto-generated method stub

	}

	@Override
	public void helloWorld() {
		// TODO Auto-generated method stub

	}

}
