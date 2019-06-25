import javax.swing.*;
import javax.swing.JTabbedPane;
import java.awt.*;

public class Main extends JFrame {

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    private static ShoppingCart cart = new ShoppingCart();
    private static Item item1 = new Item("4753",100);
    private static Item item2 = new Item("6957",50);
    private static Item item3 = new Item("4125",70);
    private static Item item4 = new Item("7895",150);
    private static Item item5 = new Item("2135",300);
    private static Item item6 = new Item("5496",200);
    private static Item item7 = new Item("3542",150);
    private static Item item8 = new Item("1297",140);
    private static Item item9 = new Item("6421",270);
    private static Item item10 = new Item("3478",40);

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
        });
    }

    private Main() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(250, 2, 750, 687);
        setTitle("Digital Menu");


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        getContentPane().add(mainPanel);

        itemTabPanel1();
        itemTabPanel2();
        itemTabPanel3();
        itemTabPanel4();

        JTabbedPane tabPane = new JTabbedPane();
        tabPane.setTabPlacement(JTabbedPane.LEFT);
        tabPane.addTab("<html><h1>Burgers</h1></html>", panel1);
        tabPane.addTab("<html><h1>Sandwiches</h1></html>", panel2);
        tabPane.addTab("<html><h1>Pizza's</h1></html>", panel3);
        tabPane.addTab("<html><h1>Checkout</h1></html>", panel4);
        mainPanel.add(tabPane);

    }

    private void itemTabPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(null);

        //Burgers
        String burgerName1 = "./sample/Smoky  Burgers.jpg";
        JButton btn1 = new JButton("Select Me    $100", new ImageProxy(burgerName1));
        btn1.setHorizontalTextPosition(JButton.CENTER);
        btn1.setVerticalTextPosition(JButton.BOTTOM);
        btn1.setBounds(10, 11, 250, 220);
        btn1.addActionListener(ae -> cart.addItem(item1));
        panel1.add(btn1);

        String burgerName2 = "./sample/Steakhouse Burgers.jpg";
        JButton btn2 = new JButton("Select Me    $50", new ImageProxy(burgerName2));
        btn2.setHorizontalTextPosition(JButton.CENTER);
        btn2.setVerticalTextPosition(JButton.BOTTOM);
        btn2.setBounds(280, 11, 250, 220);
        btn2.addActionListener(ae -> cart.addItem(item2));
        panel1.add(btn2);

        String burgerName3 = "./sample/Kangaroo burgers.jpg";
        JButton btn3 = new JButton("Select Me    $70", new ImageProxy(burgerName3));
        btn3.setHorizontalTextPosition(JButton.CENTER);
        btn3.setVerticalTextPosition(JButton.BOTTOM);
        btn3.setBounds(10, 250, 250, 220);
        btn3.addActionListener(ae -> cart.addItem(item3));
        panel1.add(btn3);

        String burgerName4 = "./sample/Honey BBQ.jpg";
        JButton btn4 = new JButton("Select Me    $150", new ImageProxy(burgerName4));
        btn4.setHorizontalTextPosition(JButton.CENTER);
        btn4.setVerticalTextPosition(JButton.BOTTOM);
        btn4.setBounds(280, 250, 250, 220);
        btn4.addActionListener(ae -> cart.addItem(item4));
        panel1.add(btn4);

    }

    private void itemTabPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(null);

        //Sandwiches
        String sandwicheName1 = "./sample/Best Thanksgiving Sandwich.jpg";
        JButton btn5 = new JButton("Select Me    $300", new ImageProxy(sandwicheName1));
        btn5.setHorizontalTextPosition(JButton.CENTER);
        btn5.setVerticalTextPosition(JButton.BOTTOM);
        btn5.setBounds(10, 11, 250, 220);
        btn5.addActionListener(ae -> cart.addItem(item5));
        panel2.add(btn5);

        String sandwicheName2 = "./sample/Italian Sausage Sandwiches.jpg";
        JButton btn6 = new JButton("Select Me    $200", new ImageProxy(sandwicheName2));
        btn6.setHorizontalTextPosition(JButton.CENTER);
        btn6.setVerticalTextPosition(JButton.BOTTOM);
        btn6.setBounds(280, 11, 250, 220);
        btn6.addActionListener(ae -> cart.addItem(item6));
        panel2.add(btn6);

        String sandwicheName3 = "./sample/The Famous Coconut.jpg";
        JButton btn7 = new JButton("Select Me    $150", new ImageProxy(sandwicheName3));
        btn7.setHorizontalTextPosition(JButton.CENTER);
        btn7.setVerticalTextPosition(JButton.BOTTOM);
        btn7.setBounds(10, 250, 250, 220);
        btn7.addActionListener(ae -> cart.addItem(item7));
        panel2.add(btn7);

        String sandwicheName4 = "./sample/The Ultimate Chickpea.jpg";
        JButton btn8 = new JButton("Select Me    $140", new ImageProxy(sandwicheName4));
        btn8.setHorizontalTextPosition(JButton.CENTER);
        btn8.setVerticalTextPosition(JButton.BOTTOM);
        btn8.setBounds(280, 250, 250, 220);
        btn8.addActionListener(ae -> cart.addItem(item8));
        panel2.add(btn8);
    }

    private void itemTabPanel3() {
        panel3 = new JPanel();
        panel3.setLayout(null);

        //Pizza's
        String pizzasName1 = "./sample/Athens Pizzas.jpg";
        JButton btn9 = new JButton("Select Me    $270", new ImageProxy(pizzasName1));
        btn9.setHorizontalTextPosition(JButton.CENTER);
        btn9.setVerticalTextPosition(JButton.BOTTOM);
        btn9.setBounds(10, 11, 250, 220);
        btn9.addActionListener(ae -> cart.addItem(item9));
        panel3.add(btn9);

        String pizzasName2 = "./sample/New York-style pizza.jpg";
        JButton btn10 = new JButton("Select Me    $40", new ImageProxy(pizzasName2));
        btn10.setHorizontalTextPosition(JButton.CENTER);
        btn10.setVerticalTextPosition(JButton.BOTTOM);
        btn10.setBounds(280, 11, 250, 220);
        btn10.addActionListener(ae -> cart.addItem(item10));
        panel3.add(btn10);

    }
    private void itemTabPanel4() {
        panel4 = new JPanel();
        panel4.setLayout(null);
        //pay by paypal
        String paypalLogo = "./sample/Paypal.png";
        JButton btn11 = new JButton("PayPal", new ImageProxy(paypalLogo));
        btn11.addActionListener(ae ->  cart.pay(new PaypalStrategy("0", "0")));
        btn11.setHorizontalTextPosition(JButton.CENTER);
        btn11.setVerticalTextPosition(JButton.BOTTOM);
        btn11.setBounds(10, 11, 250, 220);
        panel4.add(btn11);

        //pay by credit card
        String creditCardLogo = "./sample/CreditCard.png";
        JButton btn12 = new JButton("CreditCard", new ImageProxy(creditCardLogo));
        btn12.addActionListener(ae ->  cart.pay(new CreditCardStrategy("0", "0", "0", "0")));
        btn12.setHorizontalTextPosition(JButton.CENTER);
        btn12.setVerticalTextPosition(JButton.BOTTOM);
        btn12.setBounds(280, 11, 250, 220);
        panel4.add(btn12);

    }
}














