package command;

public class Cliente {

	public static void main(String[] args) {

		Joystick joystick = new Joystick();

		joystick.setCommand(new BotaoACommand(new JogoCorrida()));
		joystick.pressionarBotao();

		joystick.setCommand(new BotaoACommand(new JogoFutebol()));
		joystick.pressionarBotao();

		joystick.setCommand(new BotaoACommand(new JogoLuta()));
		joystick.pressionarBotao();

	}
}
