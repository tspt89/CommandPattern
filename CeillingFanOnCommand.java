public class CeillingFanOnCommand implements Command{
	CeillingFan cF;

	public CeillingFanOnCommand(CeillingFan cF){
		this.cF = cF;
	}

	public void execute(){
		cF.on();
	}
}