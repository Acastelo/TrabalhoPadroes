package memento;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	private double valor;
	CalculadoraCareTaker careTaker;
	public static Calculadora instancia;
	
	private Calculadora() {
		limpar();
	}
	
	public static Calculadora getInstancia() {
		if(instancia == null)
			instancia = new Calculadora();
		return instancia;
	}
	
	public String calcular(String expressao) {
		String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Operacao> listaOperadores = new ArrayList<Operacao>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;
	}
	
	private String calcularValor(List<Double> listaNumeros, List<Operacao> listaOperadores) {
        double total = 0;
        int j=0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (total==0) {
            	total = listaNumeros.get(i).doubleValue();
            }
            else if (total>0) {
                
                double numero = listaNumeros.get(i).doubleValue();
                Operacao operacao = listaOperadores.get(j);
                total = executarOperacao(total, operacao, numero);
                j++;
            }
        }
        return formatar(total);
    }

    private String formatar(double total) {
    	String retorno = "";
    	if(total == Double.MAX_VALUE || total == Double.MIN_VALUE) {
    		retorno = "Erro";
    	}
    	else if((int) total == total) {
    		retorno = Integer.toString((int) total);
    	}
    	else {
    		retorno = String.valueOf(total);
    	}
        return retorno;
	}

	private double executarOperacao(double total, Operacao operacao, double numero) {
        double resultado = 0;
        
        this.valor = total;
        
        if(careTaker.getEstados().isEmpty()) {
        	careTaker.adicionarMemento(new CalculadoraMemento(Operacao.NULO, this.valor));
        }
        
        switch (operacao) {
		case SOMAR:
			resultado = somar(numero);
			break;
		case SUBTRAIR:
			resultado = subtrair(numero);
			break;
		case MULTIPLICAR:
			resultado = multiplicar(numero);
			break;
		case DIVIDIR:
			resultado = dividir(numero);
			break;
		case NULO:
			break;
		}
        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {

        List<Double> listaNumeros = new ArrayList<Double>();

        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroEmString.isEmpty())
        {
            Double numero = Double.valueOf(numeroEmString);
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }

    private List<Operacao> obterOperadores(String expressao) {

        List<Operacao> listaOperadores = new ArrayList<Operacao>();

        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
            	switch (expressao.charAt(i)) {
				case '+':
					listaOperadores.add(Operacao.SOMAR);
					break;
				case '-':
					listaOperadores.add(Operacao.SUBTRAIR);				
					break;
				case '*':
					listaOperadores.add(Operacao.MULTIPLICAR);
					break;
				case '/':
					listaOperadores.add(Operacao.DIVIDIR);
					break;
				}
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }
        return isOperador;
    }
	
	private double somar(double valor) {
		try {
			this.valor += valor;
			careTaker.adicionarMemento(new CalculadoraMemento(Operacao.SOMAR, valor));
		} catch (Exception e) {
			this.valor = Double.MAX_VALUE;
			System.out.println("Erro ao somar:"+e.getMessage());
		}
		return this.valor;
	}
	
	private double subtrair(double valor) {
		try {
			this.valor -= valor;
			careTaker.adicionarMemento(new CalculadoraMemento(Operacao.SUBTRAIR, valor));
		} catch (Exception e) {
			this.valor = Double.MIN_VALUE;
			System.out.println("Erro ao subtrair:"+e.getMessage());
		}
		return this.valor;
	}
	
	private double multiplicar(double valor) {
		try {
			this.valor *= valor;
			careTaker.adicionarMemento(new CalculadoraMemento(Operacao.MULTIPLICAR, valor));
		} catch (Exception e) {
			this.valor = Double.MAX_VALUE;
			System.out.println("Erro ao multiplicar:"+e.getMessage());
		}
		return this.valor;
	}
	
	private double dividir(double valor) {
		try {
			this.valor /= valor;
			careTaker.adicionarMemento(new CalculadoraMemento(Operacao.DIVIDIR, valor));
		} catch (Exception e) {
			this.valor = Double.MIN_VALUE;
			System.out.println("Erro ao dividir:"+e.getMessage());
		}
		return this.valor;
	}
	
	public String desfazerUltimaOperacao() {
		CalculadoraMemento estadoSalvo = careTaker.getUltimoEstadoSalvo();
		
		switch (estadoSalvo.getOperacao()) {
		case SOMAR:
			this.valor -= estadoSalvo.getValor();
			break;
		case SUBTRAIR:
			this.valor += estadoSalvo.getValor();
			break;
		case MULTIPLICAR:
			this.valor /= estadoSalvo.getValor();
			break;
		case DIVIDIR:
			this.valor *= estadoSalvo.getValor();
			break;
		case NULO:
			this.valor = 0;
			break;
		}
		return formatar(this.valor);
	}
	
	public void limpar() {
		careTaker = new CalculadoraCareTaker();
		this.valor = 0;
	}
	
	public String getOperacoesSalvas() {
		List<CalculadoraMemento> operacoes = new ArrayList<CalculadoraMemento>();
		operacoes = careTaker.getEstados();
		Operacao operacao;
		String retorno = "";
		double valor = 0;
		for (CalculadoraMemento calculadoraMemento : operacoes) {
			operacao = calculadoraMemento.getOperacao();
			valor = calculadoraMemento.getValor();

			switch (operacao) {
			case NULO:
				retorno += formatar(valor);
				break;
			case SOMAR:
				retorno += ("+"+formatar(valor));
				break;
			case SUBTRAIR:
				retorno += ("-"+formatar(valor));
				break;
			case MULTIPLICAR:
				retorno += ("*"+formatar(valor));
				break;
			case DIVIDIR:
				retorno += ("/"+formatar(valor));
				break;
			}
		}
		return retorno;
	}
}