package objetos.jframe;

import javax.swing.SwingUtilities;

public class JFRame {
    
    public static void main(String[] args) {
        // Usa SwingUtilities.invokeLater para asegurar que la creación de la ventana se haga en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            // Crear y mostrar la ventana Ventana
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
            
        });
    }
}