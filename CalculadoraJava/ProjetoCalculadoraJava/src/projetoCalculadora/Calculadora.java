
package projetoCalculadora;

import jdk.jfr.Event;

public class Calculadora extends javax.swing.JFrame {

    Double valor1, valor2;
    String operacao;
    
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        Virgula = new javax.swing.JButton();
        Numero0 = new javax.swing.JButton();
        Subtracao = new javax.swing.JButton();
        Numero2 = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        Numero1 = new javax.swing.JButton();
        Numero9 = new javax.swing.JButton();
        Adicao = new javax.swing.JButton();
        Numero4 = new javax.swing.JButton();
        Numero5 = new javax.swing.JButton();
        Numero3 = new javax.swing.JButton();
        Numero7 = new javax.swing.JButton();
        Numero8 = new javax.swing.JButton();
        Numero6 = new javax.swing.JButton();
        Divisão = new javax.swing.JButton();
        Resultado = new javax.swing.JButton();
        LimpaTela = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        textTela = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");

        painel.setBackground(new java.awt.Color(204, 204, 255));
        painel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 0, 204), new java.awt.Color(102, 0, 204)));

        Virgula.setBackground(new java.awt.Color(153, 153, 255));
        Virgula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Virgula.setText(",");
        Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VirgulaActionPerformed(evt);
            }
        });

        Numero0.setBackground(new java.awt.Color(153, 153, 255));
        Numero0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero0.setText("0");
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });

        Subtracao.setBackground(new java.awt.Color(153, 153, 255));
        Subtracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Subtracao.setText("-");
        Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtracaoActionPerformed(evt);
            }
        });

        Numero2.setBackground(new java.awt.Color(153, 153, 255));
        Numero2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero2.setText("2");
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(153, 153, 255));
        Apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Apagar.setText("C");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Numero1.setBackground(new java.awt.Color(153, 153, 255));
        Numero1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero1.setText("1");
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });

        Numero9.setBackground(new java.awt.Color(153, 153, 255));
        Numero9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero9.setText("9");
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });

        Adicao.setBackground(new java.awt.Color(153, 153, 255));
        Adicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Adicao.setText("+");
        Adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicaoActionPerformed(evt);
            }
        });

        Numero4.setBackground(new java.awt.Color(153, 153, 255));
        Numero4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero4.setText("4");
        Numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero4ActionPerformed(evt);
            }
        });

        Numero5.setBackground(new java.awt.Color(153, 153, 255));
        Numero5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero5.setText("5");
        Numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero5ActionPerformed(evt);
            }
        });

        Numero3.setBackground(new java.awt.Color(153, 153, 255));
        Numero3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero3.setText("3");
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });

        Numero7.setBackground(new java.awt.Color(153, 153, 255));
        Numero7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero7.setText("7");
        Numero7.setBorder(null);
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });

        Numero8.setBackground(new java.awt.Color(153, 153, 255));
        Numero8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero8.setText("8");
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });

        Numero6.setBackground(new java.awt.Color(153, 153, 255));
        Numero6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Numero6.setText("6");
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });

        Divisão.setBackground(new java.awt.Color(153, 153, 255));
        Divisão.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Divisão.setText("/");
        Divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisãoActionPerformed(evt);
            }
        });

        Resultado.setBackground(new java.awt.Color(102, 102, 255));
        Resultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Resultado.setText("=");
        Resultado.setBorder(null);
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        LimpaTela.setBackground(new java.awt.Color(153, 153, 255));
        LimpaTela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LimpaTela.setText("CE");
        LimpaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpaTelaActionPerformed(evt);
            }
        });

        Multiplicacao.setBackground(new java.awt.Color(153, 153, 255));
        Multiplicacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Multiplicacao.setText("*");
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });

        textTela.setEditable(false);
        textTela.setBackground(new java.awt.Color(227, 230, 255));
        textTela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textTela.setText("0,0");
        textTela.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTela)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Numero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Numero2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Numero9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(Divisão, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textTela, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(Numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Divisão, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Adicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void digita(String caractere){
        if (textTela.getText().equals("0,0")){
            textTela.setText(caractere);
       }else{
            if (caractere.equals(",") && textTela.getText().contains(",")){
                
            }else{
                textTela.setText(textTela.getText().concat(caractere));
            }
        }
    }
    
    private void limpa(){
        textTela.setText("0,0");
    } 
    
    private void Numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero0ActionPerformed
        
        digita("0"); 
    }//GEN-LAST:event_Numero0ActionPerformed
    
    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
      
        digita("1");
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
      
        digita("2");
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
       
        digita("3");
    }//GEN-LAST:event_Numero3ActionPerformed

    private void Numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero4ActionPerformed
        
        digita("4");
    }//GEN-LAST:event_Numero4ActionPerformed

    private void Numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero5ActionPerformed
       
        digita("5");
    }//GEN-LAST:event_Numero5ActionPerformed

    private void Numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero6ActionPerformed
       
        digita("6");
    }//GEN-LAST:event_Numero6ActionPerformed

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
        
        digita("7");
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero8ActionPerformed
       
        digita("8");
    }//GEN-LAST:event_Numero8ActionPerformed

    private void Numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero9ActionPerformed
        
        digita("9");
    }//GEN-LAST:event_Numero9ActionPerformed

    private void VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VirgulaActionPerformed
        
        digita(",");
    }//GEN-LAST:event_VirgulaActionPerformed

    private void LimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpaTelaActionPerformed
        
        limpa();
    }//GEN-LAST:event_LimpaTelaActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
       
        int length = textTela.getText().length();
        int number = textTela.getText().length() - 1;
        String store;
        
        if (length > 0){
            StringBuilder back = new StringBuilder(textTela.getText());
            back.deleteCharAt(number);
            store = back.toString();
            textTela.setText(store);
        }
    }//GEN-LAST:event_ApagarActionPerformed

    private void AdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicaoActionPerformed
        
        valor1 = Double.parseDouble(textTela.getText());
        textTela.setText("");
        operacao = "soma";
    }//GEN-LAST:event_AdicaoActionPerformed

    private void SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtracaoActionPerformed
        
        valor1 = Double.parseDouble(textTela.getText());
        textTela.setText("");
        operacao = "subtracao";        
    }//GEN-LAST:event_SubtracaoActionPerformed

    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
        
        valor1 = Double.parseDouble(textTela.getText());
        textTela.setText("");
        operacao = "multiplicacao";          
    }//GEN-LAST:event_MultiplicacaoActionPerformed

    private void DivisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisãoActionPerformed
      
        valor1 = Double.parseDouble(textTela.getText());
        textTela.setText("");
        operacao = "divisao";             
    }//GEN-LAST:event_DivisãoActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        
        valor2 = Double.parseDouble(textTela.getText());
        
        if (operacao == "soma"){
            textTela.setText(String.valueOf(valor1 + valor2));
        }
        
        if (operacao == "subtracao"){
            textTela.setText(String.valueOf(valor1 - valor2)); 
        }

        if (operacao == "multiplicacao"){
            textTela.setText(String.valueOf(valor1 * valor2)); 
        }                
        
        if (operacao == "divisao"){
            if (valor2 == 0){
                textTela.setText("Não é possível dividir por 0");
            }else{
                textTela.setText(String.valueOf(valor1 / valor2)); 
            } 
        }   
    }//GEN-LAST:event_ResultadoActionPerformed
      
    
    
    
       
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicao;
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Divisão;
    private javax.swing.JButton LimpaTela;
    private javax.swing.JButton Multiplicacao;
    private javax.swing.JButton Numero0;
    private javax.swing.JButton Numero1;
    private javax.swing.JButton Numero2;
    private javax.swing.JButton Numero3;
    private javax.swing.JButton Numero4;
    private javax.swing.JButton Numero5;
    private javax.swing.JButton Numero6;
    private javax.swing.JButton Numero7;
    private javax.swing.JButton Numero8;
    private javax.swing.JButton Numero9;
    private javax.swing.JButton Resultado;
    private javax.swing.JButton Subtracao;
    private javax.swing.JButton Virgula;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField textTela;
    // End of variables declaration//GEN-END:variables
}
