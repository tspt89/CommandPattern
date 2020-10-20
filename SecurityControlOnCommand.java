public class SecurityControlOnCommand implements Command{
	SecurityControl secControl;

	public SecurityControlOnCommand(SecurityControl secControl){
		this.secControl = secControl;
	}

	public void execute(){
		secControl.arm();
	}
}