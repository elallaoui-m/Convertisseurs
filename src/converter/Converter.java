/**
 * classe prinicipale heritante de JFrame et contenante de la fonction pricipale main
 */
package converter;

import javax.swing.*;
import java.awt.*;


public class Converter extends JFrame {

    private  JTextField from;
    private  JTextField to;
    private JComboBox selectType;
    private JComboBox selectFrom;
    private JComboBox selectTo;
    private JButton close;

    public Converter()  {

        super("Converter");

        /**parametres  du frame*/
        setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true);
        this.setVisible(true);

        //initialisation des attributs
        close = new JButton("close");
        from = new JTextField(25);
        to = new JTextField(25);
        selectType = new JComboBox(Unites.Mesures);
        selectTo = new JComboBox();
        selectFrom = new JComboBox();

        //Ajout de l'action listener responsable de la gestion de changement des mesures volu
        //voir la classe 'ComboBoxHandler'
        selectType.addActionListener(new ComboBoxHandler(selectType,selectFrom,selectTo));


        /**
         * gestion des layout ... creation du graphic convenable
         *
         *
         */
        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();

        /**
         * X_AXIS pour l'orientaion horizontal des compsants ajoutes dans le BoxLayout
         *
         * https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
         */
        panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
        panelTop.add(selectType);
        //panelTop.add(close);


        /**
         * Y_AXIS pour l'orientaion Vertical des compsants ajoutes dans le BoxLayout
         *
         */
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        panelRight.add(selectTo);
        panelRight.add(Box.createRigidArea(new Dimension(0, 10)));
        panelRight.add(to);
        //panelRight.add(Box.createRigidArea(new Dimension(0, 10)));

        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        panelLeft.add(selectFrom);
        panelLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        panelLeft.add(from);
        //panelLeft.add(Box.createRigidArea(new Dimension(0, 10)));

        /**gestion des espaces*/
        panelTop.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
        panelLeft.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelRight.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(panelTop,BorderLayout.PAGE_START);
        add(panelRight,BorderLayout.LINE_END);
        add(panelLeft,BorderLayout.LINE_START);

        pack();
        //Center dans l'ecran
        setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
        Converter converter = new Converter();
    }
}
