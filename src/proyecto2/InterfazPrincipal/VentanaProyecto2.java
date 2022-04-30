package proyecto2.InterfazPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class VentanaProyecto2 extends JFrame
{
	private PanelArriba panelArriba;
	private PanelIzquierda panelIzquierda;
	private PanelCentro panelCentro;
	private PanelDerecha panelDerecha;
	
	public VentanaProyecto2()
	{
		setSize( 700, 700 );//700,500
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setTitle( "Administrador de proyectos " );
        
        panelArriba = new PanelArriba();
        panelArriba.setBackground(Color.cyan);
        add(panelArriba, BorderLayout.NORTH);
        
        panelIzquierda = new PanelIzquierda();
        add(panelIzquierda, BorderLayout.WEST);
        
        panelCentro = new PanelCentro();
        add(panelCentro, BorderLayout.CENTER);
        
        panelDerecha = new PanelDerecha();
        add(panelDerecha, BorderLayout.EAST);
	}
	
	
	
	
	public static void main (String[] args)
    {
		VentanaProyecto2  ventana = new  VentanaProyecto2( );
        ventana.setVisible( true );
    }
}
