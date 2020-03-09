
public class Main {
	
	public static void main(String[] args) {
		
		Client clientSms = new Client(new Sms());
		clientSms.notificar();
		
		Client clientEmail = new Client(new Email());
		clientEmail.notificar();
	}

}
