public class OutdoorLightOffCommand implements Command{
	OutdoorLight outdoor;

	public OutdoorLightOffCommand(OutdoorLight outdoor){
		this.outdoor = outdoor;
	}

	public void execute(){
		outdoor.off();
	}
}