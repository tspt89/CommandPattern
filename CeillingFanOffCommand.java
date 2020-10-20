public class CeillingFanOffCommand implements Command{
	CeillingFan cF;

	public CeillingFanOffCommand(CeillingFan cF){
		this.cF = cF;
	}

	public void execute(){
		cF.off();
	}
}