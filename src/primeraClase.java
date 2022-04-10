
public class primeraClase {
	public static void main(String [] args) {
		boolean loveYou = false;
		String msg = "", msgEnd = "";
		
		switch(msg){
		case("He answers your messages"):
			loveYou = true;
		 	msgEnd = "He love you";
		 	break;
		case("He doesn't answer your messages"):
			loveYou = false;
			msgEnd = "He doesn't love you";
			break;
		default:
			msgEnd = "That has no answer";
		}
		System.out.println(msgEnd.toUpperCase());
		//System.out.println((loveYou)? "He love you" : "He doesn't love you");
	}

}
