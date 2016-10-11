class Chick implements Animal 
{     
	private String[] mySound = new String[2];
	private String myType;
	public Chick(){myType = mySound[0] = mySound[1] = "unknown";}
	public Chick(String type, String sound1, String sound2){
		myType = type;
		mySound[0] = sound1;
		mySound[1] = sound2;
	}
	public String getSound(){return mySound[(int)(Math.random()*2)];}
	public String getType(){return myType;}
}
