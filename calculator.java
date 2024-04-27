import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo 
{
    private static double first;
    private static double second;
    private static double result;
    private static String answer;
    private static String operation;
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JAVA CALCULATOR APP");
        JButton button1 = new JButton("RESULT");
        JTextField textField = new JTextField(10);
        JPanel panel1 = new JPanel(new GridLayout(1,2));
        panel1.add(button1);
        panel1.add(textField);
        
        JPanel panel2 = new JPanel(new GridLayout(4,4));

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton plusbtn = new JButton("+");
        JButton btn5 = new JButton("4");
        JButton btn6 = new JButton("5");
        JButton btn7 = new JButton("6");
        JButton minusbtn = new JButton("-");
        JButton btn9 = new JButton("7");
        JButton btn10 = new JButton("8");
        JButton btn11 = new JButton("9");
        JButton multbtn = new JButton("*");
        JButton divbtn = new JButton("/");
        JButton btn14 = new JButton("0");
        JButton modbtn = new JButton("%");
        JButton eqlbtn = new JButton("=");

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(plusbtn);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(minusbtn);
        panel2.add(btn9);
        panel2.add(btn10);
        panel2.add(btn11);
        panel2.add(multbtn);
        panel2.add(divbtn);
        panel2.add(btn14);
        panel2.add(modbtn);
        panel2.add(eqlbtn);

        btn1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn1.getText();
                textField.setText(number);
            }    
        });

        btn2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn2.getText();
                textField.setText(number);
            }    
        });

        btn3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn3.getText();
                textField.setText(number);
            }    
        });

        btn5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn5.getText();
                textField.setText(number);
            }    
        });

        btn6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn6.getText();
                textField.setText(number);
            }    
        });

        btn7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn7.getText();
                textField.setText(number);
            }    
        });
        
        btn9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn9.getText();
                textField.setText(number);
            }    
        });

        btn10.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn10.getText();
                textField.setText(number);
            }    
        });

        btn11.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn11.getText();
                textField.setText(number);
            }    
        });

        btn14.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = textField.getText() + btn14.getText();
                textField.setText(number);
            }    
        });

        plusbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }    
        });

        minusbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }    
        });

        multbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }    
        });

        divbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }    
        });

        modbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }    
        });

        eqlbtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                second = Double.parseDouble(textField.getText());
                if(operation == "+")
                {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } 
                else if(operation == "-")
                {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } 
                else if(operation == "*")
                {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } 
                else if(operation == "/")
                {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } 
                else if(operation == "%")
                {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } 
            }    
        });

        JPanel panel3 = new JPanel(new GridLayout(1,1));
        JButton offButton = new JButton("OFF");
        panel3.add(offButton);

        offButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("");
            }    
        });

        f.add(panel1, BorderLayout.NORTH);
        f.add(panel2, BorderLayout.CENTER);
        f.add(panel3, BorderLayout.SOUTH);

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}