import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class trim  implements ActionListener{
    Frame f;
    Button b1;
    TextField t1,t2,t3;
    Label l1,l2,l3;



    trim()
    {
        f=new Frame("String Manipulation");
        f.setVisible(true);
        f.setSize(500,450);
        f.setLayout(new FlowLayout());
        l1=new Label("Enter the string:");
        l1.setBounds(50,100,100,20);
        t1=new TextField(15);
        f.add(l1);
        f.add(t1);

        l2=new Label("Enter the Letter:");
        l2.setBounds(50,100,100,20);
        t2=new TextField(15);
        f.add(l2);
        f.add(t2);



        b1=new Button("Submit");
        f.add(b1);
        b1.addActionListener(this);

        Label l3=new Label("After Changes");
        t3=new TextField(30);

        f.add(l3);
        f.add(t3);

        f.addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
            );



    }

      public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            f.setBackground(Color.cyan);
            String input=t1.getText();
            String letter=t2.getText();
            char c=letter.charAt(0);
            String output="";
            int flag=0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)==c){
                    flag=i;
                    break;
                }
            }
            for(int i=flag+1;i<input.length();i++)
            {
                output=output+input.charAt(i);
            }

            if(input.contains(letter)){
                t3.setText(output);
            }
            else
            {
                t3.setText("The letter does not exist in the sentence");
            }

        }




    }


    public  static void main(String[] s)
    {
        new trim();
    }

}
