public class GarageDoorOnCommand implements Command{
	GarageDoor garage;

	public GarageDoorOnCommand(GarageDoor garage){
		this.garage = garage;
	}

	public void execute(){
		garage.on();
	}
}