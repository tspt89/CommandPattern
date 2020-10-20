public class SecurityControlOffCommand implements Command{
	SecurityControl secControl;

	public SecurityControlOffCommand(SecurityControl secControl){
		this.secControl = secControl;
	}

	public void execute(){
		secControl.disarm();
	}
}