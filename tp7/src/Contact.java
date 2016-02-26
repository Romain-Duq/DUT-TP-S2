public class Contact {
	String contact, email;
	
	public Contact(String c, String e){
		this.contact = c;
		this.email = e;
	}
	
	public String toString(){
		return "nom : " + this.contact + "-" + this.email;
	}

}
