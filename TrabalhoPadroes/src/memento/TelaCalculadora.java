/*
 * Faça um programa que simule uma calculadora simples com as operações aritméticas básicas(soma, subtração, multiplicação e divisão).
 * Permita que o usuário faça uma operação com vários operadores e operandos. Ex: 4 + 85 – 30.
 * Use o padrão Memento para armazenar os estados do seu sistema, onde cada operação e operando é um memento, e permita o usuário desfazer a última inserção.
 * Por exemplo, se o usuário quiser desfazer a operação anterior, ele verá 8 + 45 -.
 * Ao final, mostre o valor do cálculo solicitado ou uma mensagem de erro caso não seja possível realizá-lo. 
 */
package memento;
import java.awt.Component;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class TelaCalculadora extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	private boolean itMustClean;
	
    public TelaCalculadora() {
    	setTitle("Memento");
    	setResizable(false);
        initComponents();
        itMustClean = false;
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculador = new javax.swing.JTextPane();
        visorOperacoes = new javax.swing.JTextPane();
        visorOperacoes.setEnabled(false);
        visorOperacoes.setEditable(false);
        botaoCE = new javax.swing.JButton();
        botaoCE.setToolTipText("Limpa o conte\u00FAdo");
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoVezes = new javax.swing.JButton();
        botaoVezes.setToolTipText("Multiplica\u00E7\u00E3o");
        botaoDiv = new javax.swing.JButton();
        botaoDiv.setToolTipText("Divis\u00E3o");
        botaoMenos = new javax.swing.JButton();
        botaoMenos.setToolTipText("Subtra\u00E7\u00E3o");
        botaoMais = new javax.swing.JButton();
        botaoMais.setToolTipText("Soma");
        botaoIgual = new javax.swing.JButton();
        botaoIgual.setToolTipText("Resultado");
        botaoDesfazer = new javax.swing.JButton();
        botaoDesfazer.setToolTipText("Desfaz a \u00FAltima opera\u00E7\u00E3o");
        botaoDesfazer.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        visorCalculador.setFont(new Font("Tahoma", Font.PLAIN, 15));
        StyledDocument doc = visorCalculador.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);

        jScrollPane1.setViewportView(visorCalculador);

        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao0.setText("0");
        botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao0MouseClicked(evt);
            }
        });

        botaoVezes.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoVezes.setText("*");
        botaoVezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVezesMouseClicked(evt);
            }
        });

        botaoDiv.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoDiv.setText("/");
        botaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivMouseClicked(evt);
            }
        });

        botaoMenos.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoMenos.setText("-");
        botaoMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMenosMouseClicked(evt);
            }
        });

        botaoMais.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoMais.setText("+");
        botaoMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMaisMouseClicked(evt);
            }
        });

        botaoIgual.setText("=");
        botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIgualMouseClicked(evt);
            }
        });
        
        botaoDesfazer.setText("");
        botaoDesfazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	botaoDesfazerMouseClicked(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(visorOperacoes, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(botaoDesfazer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        					.addGap(0, 0, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(botaoCE, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(26)
        							.addComponent(botao0, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(botao1, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(botao2, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(botao7, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        								.addComponent(botao4, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(botao5, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        								.addComponent(botao8, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(botao3, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(botaoMais, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        						.addComponent(botaoIgual, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(botao6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(botaoMenos, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        								.addComponent(botaoVezes, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(botao9, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(botaoDiv, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
        							.addGap(2)))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(44)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(botaoDesfazer, 0, 0, Short.MAX_VALUE)
        				.addComponent(visorOperacoes, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(botaoVezes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoCE, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE, false)
        				.addComponent(botao7, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addComponent(botao8, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addComponent(botao9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoDiv, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(botao5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addComponent(botao6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addComponent(botao4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addComponent(botaoMenos, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(botao1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botao2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botao3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoMais, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(botao0, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoIgual, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {botao7, botao8, botao9});
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }

    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {
    	Calculadora calculadora = Calculadora.getInstancia();
    	calculadora.limpar();
        visorCalculador.setText("0");
        itMustClean = true;
    }

    private void botaoMaisMouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "+");
        itMustClean = false;
    }

    private void botaoMenosMouseClicked(java.awt.event.MouseEvent evt) {                                        
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "-");
        itMustClean = false;
    }
    
    private void botaoVezesMouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "*");
        itMustClean = false;
    }

    private void botaoDivMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "/");
        itMustClean = false;
    }

    private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        System.out.println(">>>"+valor);
        Calculadora calculadora = Calculadora.getInstancia();
        String resultado = calculadora.calcular(valor);
        visorCalculador.setText(resultado);
        String operacoes = calculadora.getOperacoesSalvas();
        visorOperacoes.setText(operacoes);
        itMustClean = true;
    }
    
    private void botaoDesfazerMouseClicked(java.awt.event.MouseEvent evt) {
        Calculadora calculadora = Calculadora.getInstancia();
        String resultado = calculadora.desfazerUltimaOperacao();
        visorCalculador.setText(resultado);
        System.out.println(">>>"+resultado);
        String operacoes = calculadora.getOperacoesSalvas();
        visorOperacoes.setText(operacoes);
        itMustClean = true;
    }
    
    private void botao0MouseClicked(java.awt.event.MouseEvent evt) {
    	concatenarValor("0");
    }
    
    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {
    	concatenarValor("1");
    }
    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {
    	concatenarValor("2");
    }

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {
    	concatenarValor("3");
    }

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	concatenarValor("4");
    }

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	concatenarValor("5");
    }

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	concatenarValor("6");
    }

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {
        concatenarValor("7");
    }

	private void botao8MouseClicked(java.awt.event.MouseEvent evt) {
		concatenarValor("8");
    }

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {
    	concatenarValor("9");
    }

    private void concatenarValor(String valor) {
    	String valorAtual = visorCalculador.getText();
    	if(valorAtual == "0" || itMustClean) {
    		visorCalculador.setText(valor);
    		Calculadora calculadora = Calculadora.getInstancia();
        	calculadora.limpar();
    		itMustClean = false;
    	}else {
    		visorCalculador.setText(valorAtual + valor);
    	}
	}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoVezes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane visorCalculador;
    private javax.swing.JTextPane visorOperacoes;
    private javax.swing.JButton botaoDesfazer;
}
