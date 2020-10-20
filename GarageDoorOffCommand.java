public class GarageDoorOffCommand implements Command{
	GarageDoor garage;

	public GarageDoorOffCommand(GarageDoor garage){
		this.garage = garage;
	}

	public void execute(){
		garage.off();
	}
}