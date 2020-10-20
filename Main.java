public class Main{
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		OutdoorLight outdoorLight = new OutdoorLight();
		OutdoorLightOnCommand outdoorOn = new OutdoorLightOnCommand(outdoorLight);

		remote.setCommand(outdoorOn);
		remote.buttonWasPressed();

		OutdoorLightOffCommand outdoorOff = new OutdoorLightOffCommand(outdoorLight);

		remote.setCommand(outdoorOff);
		remote.buttonWasPressed();

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);



		Sprinkler sprinkler = new Sprinkler();
		SprinklerOnCommand sprinklerOn = new SprinklerOnCommand(sprinkler);

		SecurityControl sec = new SecurityControl();
		SecurityControlOnCommand secArm = new SecurityControlOnCommand(sec);

		FaucetControl faucet = new FaucetControl();
		FaucetOpenCommand faucetOpen = new FaucetOpenCommand(faucet);

		CeillingFan ceilling = new CeillingFan();
		CeillingFanOnCommand ceillingOn = new CeillingFanOnCommand(ceilling);

		SecurityControl secControl = new SecurityControl();
		SecurityControlOnCommand secControlArmed = new SecurityControlOnCommand(secControl);

		TV tv = new TV();
		TVOnCommand tvOn = new TVOnCommand(tv);

		remote.setCommand(tvOn);
		remote.buttonWasPressed();
	}
}