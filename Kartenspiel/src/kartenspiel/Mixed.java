/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Sanne
 */
public class Mixed extends JPanel {
    private JTextField userName = new JTextField(10);
    private JPasswordField passwort = new JPasswordField(10);
    private JFormattedTextField datum = new JFormattedTextField(LocalDate.now());
    private JRadioButton maennlich= new JRadioButton("Herr");
    private JRadioButton weiblich = new JRadioButton("Frau");
    private ButtonGroup anrede = new ButtonGroup();
    private String[] eintraege ={"Hund","Katze","Maus"};
    private JComboBox<String> dropdown= new JComboBox<>(eintraege);
    
    public Mixed(){
        bauen();
    }
    private void bauen(){
        //nur zum Zusamenfügen der beiden Anreden, nicht zum Anzeigen!
        anrede.add(maennlich);
        anrede.add(weiblich);
        
        this.add(userName);
        this.add(passwort);
        this.add(datum);
        this.add(maennlich);
        this.add(weiblich);
        this.add(dropdown);
        Object geschlecht=anrede.getSelection();
        passwort.addActionListener(ae->{
            char[] pass = passwort.getPassword();
            for(int i = 0; i< pass.length;i++){
                System.out.print(" "+ pass[i]);
            }
        });
        
    }
}
