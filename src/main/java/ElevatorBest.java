import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 * Created by ${DPudov} on 26.12.2015.
 */
public class ElevatorBest extends JFrame {
    public JButton button1;
    public JLabel lbl;
    public JLabel lbl1;
    public JLabel lbl2;
    public JLabel lbl3;
    public JLabel lbl4;
    public JPanel panel;


    public ElevatorBest() {
        super("BestElevatorEver");
        panel = new JPanel(new GridLayout());

        Elevator elev = new Elevator();
        Persons persons = new Persons();
        Outsider outsider = new Outsider();
        lbl = new JLabel("������ ������� ");
        lbl1 = new JLabel("� �� ����� " );
        lbl2 = new JLabel("����� ������ ");
        lbl3 = new JLabel("E�� �� ���� ");
        lbl4 = new JLabel("����������� ");

        JLabel lbl5 = new JLabel("����� ������� ");
        button1 = new JButton("NEXT TIME");
        add(panel);
        panel.add(lbl, BorderLayout.NORTH);
        panel.add(lbl1, BorderLayout.AFTER_LAST_LINE);
        panel.add(lbl2, BorderLayout.AFTER_LAST_LINE);
        panel.add(lbl3, BorderLayout.AFTER_LAST_LINE);
        panel.add(lbl4, BorderLayout.AFTER_LAST_LINE);
        panel.add(lbl5, BorderLayout.AFTER_LAST_LINE);
        panel.add(button1, BorderLayout.AFTER_LAST_LINE);
        persons.setParams();
        button1.addActionListener(e -> {
            elev.getParamsAndToGo();
            persons.toGetOut(elev, outsider);
            persons.toGetIn(elev, outsider);
            lbl.setText(new StringBuilder().append("������ ������� ").append(elev.t).toString());
            lbl1.setText(new StringBuilder().append("� �� ����� ").append(elev.pos).toString());
            lbl2.setText(new StringBuilder().append("����� ������ ").append(elev.InnerPers).toString());
            lbl3.setText(new StringBuilder().append("��� �� ���� ").append(elev.dirfl).toString());
            lbl4.setText(new StringBuilder().append("����������� ").append(elev.s1).toString());
            lbl5.setText(new StringBuilder().append("����� ������� ").append(outsider.cntofouts).toString());

        });


    }
}
