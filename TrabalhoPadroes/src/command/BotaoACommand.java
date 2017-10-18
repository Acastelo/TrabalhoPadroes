package command;

//ConcreteCommand
public class BotaoACommand implements Command {

	Jogo jogo;

	public BotaoACommand(Jogo jogo) {
		// TODO Auto-generated constructor stub
		this.jogo = jogo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		jogo.acao();
	}

}
