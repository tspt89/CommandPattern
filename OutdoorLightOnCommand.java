public class OutdoorLightOnCommand implements Command{
	OutdoorLight outdoor;

	public OutdoorLightOnCommand(OutdoorLight outdoor){
		this.outdoor = outdoor;
	}

	public void execute(){
		outdoor.on();
	}
}