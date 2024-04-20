
package CEstadistica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author LOBATON ABREGU JHILMAR JAISON    
 */
public class CEstadistica extends javax.swing.JFrame {

    //se crea el objeto
    Estadistica obJEstadistica = new Estadistica();
    
    
    public CEstadistica() {
       /**
        * Constuctor de la aplicación
        */
       
        initComponents();
        formulario();
        valoresIniciales();
    }

    /**
     * método formulario 
     * @param no tiene parametros
    */
    
    private void formulario(){
        this.setTitle("ESTADÍSTICA"); //titulo de la ventana
        this.setLocationRelativeTo(this); //aparece la ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.getContentPane().setBackground(new Color(255,255,255));//color del formulario
        this.ptitulo.setBackground(new Color(255,255,255));
        this.pbotones.setBackground(new Color(255,255,255));
        this.pentrada.setBackground(new Color(255,255,255));
        this.psalida.setBackground(new Color(255,255,255));
    }
    
    /**
     * método valores iniciales
     * @param no tiene parametros
    */
    public void valoresIniciales(){
        this.txtElementos.requestFocus(); //para q inicie en la primera casilla, se activa el cursor.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pGrafica = new javax.swing.JPanel();
        ptitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pbotones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGrafico = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pentrada = new javax.swing.JPanel();
        txtElementos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        psalida = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pGraficaLayout = new javax.swing.GroupLayout(pGrafica);
        pGrafica.setLayout(pGraficaLayout);
        pGraficaLayout.setHorizontalGroup(
            pGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pGraficaLayout.setVerticalGroup(
            pGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROCESO ESTADÍSTICO");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout ptituloLayout = new javax.swing.GroupLayout(ptitulo);
        ptitulo.setLayout(ptituloLayout);
        ptituloLayout.setHorizontalGroup(
            ptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        ptituloLayout.setVerticalGroup(
            ptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCalcular.setBackground(new java.awt.Color(0, 51, 204));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 204, 0));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrafico.setBackground(new java.awt.Color(255, 153, 0));
        btnGrafico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGrafico.setForeground(new java.awt.Color(255, 255, 255));
        btnGrafico.setText("Gráfico");
        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 40, 32));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pbotonesLayout = new javax.swing.GroupLayout(pbotones);
        pbotones.setLayout(pbotonesLayout);
        pbotonesLayout.setHorizontalGroup(
            pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotonesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        pbotonesLayout.setVerticalGroup(
            pbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCalcular)
                .addGap(33, 33, 33)
                .addComponent(btnNuevo)
                .addGap(35, 35, 35)
                .addComponent(btnGrafico)
                .addGap(33, 33, 33)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtElementos.setBackground(new java.awt.Color(51, 51, 51));
        txtElementos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtElementos.setForeground(new java.awt.Color(255, 255, 255));
        txtElementos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtElementos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtElementosKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Ingrese la cantidad de elementos");

        javax.swing.GroupLayout pentradaLayout = new javax.swing.GroupLayout(pentrada);
        pentrada.setLayout(pentradaLayout);
        pentradaLayout.setHorizontalGroup(
            pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pentradaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pentradaLayout.setVerticalGroup(
            pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pentradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("LOS RESULTADOS SON");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout psalidaLayout = new javax.swing.GroupLayout(psalida);
        psalida.setLayout(psalidaLayout);
        psalidaLayout.setHorizontalGroup(
            psalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psalidaLayout.createSequentialGroup()
                .addGroup(psalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(psalidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(psalidaLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        psalidaLayout.setVerticalGroup(
            psalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(psalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * método capturar de la cantidad de elementos
     * @param no tiene parametros
     * @return cantidadElementos
    */
    private int leerCantidadElementos(){
        int cantidadElementos = Integer.parseInt(txtElementos.getText());
        return cantidadElementos;
    }
    
    private float[] numeros; // Declarar el arreglo como un atributo de la clase
    
    /**
     * método para llenar el vector con los números ingresados por teclado
     * @param cantidad de elementos
     * @return cantidadElementos
    */
    private float[] llenarArreglo(int cantidadElementos) {
    float[] numeros = new float[cantidadElementos]; // Crear el arreglo con la cantidad de elementos especificada
        for (int i = 0; i < cantidadElementos; i++) {
            String numStr = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Float.parseFloat(numStr);
        }
        return numeros; // Retornar el arreglo lleno
    }
    
    //metodo para mostrar el resultado
    private void mostrar() {
        
        this.txtResultado.setText("LOS NÚMEROS INGRESADOS SON: "+"\t \n");
        this.txtResultado.append("\t \n");
        for (float num : numeros) {
            this.txtResultado.append(String.valueOf(num) + "  ");
        }
        this.txtResultado.append("\n");
        this.txtResultado.append("\t \n");
        this.txtResultado.append("La media aritmética es:  "+ String.valueOf(obJEstadistica.media(numeros))+"\t \n");
        this.txtResultado.append("La mediana es:  "+ String.valueOf(obJEstadistica.mediana(numeros))+"\t \n");
        this.txtResultado.append("La moda es:  "+ String.valueOf(obJEstadistica.moda(numeros))+"\t \n");
        this.txtResultado.append("La desviación estándar es:  "+ String.valueOf(obJEstadistica.desviacionEstandar(numeros, obJEstadistica.media(numeros))));
    }
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Obtener la cantidad de elementos ingresados
        leerCantidadElementos();
        // Llenar el arreglo con los números
        numeros = llenarArreglo(leerCantidadElementos());
        // Calcular la media, mediana, moda y desviación estándar
        mostrar();
       
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtElementos.setText("");
        this.txtResultado.setText("");
        this.txtElementos.requestFocus();
        // Limpiar el panel de gráficos
        pGrafica.removeAll();
        // Volver a validar la disposición del panel
        pGrafica.revalidate();
        // Repintar el panel para que la eliminación sea visible
        pGrafica.repaint();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed
        
        // Crear un HashMap para almacenar la frecuencia de cada número
        HashMap<Float, Integer> frecuenciaNumeros = new HashMap<>();

        // Calcular la frecuencia de cada número
        for (float num : numeros) {
            if (frecuenciaNumeros.containsKey(num)) {
                frecuenciaNumeros.put(num, frecuenciaNumeros.get(num) + 1);
            } else {
                frecuenciaNumeros.put(num, 1);
            }
        }

        // Crear un conjunto de datos para el gráfico de barras
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        // Agregar las frecuencias al conjunto de datos
        for (Map.Entry<Float, Integer> entry : frecuenciaNumeros.entrySet()) {
            datos.addValue(entry.getValue(), "Frecuencia", String.valueOf(entry.getKey()));
        }

        // Crear el gráfico de barras con los datos de frecuencia
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Gráfico de Frecuencia", "Número", "Frecuencia", datos, PlotOrientation.VERTICAL, true, true, false);
        
        // Creamos un panel de gráfico con el gráfico creado
        ChartPanel panel = new ChartPanel(grafico_barras);
        
        panel.setMouseWheelEnabled(true);
        // Establecemos las dimensiones preferidas del panel de gráfico como el ancho y alto del panel pGrafica
        panel.setPreferredSize(new Dimension(400, 200));

        pGrafica.setLayout(new BorderLayout());

        // Añadimos el panel de gráfico al panel pGrafica
        pGrafica.add(panel,BorderLayout.NORTH);
        pack();
        repaint();

    }//GEN-LAST:event_btnGraficoActionPerformed
    
    /**
     * Metodo que cierra el formulario al hacer clic en el boton salir
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       int resp = JOptionPane.showOptionDialog(this,"Estas seguro de salir...", "Salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
                    new Object[]{"Si","No"}, "Si");
        if(resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtElementosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElementosKeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtElementosKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEstadistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGrafico;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pGrafica;
    private javax.swing.JPanel pbotones;
    private javax.swing.JPanel pentrada;
    private javax.swing.JPanel psalida;
    private javax.swing.JPanel ptitulo;
    private javax.swing.JTextField txtElementos;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
