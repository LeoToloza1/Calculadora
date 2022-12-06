/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/** LINK AL VIDEO ORIGINAL DE LA CALCULADORA
https://www.youtube.com/watch?v=GqL_sI633f0&list=WL&index=45
 */
public class Calculadora extends javax.swing.JFrame {
    private String cadenaNumero = "";
    private String operacion = "nula";
    private double num1 , resultado ;
    private boolean activado = true;
    private boolean punto = true;
    
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setTitle("Calculadora"); //setear el titulo de la aplicacion
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/calculadora.png")); //buscar icono en los recursos
        this.setIconImage(icono); //setear el icono
        setLocationRelativeTo(null); //darle posicion nula a la ventana - abre en el medio de la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        botonNegativo = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaNumero = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(310, 464));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(310, 464));
        jPanel1.setPreferredSize(new java.awt.Dimension(310, 464));

        panel.setMaximumSize(new java.awt.Dimension(310, 323));
        panel.setLayout(new java.awt.GridLayout(5, 4));

        botonC.setBackground(new java.awt.Color(255, 255, 255));
        botonC.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonC.setForeground(new java.awt.Color(0, 0, 0));
        botonC.setText("C");
        panel.add(botonC);

        botonRaiz.setBackground(new java.awt.Color(255, 255, 255));
        botonRaiz.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonRaiz.setForeground(new java.awt.Color(0, 0, 0));
        botonRaiz.setText("√");
        panel.add(botonRaiz);

