/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dulceria;

import static dulceria.Main.dulces;
import dulceria.clases.Dulce;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kledioz
 */
public class Opciones extends javax.swing.JFrame {

    Main main;

    public void actualizarEstadisticas() {
        int totalDisponibles = 0;
        int totalRegistrados = 0;
        int totalDulces = 0;
        int totalSalados = 0;
        int totalEnchilosos = 0;

        for (Dulce d : main.dulces) {
            totalDisponibles += d.getCantidad();
            totalRegistrados++;
            switch (d.getCategoria()) {
                case "Dulce":
                    totalDulces++;
                    break;
                case "Salado":
                    totalSalados++;
                    break;
                case "Enchiloso":
                    totalEnchilosos++;
                    break;
            }
        }
        
        

        estadistica1.setText("Productos Disponibles: " + totalDisponibles);
        estadistica4.setText("Productos registrados: " + totalRegistrados);
        estadistica2.setText("Productos Vendidos: " + main.productosComprados);
        estadistica3.setText("Ganancias: $" + new DecimalFormat("##.##").format(main.dineroGanado));
        estadistica5.setText("Dulces: " + totalDulces);
        estadistica6.setText("Salados: " + totalSalados);
        estadistica7.setText("Enchilosos: " + totalEnchilosos);
    }

    /**
     * Creates new form Opciones
     */
    public Opciones(Main main) {
        this.main = main;
        initComponents();
        actualizarEstadisticas();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int i = JOptionPane.showConfirmDialog(windowEvent.getComponent(), "Estas seguro de que deseas salir?");
                if (i == 0) {
                    System.exit(0);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_alta = new javax.swing.JButton();
        btn_actualizacion = new javax.swing.JButton();
        btn_baja = new javax.swing.JButton();
        btn_venta = new javax.swing.JButton();
        btn_inventario_categorias = new javax.swing.JButton();
        btn_inventario = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        trampaLOL = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_estadistica = new javax.swing.JLabel();
        estadistica1 = new javax.swing.JLabel();
        estadistica4 = new javax.swing.JLabel();
        estadistica2 = new javax.swing.JLabel();
        estadistica3 = new javax.swing.JLabel();
        jLabel666 = new javax.swing.JLabel();
        estadistica6 = new javax.swing.JLabel();
        estadistica7 = new javax.swing.JLabel();
        estadistica5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dulceria | Menu Principal");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(508, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_alta.setText("1° Alta de producto");
        btn_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alta);
        btn_alta.setBounds(20, 170, 143, 30);

        btn_actualizacion.setText("2° Actualización");
        btn_actualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizacion);
        btn_actualizacion.setBounds(340, 170, 143, 32);

