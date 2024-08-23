class Main{
	Main(){
		System.out.println("Object Created");
	}
	
	protected void finalize(){
		System.out.println("Object Released");	
	}

	public static void main(String args[]){
		Main m = new Main();
	m = null;
	System.gc(); 
	}
}