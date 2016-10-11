class Pig implements Animal 
{     
	String myType, mySound;
	public Pig(String type, String sound){
		myType = type;
		mySound = sound;
	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}

}
