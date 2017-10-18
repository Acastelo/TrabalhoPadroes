package command;

//Invoker
public class Joystick {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressionarBotao(){
		command.execute();
	}
}
