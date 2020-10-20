public class FaucetOpenCommand implements Command{
	FaucetControl faucet;

	public FaucetOpenCommand(FaucetControl faucet){
		this.faucet = faucet;
	}

	public void execute(){
		faucet.openValue();
	}
}