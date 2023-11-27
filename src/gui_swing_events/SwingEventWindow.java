package gui_swing_events;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class SwingEventWindow extends JFrame implements ActionListener, ItemListener {

    int rdoChecked = 1;

    JPanel pnlMain = new JPanel();
    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JPanel pnl3 = new JPanel();
    JPanel pnl4 = new JPanel();
    JPanel pnl5 = new JPanel();
    JPanel pnl6 = new JPanel();

    JLabel lblMain = new JLabel("Excel Functions");

    JLabel lblRequest = new JLabel("Enter your numbers separated by spaces");

    JTextField txtNum = new JTextField(30);

    JRadioButton rdoAutoSum = new JRadioButton("Auto Sum", true);
    JRadioButton rdoAverage = new JRadioButton("Average");
    JRadioButton rdoMax = new JRadioButton("Maximum");
    JRadioButton rdoMin = new JRadioButton("Minimum");

    JButton btnCalc = new JButton("Calculate");

    JLabel lblResult = new JLabel("Result:");

    JTextField txtResult = new JTextField(15);

    ButtonGroup rdBtnGrp = new ButtonGroup();

    public SwingEventWindow() {
        super("GUI Swing Window");
        setTitle("GUI Swing Window");

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rdBtnGrp.add(rdoAutoSum);
        rdBtnGrp.add(rdoAverage);
        rdBtnGrp.add(rdoMax);
        rdBtnGrp.add(rdoMin);

        pnl1.add(lblMain);
        pnl2.add(lblRequest);
        pnl3.add(txtNum);
        pnl4.add(rdoAutoSum);
        pnl4.add(rdoAverage);
        pnl4.add(rdoMax);
        pnl4.add(rdoMin);
        pnl5.add(btnCalc);
        pnl6.add(lblResult);
        pnl6.add(txtResult);

        pnlMain.add(pnl1);
        pnlMain.add(pnl2);
        pnlMain.add(pnl3);
        pnlMain.add(pnl4);
        pnlMain.add(pnl5);
        pnlMain.add(pnl6);

        GridLayout layout = new GridLayout(6 ,1);

        pnlMain.setLayout(layout);

        getContentPane().add(pnlMain);

        btnCalc.addActionListener(this);
        rdoAutoSum.addItemListener(this);
        rdoAverage.addItemListener(this);
        rdoMax.addItemListener(this);
        rdoMin.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if (e.getItemSelectable() == rdoAutoSum) {
            rdoChecked = 1;
        } else if (e.getItemSelectable() == rdoAverage) {
            rdoChecked = 2;
        } else if (e.getItemSelectable() == rdoMax) {
            rdoChecked = 3;
        } else if (e.getItemSelectable() == rdoMin) {
            rdoChecked = 4;
        }
    }

     @Override
    public void actionPerformed(ActionEvent e){
        String StrNum = txtNum.getText();

        Excel excel = new Excel(StrNum);

        if (rdoChecked == 1) {
            txtResult.setText(String.valueOf(excel.FindTotal()));
        } else if (rdoChecked == 2) {
            txtResult.setText(String.valueOf(excel.FindAvg()));;
        } else if (rdoChecked == 3) {
            txtResult.setText(String.valueOf(excel.FindMax()));;
        } else if (rdoChecked == 4) {
            txtResult.setText(String.valueOf(excel.FindMin()));;
        }

    }
}