        btn_baja.setText("3° Baja de producto");
        btn_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_baja);
        btn_baja.setBounds(20, 300, 143, 32);

        btn_venta.setText("4° Ventas");
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_venta);
        btn_venta.setBounds(340, 300, 140, 32);

        btn_inventario_categorias.setText("<html><center>5° Consulta por<br>categoria</center></html>");
        btn_inventario_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventario_categoriasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_inventario_categorias);
        btn_inventario_categorias.setBounds(20, 420, 140, 60);

        btn_inventario.setText("<html><center>6° Consulta por<br>articulo</center></html>");
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_inventario);
        btn_inventario.setBounds(340, 420, 140, 60);

        jButton7.setForeground(new java.awt.Color(51, 51, 55));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton7.setText("Salir");
        jButton7.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(200, 410, 110, 80);

        trampaLOL.setBackground(new java.awt.Color(255, 255, 255));
        trampaLOL.setText(":)");
        trampaLOL.setBorderPainted(false);
        trampaLOL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        trampaLOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trampaLOLActionPerformed(evt);
            }
        });
        getContentPane().add(trampaLOL);
        trampaLOL.setBounds(230, 0, 40, 40);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_estadistica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_estadistica.setText("Estadisticas");
        jPanel1.add(lbl_estadistica);

        estadistica1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        estadistica1.setText("Productos disponibles: 0");
        jPanel1.add(estadistica1);

        estadistica4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        estadistica4.setText("Productos registrados: 0");
        jPanel1.add(estadistica4);

        estadistica2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        estadistica2.setText("Productos vendidos: 0");
        jPanel1.add(estadistica2);

        estadistica3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        estadistica3.setText("Ganancias: $0.00");
        jPanel1.add(estadistica3);

        jLabel666.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel666.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel666.setText("Categorias");
        jPanel1.add(jLabel666);

        estadistica6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        estadistica6.setText("Salados: 0");
        jPanel1.add(estadistica6);

        estadistica7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        estadistica7.setText("Enchilosos: 0");
        jPanel1.add(estadistica7);

        estadistica5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        estadistica5.setText("Dulces: 0");
        jPanel1.add(estadistica5);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 170, 160, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ko.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dulce.png"))); // NOI18N
        jLabel10.setText("jLabel5");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 80, 80, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jLabel9.setText("jLabel5");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 80, 80, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jLabel8.setText("jLabel5");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 210, 80, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista2.png"))); // NOI18N
        jLabel7.setText("jLabel5");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 340, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 340, 80, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 220, 80, 70);

        jLabel1.setFont(new java.awt.Font("Century", 0, 60)); // NOI18N
        jLabel1.setText(" Menú ");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setMaximumSize(new java.awt.Dimension(232, 80));
        jLabel1.setMinimumSize(new java.awt.Dimension(232, 80));
        jLabel1.setPreferredSize(new java.awt.Dimension(232, 80));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 40, 240, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco perla.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaActionPerformed

        if (main.dulces.size() > 30) {
            JOptionPane.showMessageDialog(this, "No se puede registrar un producto nuevo\nSe ha excedido el limite de dulces", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Edicion nuevo = new Edicion(this, null);
        nuevo.setVisible(true);
        this.setEnabled(false);

    }//GEN-LAST:event_btn_altaActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        Inventario inv = new Inventario(this, false);
        inv.setVisible(true);
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_inventario_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventario_categoriasActionPerformed
        Inventario inv = new Inventario(this, true);
        inv.setVisible(true);
    }//GEN-LAST:event_btn_inventario_categoriasActionPerformed

    private void btn_actualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizacionActionPerformed

        Seleccionar sel = new Seleccionar(this);
        sel.setVisible(true);

    }//GEN-LAST:event_btn_actualizacionActionPerformed

    private void btn_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaActionPerformed
        Borrar bor = new Borrar(this);
        bor.setVisible(true);
    }//GEN-LAST:event_btn_bajaActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        Ventas ven = new Ventas(this);
        ven.setVisible(true);
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    public int randomCodigo() {
        return new Random().nextInt(9999) + 999;
    }

    public int randomCantidad() {
        return new Random().nextInt(19) + 1;
    }

    private void trampaLOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trampaLOLActionPerformed
        dulces.add(new Dulce(randomCodigo(), "Barra de chocolate", randomCantidad(), 10.13, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Paleta PintaAzul", randomCantidad(), 3.51, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Paleta Rockaleta", randomCantidad(), 5.13, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Paleta Rebanaditas", randomCantidad(), 4.51, "Salado"));
        dulces.add(new Dulce(randomCodigo(), "Paleta Vero Mango", randomCantidad(), 4.71, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Paleta Payaso", randomCantidad(), 8.99, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Bolitochas", randomCantidad(), 1.20, "Salado"));
        dulces.add(new Dulce(randomCodigo(), "Banderilla Tamarindo", randomCantidad(), 6.11, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Pelon Pelo Rico", randomCantidad(), 9.11, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Skwinkles", randomCantidad(), 13.13, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Sour Patch", randomCantidad(), 15.16, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Pulparindo", randomCantidad(), 9.60, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Lucas", randomCantidad(), 11.99, "Salado"));
        dulces.add(new Dulce(randomCodigo(), "Mazapan", randomCantidad(), 6, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Kit Kat", randomCantidad(), 14.55, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Chicle Bubbaloo", randomCantidad(), 1.50, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Chicle Trident", randomCantidad(), 0.50, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Chicle Orbit", randomCantidad(), 0.80, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Chicle Clorets", randomCantidad(), 0.90, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Halls Negros", randomCantidad(), 10.11, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Bubulubu", randomCantidad(), 9.60, "Dulce"));
        dulces.add(new Dulce(randomCodigo(), "Cacahuates", randomCantidad(), 14.50, "Salado"));
        dulces.add(new Dulce(randomCodigo(), "Tostitos", randomCantidad(), 15.20, "Salado"));
        dulces.add(new Dulce(randomCodigo(), "Takis", randomCantidad(), 15.30, "Enchiloso"));
        dulces.add(new Dulce(randomCodigo(), "Ruffles", randomCantidad(), 15.40, "Enchiloso"));
        trampaLOL.setVisible(false);
        JOptionPane.showMessageDialog(this, "Agregue 25 productos jaja");
        actualizarEstadisticas();
    }//GEN-LAST:event_trampaLOLActionPerformed
@Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/opciones.png"));


        return retValue;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizacion;
    private javax.swing.JButton btn_alta;
    private javax.swing.JButton btn_baja;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_inventario_categorias;
    private javax.swing.JButton btn_venta;
    private javax.swing.JLabel estadistica1;
    private javax.swing.JLabel estadistica2;
    private javax.swing.JLabel estadistica3;
    private javax.swing.JLabel estadistica4;
    private javax.swing.JLabel estadistica5;
    private javax.swing.JLabel estadistica6;
    private javax.swing.JLabel estadistica7;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel666;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_estadistica;
    private javax.swing.JButton trampaLOL;
    // End of variables declaration//GEN-END:variables
}