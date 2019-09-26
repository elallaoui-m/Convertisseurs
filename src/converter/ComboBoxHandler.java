/**
 * cette classe est responsable du changement de contenu des 2 combobox from et to
 * en correspandance avec le combobox select.
 *
 * la classe change un nouveau contenu dans les deux combobox a chanque fois
 * le type de meseure selectionee a ete change
 *
 * */


package converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxHandler implements ActionListener {

    private JComboBox selectType;
    private JComboBox selectFrom;
    private JComboBox selectTo;


    public ComboBoxHandler(JComboBox selectType, JComboBox selectFrom, JComboBox selectTo) {
        this.selectType = selectType;
        this.selectFrom = selectFrom;
        this.selectTo = selectTo;
    }


    /**
     * Selcon la valeur selectionner ... cette methode change un arraylite a partir de la classe Unites
     * pour alimenter les combobox de selections des unites
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = (String) selectType.getSelectedItem();

        selectFrom.removeAllItems();
        selectTo.removeAllItems();

        switch (str)
        {
            case "Distance":
            {
               selectTo.setModel(new DefaultComboBoxModel(Unites.DISTANCE.toArray()));
               selectFrom.setModel(new DefaultComboBoxModel(Unites.DISTANCE.toArray()));
                break;
            }
            case "Masse":
            {
                selectTo.setModel(new DefaultComboBoxModel(Unites.MASSE.toArray()));
                selectFrom.setModel(new DefaultComboBoxModel(Unites.MASSE.toArray()));
                break;
            }
            case "Temperature":
            {
                selectTo.setModel(new DefaultComboBoxModel(Unites.TEMPERATURE.toArray()));
                selectFrom.setModel(new DefaultComboBoxModel(Unites.TEMPERATURE.toArray()));
                break;
            }

        }


    }
}
