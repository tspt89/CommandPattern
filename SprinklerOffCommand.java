public class SprinklerOffCommand implements Command{
	Sprinkler sprinkler;

	public SprinklerOffCommand(Sprinkler sprinkler){
		this.sprinkler = sprinkler;
	}

	public void execute(){
		sprinkler.off();
	}
}