        botonDivision.setBackground(new java.awt.Color(255, 255, 255));
        botonDivision.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(0, 0, 0));
        botonDivision.setText("÷");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        panel.add(botonDivision);

        botonCE.setBackground(new java.awt.Color(255, 255, 255));
        botonCE.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonCE.setForeground(new java.awt.Color(0, 0, 0));
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        panel.add(botonCE);

        botonSiete.setBackground(new java.awt.Color(255, 255, 255));
        botonSiete.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonSiete.setForeground(new java.awt.Color(0, 0, 0));
        botonSiete.setText("7");
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        panel.add(botonSiete);

        botonOcho.setBackground(new java.awt.Color(255, 255, 255));
        botonOcho.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonOcho.setForeground(new java.awt.Color(0, 0, 0));
        botonOcho.setText("8");
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        panel.add(botonOcho);

        botonNueve.setBackground(new java.awt.Color(255, 255, 255));
        botonNueve.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonNueve.setForeground(new java.awt.Color(0, 0, 0));
        botonNueve.setText("9");
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });
        panel.add(botonNueve);

        botonMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        botonMultiplicar.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        panel.add(botonMultiplicar);

        botonCuatro.setBackground(new java.awt.Color(255, 255, 255));
        botonCuatro.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonCuatro.setForeground(new java.awt.Color(0, 0, 0));
        botonCuatro.setText("4");
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        panel.add(botonCuatro);

        botonCinco.setBackground(new java.awt.Color(255, 255, 255));
        botonCinco.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonCinco.setForeground(new java.awt.Color(0, 0, 0));
        botonCinco.setText("5");
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        panel.add(botonCinco);

        botonSeis.setBackground(new java.awt.Color(255, 255, 255));
        botonSeis.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonSeis.setForeground(new java.awt.Color(0, 0, 0));
        botonSeis.setText("6");
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        panel.add(botonSeis);

        botonMenos.setBackground(new java.awt.Color(255, 255, 255));
        botonMenos.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonMenos.setForeground(new java.awt.Color(0, 0, 0));
        botonMenos.setText("-");
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });
        panel.add(botonMenos);

        botonUno.setBackground(new java.awt.Color(255, 255, 255));
        botonUno.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonUno.setForeground(new java.awt.Color(0, 0, 0));
        botonUno.setText("1");
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        panel.add(botonUno);

        botonDos.setBackground(new java.awt.Color(255, 255, 255));
        botonDos.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonDos.setForeground(new java.awt.Color(0, 0, 0));
        botonDos.setText("2");
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        panel.add(botonDos);

        botonTres.setBackground(new java.awt.Color(255, 255, 255));
        botonTres.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonTres.setForeground(new java.awt.Color(0, 0, 0));
        botonTres.setText("3");
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        panel.add(botonTres);

        botonMas.setBackground(new java.awt.Color(255, 255, 255));
        botonMas.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonMas.setForeground(new java.awt.Color(0, 0, 0));
        botonMas.setText("+");
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });
        panel.add(botonMas);

        botonNegativo.setBackground(new java.awt.Color(255, 255, 255));
        botonNegativo.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonNegativo.setForeground(new java.awt.Color(0, 0, 0));
        botonNegativo.setText("+/-");
        panel.add(botonNegativo);

        botonCero.setBackground(new java.awt.Color(255, 255, 255));
        botonCero.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonCero.setForeground(new java.awt.Color(0, 0, 0));
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        panel.add(botonCero);

        botonPunto.setBackground(new java.awt.Color(255, 255, 255));
        botonPunto.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(0, 0, 0));
        botonPunto.setText(".");
        panel.add(botonPunto);

        botonIgual.setBackground(new java.awt.Color(255, 255, 255));
        botonIgual.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(0, 0, 0));
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        panel.add(botonIgual);

        etiquetaNumero.setFont(new java.awt.Font("Corbel Light", 1, 48)); // NOI18N
        etiquetaNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumero.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaMuestra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        // boton para volver al numero cero
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
       //boton uno
        if (etiquetaNumero.getText().equals("0")) { //condicional para consultar si el numero que esta puesto es cero
            cadenaNumero = "1";
        } else {
            cadenaNumero += "1";
        }
        etiquetaNumero.setText(cadenaNumero); //setar el nuevo numero en la etiqueta de operaciones
        activado = true; // controlador de boton para que no repita la operacion
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        //boton dos
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "2";
        } else {
            cadenaNumero += "2";
        }
        etiquetaNumero.setText(cadenaNumero);
        activado = true;        
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
            //boton tres
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "3";
        }else cadenaNumero += "3";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;  
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        //boton cuatro
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "4";
        } else {
            cadenaNumero += "4";
        }
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
            //boton cinco
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "5";
        }else cadenaNumero += "5";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;  
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
       //boton seis
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "6";
        }else cadenaNumero += "6";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
           //boton siete
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "7";
        }else cadenaNumero += "7";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
          //boton ocho
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "8";
        }else cadenaNumero += "8";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
            //boton nueve
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "9";
        }else cadenaNumero += "9";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        //boton cero     
        if (etiquetaNumero.getText().equals("0")) {
            cadenaNumero = "0";
        }else cadenaNumero += "0";
        etiquetaNumero.setText(cadenaNumero);
        activado = true;
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        //boton de multiplicacion
          if (activado == true) {
            num1 = Double.parseDouble(cadenaNumero); //parsear a double
            etiquetaMuestra.setText(cadenaNumero + " X "); //concatenar un + al numero mostrado
            cadenaNumero = ""; // la cadena de numeros vuelve a nada
            operacion = "multiplicar";
            activado = false; // puede volver a repetir la operacion
          }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
       //boton de suma
        if (activado == true) {
            num1 = Double.parseDouble(cadenaNumero); //parsear a double
            etiquetaMuestra.setText(cadenaNumero + " + "); //concatenar un + al numero mostrado
            cadenaNumero = ""; // la cadena de numeros vuelve a nada
            operacion = "sumar";
            activado = false; // puede volver a repetir la operacion
        }
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
      //boton igual
        double num2;
        if (operacion.equals("sumar")) {
            num2 = Double.parseDouble(cadenaNumero);
            resultado = num1 + num2;
            etiquetaNumero.setText(String.format("% .2f", resultado));
            cadenaNumero = String.valueOf(resultado);
            operacion = "nula";
        }
        etiquetaMuestra.setText("");
        activado = true;
        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
          if (activado == true) {
            num1 = Double.parseDouble(cadenaNumero); //parsear a double
            etiquetaMuestra.setText(cadenaNumero + " - "); //concatenar un + al numero mostrado
            cadenaNumero = ""; // la cadena de numeros vuelve a nada
            operacion = "restar";
            activado = false; // puede volver a repetir la operacion
        }
    }//GEN-LAST:event_botonMenosActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
          if (activado == true) {
            num1 = Double.parseDouble(cadenaNumero); //parsear a double
            etiquetaMuestra.setText(cadenaNumero + " ÷ "); //concatenar un + al numero mostrado
            cadenaNumero = ""; // la cadena de numeros vuelve a nada
            operacion = "dividir";
            activado = false; // puede volver a repetir la operacion
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel"); //selecion de tema de libreria JTatoo
        // https://malalanayake.wordpress.com/2012/10/16/java-themes-with-jtattoo/ link con los diseños disponibles
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonNegativo;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
