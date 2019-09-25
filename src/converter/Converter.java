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

        setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        this.setVisible(true);

        close = new JButton("close");

        from = new JTextField(25);
        to = new JTextField(25);

        selectType = new JComboBox();
        selectTo = new JComboBox();
        selectFrom = new JComboBox();

        selectType.addItem("select");
        selectTo.addItem("select");
        selectFrom.addItem("select");

        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();

        panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
        panelTop.add(selectType);
        //panelTop.add(close);

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

        panelTop.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
        panelLeft.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelRight.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(panelTop,BorderLayout.PAGE_START);
        add(panelRight,BorderLayout.LINE_END);
        add(panelLeft,BorderLayout.LINE_START);

        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
        Converter converter = new Converter();
    }
}
