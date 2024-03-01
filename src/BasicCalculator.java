import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator extends JFrame implements ActionListener {
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_add, btn_sub, btn_mul, btn_div, btn_root, btn_fact, btn_exp, btn_mod, btn_clear,btn_deci, btn_equal, btn_del;
    private JTextField txt_display;
    private Font f1, f2;
    private JPanel btn_panel;
    private String text = "";
    private int first_num, second_num, result=0;
    private double result_mean;
    private String operation = "";

    BasicCalculator() {
        setTitle("CSIT CALCULATOR");

        getContentPane().setBackground(Color.CYAN);

        f1 = new Font("Arial", Font.BOLD, 24 );
        f2 = new Font("Arial", Font.BOLD, 18 );

        setLayout(null);
        txt_display = new JTextField();
        txt_display.setBounds(10, 10, 450, 60);
        txt_display.setHorizontalAlignment(JTextField.RIGHT);
        txt_display.setFont(f1);
        txt_display.setForeground(Color.BLACK);
        txt_display.setBackground(Color.LIGHT_GRAY);
        add(txt_display);

        btn_panel = new JPanel();
        btn_panel.setBounds(10, 80, 450, 400);
        btn_panel.setLayout(new GridLayout(4,4, 4, 4));
        btn_panel.setBackground(Color.cyan);

        btn0 = new JButton("0");
        btn0.setFont(f2);
        btn0.setBackground(Color.WHITE);

        btn1 = new JButton("1");
        btn1.setFont(f2);
        btn1.setBackground(Color.WHITE);

        btn2 = new JButton("2");
        btn2.setFont(f2);
        btn2.setBackground(Color.WHITE);

        btn3 = new JButton("3");
        btn3.setFont(f2);
        btn3.setBackground(Color.WHITE);

        btn4 = new JButton("4");
        btn4.setFont(f2);
        btn4.setBackground(Color.WHITE);

        btn5 = new JButton("5");
        btn5.setFont(f2);
        btn5.setBackground(Color.WHITE);

        btn6 = new JButton("6");
        btn6.setFont(f2);
        btn6.setBackground(Color.WHITE);

        btn7 = new JButton("7");
        btn7.setFont(f2);
        btn7.setBackground(Color.WHITE);

        btn8 = new JButton("8");
        btn8.setFont(f2);
        btn8.setBackground(Color.WHITE);

        btn9 = new JButton("9");
        btn9.setFont(f2);
        btn9.setBackground(Color.WHITE);

        btn_deci = new JButton(".");
        btn_deci.setFont(f2);
        btn_deci.setBackground(Color.WHITE);

        btn_add = new JButton("+");
        btn_add.setFont(f2);
        btn_add.setBackground(Color.ORANGE);

        btn_sub = new JButton("-");
        btn_sub.setFont(f2);
        btn_sub.setBackground(Color.ORANGE);

        btn_mul = new JButton("*");
        btn_mul.setFont(f2);
        btn_mul.setBackground(Color.ORANGE);

        btn_div = new JButton("/");
        btn_div.setFont(f2);
        btn_div.setBackground(Color.ORANGE);

        btn_root = new JButton("√");
        btn_root.setFont(f2);
        btn_root.setBackground(Color.ORANGE);

        btn_fact = new JButton("!");
        btn_fact.setFont(f2);
        btn_fact.setBackground(Color.ORANGE);

        btn_exp = new JButton("e");
        btn_exp.setFont(f2);
        btn_exp.setBackground(Color.ORANGE);

        btn_mod = new JButton("%");
        btn_mod.setFont(f2);
        btn_mod.setBackground(Color.ORANGE);

        btn_equal = new JButton("=");
        btn_equal.setFont(f2);
        btn_equal.setBackground(Color.WHITE);

        btn_clear = new JButton("CLR");
        btn_clear.setFont(f2);
        btn_clear.setBackground(Color.PINK);

        btn_del = new JButton("DEL");
        btn_del.setFont(f2);
        btn_del.setBackground(Color.PINK);


        btn_panel.add(btn1);
        btn_panel.add(btn2);
        btn_panel.add(btn3);
        btn_panel.add(btn4);
        btn_panel.add(btn_clear);
        btn_panel.add(btn_del);

        btn_panel.add(btn5);
        btn_panel.add(btn6);
        btn_panel.add(btn7);
        btn_panel.add(btn8);
        btn_panel.add(btn_add);
        btn_panel.add(btn_sub);

        btn_panel.add(btn9);
        btn_panel.add(btn0);
        btn_panel.add(btn_deci);
        btn_panel.add(btn_equal);

        btn_panel.add(btn_mul);
        btn_panel.add(btn_div);
        btn_panel.add(btn_root);
        btn_panel.add(btn_fact);
        btn_panel.add(btn_exp);
        btn_panel.add(btn_mod);

        add(btn_panel);


        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn_deci.addActionListener(this);
        btn_add.addActionListener(this);
        btn_sub.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
        btn_root.addActionListener(this);
        btn_fact.addActionListener(this);
        btn_exp.addActionListener(this);
        btn_mod.addActionListener(this);
        btn_equal.addActionListener(this);
        btn_del.addActionListener(this);


        setSize(490, 530);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn0) {
            text = text + "0";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn1) {
            text = text + "1";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn2) {
            text = text + "2";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn3) {
            text = text + "3";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn4) {
            text = text + "4";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn5) {
            text = text + "5";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn6) {
            text = text + "6";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn7) {
            text = text + "7";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn8) {
            text = text + "8";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn9) {
            text = text + "9";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn_deci) {
            text = text + ".";
            txt_display.setText(text);
        }

        else if(e.getSource() == btn_add) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "+";
            text = "";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_sub) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "-";
            text="";
            txt_display.setText("");
        }
        else if (e.getSource() == btn_mul) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "*";
            text="";
            txt_display.setText("");
        }
        else if (e.getSource() == btn_div) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "/";
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_root) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "√";
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_fact) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "!";
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_exp) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "e";
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_mod) {
            first_num = Integer.parseInt(txt_display.getText());
            operation = "%";
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_clear) {
            text="";
            txt_display.setText("");
        }

        else if (e.getSource() == btn_del) {
            text = txt_display.getText();
            text = text.substring(0, text.length()-1);
            txt_display.setText(text);
        }

        else if (e.getSource() == btn_equal) {
            second_num = txt_display.getText().isEmpty() ? 0 : Integer.parseInt(txt_display.getText());
            switch (operation) {
                case "+" -> {
                    result = first_num + second_num;
                }
                case "-" -> {
                    result = first_num - second_num;
                }
                case "*" -> {
                    result = first_num * second_num;
                }
                case "/" -> {
                    result = first_num / second_num;
                }
                case "√" -> {
                    result = (int) Math.sqrt(first_num);
                }
                case "!" -> {
                    System.out.println(first_num);
                    int fact = 1;
                    for (int i = 1; i <= first_num; i++) {
                        fact = fact * i;
                    }
                    System.out.println(fact);
                    result = fact;
                }
                case "e" -> {
                    result = (int) Math.exp(first_num);
                }
                case "%" -> {
                    result = first_num % second_num;
                }
                default -> {
                }
            }

            txt_display.setText(String.valueOf(result));


        }

    }
}
