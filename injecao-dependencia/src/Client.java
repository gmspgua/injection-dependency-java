
public class Client {
	
	private Notification notification;
	
	public Client(Notification notification) {
		
		this.notification = notification;
	}

	public void notificar (){
		notification.envia();
	}
}
