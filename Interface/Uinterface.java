import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Uinterface extends JFrame 
{
    public JTextField champ_a = new JTextField(10);
    public JTextField champ_b = new JTextField(10);
    public JTextField champ_c = new JTextField(10);
    public JLabel message_user = new JLabel("résultat :");

//----------------------------------------------------------------------------
    //window propriety
    public Uinterface() 
    {
        super("Calcul d'équation de second degré");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        message_user.setHorizontalAlignment(SwingConstants.CENTER);
        add(message_user, BorderLayout.NORTH);

        //3 champs : a, b, c
        JPanel center = new JPanel(new GridLayout(3, 2, 6, 6));
        center.add(new JLabel("a :"));
        center.add(champ_a);
        center.add(new JLabel("b :"));
        center.add(champ_b);
        center.add(new JLabel("c :"));
        center.add(champ_c);
        add(center, BorderLayout.CENTER);

        //bouton action
        JButton btn = new JButton("Calculer");
        btn.addActionListener(this::Calculer_delta);
        JPanel south = new JPanel();
        south.add(btn);
        add(south, BorderLayout.SOUTH);

       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setVisible(true);

       // taille en petite
        //pack();
        //window au milieu
        //setLocationRelativeTo(null);
        //setVisible(true);

    }
//----------------------------------------------------------------------------

//FUNCTION
    //Function calculer operation delta secon degre
    public void Calculer_delta(ActionEvent e) 
    {
        try {
            double a = parseDouble(champ_a.getText());
            double b = parseDouble(champ_b.getText());
            double c = parseDouble(champ_c.getText());
            double s = Verification_delta(double delta);
            message_user.setText("Somme = " + s);
        } 
        catch (NumberFormatException ex) 
        {
            message_user.setText("Mauvaise saisi , saisir un nombre svp (ex. 12.5 ou 12,5)");
        }
    }

    // Function Parse text -> chiffre
    public static double parseDouble(String text) 
    {
        if (text == null) throw new NumberFormatException("null");
        String norm = text.trim().replace(',', '.');
        if (norm.isEmpty()) throw new NumberFormatException("null");
        return Double.parseDouble(norm);
    }

    // Function verification delta : conditon
    public static double Verification_delta(double delta) 
    {
        
    }

//======================================================
    //Main
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(Uinterface::new);
    }
}
