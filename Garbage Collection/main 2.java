public class Main{
	public static void main(String args[]){
		Main m1 = new Main();
		Main m2 = new Main();

		//TO NULIFY THE REFERENCE VARIABLE
		m1 = null;

		//REQUESTING JVM FOR RUNNING GARBAGE COLLECTOR
		System.gc();

		//TO NULIFY THE REFERENCE VARIABLE
		m2 = null;
	
		//REQUESTING JVM FOR RUNNING GARBAGE COLLECTOR
		Runtime.getRuntime().gc();
	}
	@Override
	//FINALIZE METHOD IS CALLED ON OBJECT ONCE BEFORE GARBAGE COLLECTING IT
	protected void finalize() throws Throwable{
		System.out.print("Gargame collector called : ");
		System.out.print("\n Object garbage collected : "+this);
	}

}