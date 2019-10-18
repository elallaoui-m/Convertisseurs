/**
 * cette classe est responsable de gestion des evenements de changement de text dans les 2 champs d'insertion
 * aussi que gerer le changement des unites dans les combobox responsable
 * car c'est le meme traitemet dans les deux cas
 * biensur il impliment des fonction des deux interface KeyListeneer pour les champs de text
 * et ActionListener pour le changemenet des cambobox
 *
 */

package converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextChangeHandler implements KeyListener, ActionListener {
    private JTextField theTf;
    private JTextField theOther;

    private JComboBox select;
    private JComboBox theCB;
    private JComboBox theOtherCB;

     static int count = 0;

    public TextChangeHandler(JTextField theTf, JTextField theOther,JComboBox select, JComboBox theCB, JComboBox theOtherCB) {
        this.theTf = theTf;
        this.theOther = theOther;
        this.theCB = theCB;
        this.theOtherCB = theOtherCB;
        this.select = select;
    }


    private void run_change()
    {
        double result = 0.0;
        if (theTf.getText().isEmpty())
        {
            theOther.setText("");
            return;
        }
        double valueFrom = Double.parseDouble(theTf.getText());
        String from = theCB.getSelectedItem().toString();
        String to = theOtherCB.getSelectedItem().toString();

        switch (select.getSelectedItem().toString())
        {
            case "Distance": result = DistanceConverter.convert(from,to,valueFrom); break;
            case  "Masse": result = MasseConverter.convert(from,to,valueFrom); break;
            case  "Temperature": result = TemperatureConverter.convert(from,to,valueFrom);  break;

        }

        theOther.setText(String.valueOf(result));
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        run_change();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        run_change();
    }

    /**
     * fonction qui effectue le changement
     * pour ne pas repeter le meme code dans les deux fonction on a creer un fontion separer on va l'appeler
     * a l'interieur des deux fontions implementees
     */

}
