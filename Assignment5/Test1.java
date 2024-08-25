class UIDGen{
	static int uidGen=0;
	static int getUID(){
		uidGen+=10;
		return uidGen;
	} 
}
class Test1{
	public static void main(String[] args){
		System.out.println("Unique ID: "+ UIDGen.getUID());
	}
}
