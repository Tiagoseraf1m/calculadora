import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Interface extends JFrame implements ActionListener {

    private JTextField campo;
    private Calculadora calc;
    private Double num1 = 0.0;
    private String operador = "";
    private boolean operadorClicado = false;

    public Interface() {
        calc = new Calculadora();

        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        campo = new JTextField();
        campo.setEditable(false);
        campo.setFont(new Font("Arial", Font.BOLD, 24));
        add(campo, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4));

        String[] botoes = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};

        for (String txt : botoes) {
            JButton botao = new JButton(txt);
            botao.setFont(new Font("Arial", Font.BOLD, 20));
            botao.addActionListener(this);
            painel.add(botao);
        }

        add(painel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            campo.setText(campo.getText() + cmd);
        } else if (cmd.equals("C")) {
            campo.setText("");
            num1 = 0.0;
            operador = "";
            operadorClicado = false;
        } else if (cmd.equals("=")) {
            if (campo.getText().isEmpty() || !operadorClicado) return;

            double num2 = Double.parseDouble(campo.getText());
            double resultado = 0;

            try {
                resultado = Calculadora.realizarCalculo(num1, num2, operador);
                campo.setText(String.valueOf(resultado));
            } catch (IllegalArgumentException ex) {
                campo.setText("Erro: " + ex.getMessage());
            }

            operador = "";
            operadorClicado = false;

        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {

            if (!campo.getText().isEmpty()) {
                num1 = Double.parseDouble(campo.getText());
                operador = cmd;
                operadorClicado = true;
                campo.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::new);
        }
    }
