import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator extends JFrame
{
    private int a=0;
    private String p ;
    private String s="";
    public calculator(){
        setTitle("SAKET'S CALCULATOR");
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five= new JButton("5");
        JButton six= new JButton("6");
        JButton seven = new JButton("7");
        JButton eight= new JButton("8");
        JButton nine= new JButton("9");
        JButton add= new JButton("+");
        JButton minus= new JButton("-");
        JButton multiply= new JButton("*");
        JButton divide= new JButton("/");
        JButton equal= new JButton("=");
        JButton decimal= new JButton(".");
        JButton back= new JButton("<--");
        JButton clear= new JButton("C");

        JTextField r=new JTextField();



        r.setBounds(20,20,260,80);
        clear.setBounds(20,120,50,50);
        back.setBounds(230,120,50,50);
        one.setBounds( 20,190,50,50);
        two.setBounds(90,190,50,50);
        three.setBounds(160,190,50,50);
        equal.setBounds(230,190,50,50);
        four.setBounds(20,260,50,50);
        five.setBounds(90,260,50,50);
        six.setBounds(160,260,50,50);
        add.setBounds(230,260,50,50);
        seven.setBounds(20,330,50,50);
        eight.setBounds(90,330,50,50);
        nine.setBounds(160,330,50,50);
        minus.setBounds(230,330,50,50);
        decimal.setBounds(20,400,50,50);
        zero.setBounds(90,400,50,50);
        divide.setBounds(160,400,50,50);
        multiply.setBounds(230,400,50,50);



        add(r);
        add(clear);
        add(back);
        add(one);
        add(two);
        add(three);
        add(equal);
        add(four);
        add(five);
        add(six);
        add(add);
        add(seven);
        add(eight);
        add(nine);
        add(minus);
        add(decimal);
        add(zero);
        add(divide);
        add(multiply);

        int [] num = {0,0};
        String []snum={"",""};
        //final int a=0;
        //String p ;
        //int c=0;

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10);
                s+="0";
                snum[a]+="0";
                r.setText(s);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+1;
                s+="1";
                snum[a]+="1";
                r.setText(s);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+2;
                s+="2";
                snum[a]+="2";
                r.setText(s);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+3;
                s+="3";
                snum[a]+="3";
                r.setText(s);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+4;
                s+="4";
                snum[a]+="4";
                r.setText(s);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+5;
                s+="5";
                snum[a]+="5";
                r.setText(s);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+6;
                s+="6";
                snum[a]+="6";
                r.setText(s);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+7;
                s+="7";
                snum[a]+="7";
                r.setText(s);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+8;
                s+="8";
                snum[a]+="8";
                r.setText(s);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[a]= (num[a]*10)+9;
                s+="9";
                snum[a]+="9";
                r.setText(s);

            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //c++;
                a=a+1;
                s+= " + ";
                r.setText(s);
                p="+";
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //c++;
                a=a+1;
                s+= " - ";
                r.setText(s);
                p="-";
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //c++;
                a=a+1;
                s+= " * ";
                r.setText(s);
                p="*";
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //c++;
                a=a+1;
                s+= " / ";
                r.setText(s);
                p="/";
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p=="+"){
                    int ss=Integer.parseInt(snum[0]);
                    int ss1=Integer.parseInt(snum[1]);
                    r.setText(Integer.toString((ss+ss1)));
                }
                if(p=="-"){
                    r.setText(Integer.toString((num[0]-num[1])));
                }
                if(p=="*"){
                    r.setText(Integer.toString((num[0]*num[1])));
                }
                if(p=="/"){
                    r.setText(Integer.toString((num[0]/num[1])));
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[0]=0;
                num[1]=0;
                p="";
                s="";
                a=0;
                r.setText("");
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snum[a]=snum[a].substring(0,snum[a].length()-1);
            }
        });





        setLayout(null);
        setSize(310,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        calculator ob =new calculator();
    }
}