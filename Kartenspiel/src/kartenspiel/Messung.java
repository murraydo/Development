/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Sanne
 */
public class Messung extends JPanel implements ActionListener,ChangeListener {

    private JPanel anzeige;
    private JPanel navigation;

    private JButton vor;
    private JButton zurueck;
    private JButton anfang;
    private JButton ende;
    
    private JButton sieben;

    private CardLayout cards;
    private JSlider[] schieber;

    //wegen Slider
    private TopFenster menuFenster;
    private JMenuItem[] slider;

    public Messung(TopFenster f) {
        //TopFenster test= new TopFenster();so nihct, das ist nicht das Fenster, das angezeigt wird
        this.setLayout(new BorderLayout(3, 3));
        this.menuFenster = f;
        slider = menuFenster.getSlider();
        System.out.println("...." + slider.length);
        bauenNav();
        bauenAnzeige();
        bauen();
    }

    private void bauenNav() {
        navigation = new JPanel();
        navigation.setLayout(new FlowLayout(FlowLayout.CENTER));
        vor = new JButton(">");
        zurueck = new JButton("<");
        anfang = new JButton("Anfang");
        ende = new JButton("Ende");
        sieben = new JButton("sieben");
        navigation.add(anfang);
        navigation.add(zurueck);
        navigation.add(sieben);
        navigation.add(vor);
        navigation.add(ende);
        
//Für die Aufgabe:
        for (int i = 0; i < slider.length; i++) {

            slider[i].addActionListener(this);
        }

        vor.addActionListener(this);
        zurueck.addActionListener(this);
        anfang.addActionListener(this);
        ende.addActionListener(this);
        sieben.addActionListener(ae->{
            cards.show(anzeige,"7");
        });
    }

    private void bauenAnzeige() {
        cards = new CardLayout();
        anzeige = new JPanel();
        anzeige.setLayout(cards);

        schieber = new JSlider[10];//Aufgabe: 10 Slider erzeugen

        schieber[0] = new JSlider(0, 30);
        schieber[0].setPaintLabels(true);
        schieber[0].setPaintTicks(true);
        schieber[0].setMinorTickSpacing(2);
        schieber[0].setMajorTickSpacing(10);

        //anzeige.add(schieber[0]);
        schieber[1] = new JSlider(-50, 50, 10);
        schieber[1].setPaintLabels(true);
        schieber[1].setPaintTicks(true);
        schieber[1].setMinorTickSpacing(5);
        schieber[1].setMajorTickSpacing(20);

        //anzeige.add(schieber[1]);
        schieber[2] = new JSlider(JSlider.VERTICAL, 1, 255, 5);
        schieber[2].setPaintLabels(true);
        schieber[2].setPaintTicks(true);
        schieber[2].setMinorTickSpacing(5);
        schieber[2].setMajorTickSpacing(25);

        //restlichen 7 Slider zufügen
        //Aufgabe:Zugriff auf ein bestimmten Slider
        //Auswählen über "anderer Kram"
        //Tip: JMenuItems erstellen (Schleife)
        //Referenz auf die JMenuBar im Messung Panel
        //Konstruktor?
        //JavaDoc: add-Methoden...
        //Zeit 45 Min
        //sonst Bescheid sagen! :-)
        //anzeige.add(schieber[2]);
        for (int i = 3; i < schieber.length; i++) {
            schieber[i] = new JSlider(0, 10, i);
            schieber[i].setPaintLabels(true);
            schieber[i].setPaintTicks(true);
            schieber[i].setMajorTickSpacing(1);
        }
        for(int i = 0; i < schieber.length; i++){
            anzeige.add(schieber[i],i+"");
            
        }
        schieber[2].addChangeListener(this); 

    }

    private void bauen() {
        this.add(navigation, BorderLayout.SOUTH);
        this.add(anzeige, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == anfang) {
            cards.first(anzeige);
        }
        if (ae.getSource() == ende) {
            cards.last(anzeige);
        }
        if (ae.getSource() == vor) {
            cards.next(anzeige);
        }
        if (ae.getSource() == zurueck) {
            cards.previous(anzeige);
        }
        for (int i = 0; i < slider.length; i++) {
            if (ae.getSource() == slider[i]) {
                System.out.println("Gewählt: " + ae.getActionCommand());
                cards.show(anzeige,i+"");
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent ce){
        JSlider quelle = (JSlider)ce.getSource();
        Color farbe = new Color(0,0,quelle.getValue());
        quelle.setBackground(farbe); 
    }
   
}
