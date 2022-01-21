import javax.swing.*;
public class simple extends JFrame{//inheriting JFrame
    JFrame f;
    simple(){
        JButton q=new JButton("q");//create button
        q.setBounds(10,100, 50, 50);
        JButton w=new JButton("w");//create button
        w.setBounds(60,100, 50, 50);
        JButton e=new JButton("e");//create button
        e.setBounds(110,100, 50, 50);
        JButton r=new JButton("r");//create button
        r.setBounds(160,100, 50, 50);
        JButton t=new JButton("t");//create button
        t.setBounds(210,100, 50, 50);
        JButton y=new JButton("y");//create button
        y.setBounds(260,100, 50, 50);
        JButton u=new JButton("u");//create button
        u.setBounds(310,100, 50, 50);
        JButton i=new JButton("i");//create button
        i.setBounds(360,100, 50, 50);
        JButton o=new JButton("o");//create button
        o.setBounds(410,100, 50, 50);
        JButton p=new JButton("p");//create button
        p.setBounds(460,100, 50, 50);


        add(q);//adding button on frame
        add(w);
        add(e);
        add(r);
        add(t);
        add(y);
        add(u);
        add(i);
        add(o);
        add(p);

        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new simple();
    }


}
