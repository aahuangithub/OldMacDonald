class Cow implements Animal 
{     
		public String myType, mySound;
		public Cow (){
			myType = mySound = "Unknown";
		}
		public Cow (String type, String sound){
			myType = type;
			mySound = sound;
		}
		public String getSound(){return mySound;}
		public String getType(){return myType;}
}
