class NamedCow extends Cow
{
	private String myName;
	public NamedCow(){
		myName = myType = mySound = "Unknown";
	}
	public NamedCow(String type, String sound, String name){
		myType = type;
		mySound = sound;
		myName = name;
	}
	public String getName(){
		return myName;
	}
}