public class FaucetCloseCommand implements Command{
	FaucetControl faucet;

	public FaucetCloseCommand(FaucetControl faucet){
		this.faucet = faucet;
	}

	public void execute(){
		faucet.closeValue();
	}
}