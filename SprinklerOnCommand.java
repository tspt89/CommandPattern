public class SprinklerOnCommand implements Command{
	Sprinkler sprinkler;

	public SprinklerOnCommand(Sprinkler sprinkler){
		this.sprinkler = sprinkler;
	}

	public void execute(){
		sprinkler.on();
	}
}