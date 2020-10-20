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

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		LightOffCommand lightOff = new LightOffCommand(light);

		remote.setCommand(lightOff);
		remote.buttonWasPressed();		

		Sprinkler sprinkler = new Sprinkler();
		SprinklerOnCommand sprinklerOn = new SprinklerOnCommand(sprinkler);

		remote.setCommand(sprinklerOn);
		remote.buttonWasPressed();		

		SprinklerOffCommand sprinklerOff = new SprinklerOffCommand(sprinkler);

		remote.setCommand(sprinklerOff);
		remote.buttonWasPressed();		

		SecurityControl sec = new SecurityControl();
		SecurityControlOnCommand secArm = new SecurityControlOnCommand(sec);

		remote.setCommand(secArm);
		remote.buttonWasPressed();	

		SecurityControlOffCommand secDisarm = new SecurityControlOffCommand(sec);

		remote.setCommand(secDisarm);
		remote.buttonWasPressed();	

		FaucetControl faucet = new FaucetControl();
		FaucetOpenCommand faucetOpen = new FaucetOpenCommand(faucet);

		remote.setCommand(faucetOpen);
		remote.buttonWasPressed();	

		FaucetCloseCommand faucetClosed = new FaucetCloseCommand(faucet);

		remote.setCommand(faucetClosed);
		remote.buttonWasPressed();	

		CeillingFan ceilling = new CeillingFan();
		CeillingFanOnCommand ceillingOn = new CeillingFanOnCommand(ceilling);

		remote.setCommand(ceillingOn);
		remote.buttonWasPressed();	

		CeillingFanOffCommand ceillingOff = new CeillingFanOffCommand(ceilling);

		remote.setCommand(ceillingOff);
		remote.buttonWasPressed();	

		SecurityControl secControl = new SecurityControl();
		SecurityControlOnCommand secControlArmed = new SecurityControlOnCommand(secControl);

		remote.setCommand(secControlArmed);
		remote.buttonWasPressed();

		SecurityControlOffCommand secControlDisarmed = new SecurityControlOffCommand(secControl);

		remote.setCommand(secControlDisarmed);
		remote.buttonWasPressed();

		TV tv = new TV();
		TVOnCommand tvOn = new TVOnCommand(tv);

		remote.setCommand(tvOn);
		remote.buttonWasPressed();

		TVOffCommand tvOff = new TVOffCommand(tv);

		remote.setCommand(tvOff);
		remote.buttonWasPressed();
	}
}