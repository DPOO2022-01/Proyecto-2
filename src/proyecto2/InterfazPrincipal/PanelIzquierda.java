package proyecto2.InterfazPrincipal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelIzquierda extends JPanel implements ActionListener
{
   
    
    private JTextField txtEjemplo;
    
    
    public PanelIzquierda()
    {
    	setSize(200,600);
    	setLayout(new GridLayout(10,1));
    	setBorder( new TitledBorder( "Men� proyectos" ) );
    	/*
    	//elemento0
    	JLabel lbl0 = new JLabel("Men� proyectos");
        add (lbl0);
        */
    	//elemento1
        JButton btnSelecProye= new JButton( "Seleccionar proyecto" );
        add( btnSelecProye );
        //elemento #12
        //JLabel lbl0 = new JLabel("Item 1 ComboBox");
	    JComboBox<String> ch1=new JComboBox<String>();
	    ch1.addItem("Pry1");
	    ch1.addItem("Pry2");
	    ch1.addItem("Pry3");
	    ch1.addItem("Pry4");
	    ch1.addItem("Pry5");

	    add(ch1);
	    
	    /*
        //elemento #13
	    String[] lista= {"Pry1","Pry2","Pry3"};
	    JComboBox<String> ch2=new JComboBox<String>(lista);
	    add(ch2);
		*/
	    
	    
    	//elemento2
        JButton btnCrearProye= new JButton( "Crear proyecto" );
        add( btnCrearProye );
    	//elemento3 
        //JLabel lbl1 = new JLabel("");
        //add(lbl1);
    	//elemento4
        JLabel lbl2 = new JLabel("Men� participantes");
        add (lbl2);
    	//elemento5
        JButton btnA�adirPart= new JButton( "A�adir participante" );
        add( btnA�adirPart );
    	//elemento6
        JButton btnElimiPart= new JButton( "Eliminar participante" );
        add( btnElimiPart );
    	//elemento7
        JLabel lbl3 = new JLabel("");
        add (lbl3);
    	//elemento8
        JLabel lbl4 = new JLabel("Actividades: ");
        add (lbl4);
    	//elemento9
        JButton btnSelecCsv = new JButton("Cargar CSV con las actividades");
        add(btnSelecCsv);
    	//elemento10
        JLabel lbl5 =new JLabel("");
        add(lbl5);
        
    }


    @Override
    public void actionPerformed( ActionEvent e )
    {
        txtEjemplo.setText( "hola me llamo Germ�n" );
    }
    
}



/*
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelIzquierda extends JPanel{


	public PanelIzquierda() {
		setSize(230,700);
		setLayout( new BorderLayout( ) );
	    setBorder( new TitledBorder( "Informaci�n" ) );
	    //setLayout(new GridLayout(1,3)); //3 paneles
	    
	    JPanel panelProyectos= new JPanel();
	    JPanel panelCargarInfo= new JPanel();
	    JPanel panelActividades= new JPanel();
	    
	     comentado
	     
	    panelProyectos.setSize(120, 200);
	    panelCargarInfo.setSize(120, 200);
	    panelActividades.setSize(120, 200);
	    comentado
	    
	    add(panelProyectos,BorderLayout.CENTER);
	    add(panelCargarInfo,BorderLayout.SOUTH);
	    add(panelActividades,BorderLayout.NORTH);
	    
	    // PANEL PROYECTOS
	    panelProyectos.setLayout(new GridLayout(3,1));
	    panelProyectos.setBorder( new TitledBorder( "Men� proyectos" ));
	    
	    //elemento 1
	    comentado
	    JTextField txtEjemplo= new JTextField( "Seleccionar Proyecto" );
	    txtEjemplo.setSize(100, 80);
        txtEjemplo.setEditable( false );
        panelProyectos.add( txtEjemplo );
        //elemento 2
        JTextField txtEjemplo1= new JTextField( "Text en Combo Box" );
        txtEjemplo1.setEditable( false );
        //txtEjemplo1.setSize(100, 50);
	    JComboBox<JTextField> ch1=new JComboBox<JTextField>(); //opciones e inicializar como atributo de la clase panelIzquierda
	    ch1.addItem(txtEjemplo1);
	    ch1.setSize(100, 80);
	    panelProyectos.add(ch1);
        //elemento 3
	    JButton btn1 = new JButton("Crear Proyecto");
	    btn1.setSize(80, 50);
	    panelProyectos.add(btn1);
	    comentado
	    
	    //elemento1
	    JLabel lbl1= new JLabel("Texto 1");
	    panelProyectos.add(lbl1);
	    //elemento2

	    JLabel lbl2= new JLabel("Texto 1");
	    panelProyectos.add(lbl2);
	    //elemento3

	    JLabel lbl3= new JLabel("Texto 1");
	    panelProyectos.add(lbl3);
	    
	    
	    
        // PANEL ACTIVIDADES
	    panelActividades.setLayout(new GridLayout(2,1));
	    panelActividades.setBorder( new TitledBorder( "Men� participantes" ));
	    //elemento 1
	    
	    JButton btn2 = new JButton("A�adir Participante");
	    btn2.setSize(80, 50);
	    panelActividades.add(btn2);
	    //elemento 2
	    JButton btn3 = new JButton("Eliminar Participante");
	    btn3.setSize(80, 50);
	    panelActividades.add(btn3);
	    
	    // PANEL CARGAR INFO
	    panelCargarInfo.setLayout(new GridLayout(2,1));
	    panelCargarInfo.setBorder( new TitledBorder( "Actividades" ));
	    //elemento 1
	    
        JTextField txtEjemplo2= new JTextField( "Cargar csv con participantes" );
        txtEjemplo2.setEditable( false );
        txtEjemplo2.setSize(100, 50);
        panelCargarInfo.add( txtEjemplo2 );
        //elemento 2
        JTextField txtEjemplo3= new JTextField( "Inserte aqui su csv" );
        txtEjemplo3.setEditable( true );
        txtEjemplo3.setSize(100, 50);
        panelCargarInfo.add( txtEjemplo3 );
	}	
}
*/