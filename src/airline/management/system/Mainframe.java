package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }

    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM BETA 1.0");
        initialize();
    }


    private void initialize() {

        setForeground(Color.CYAN);
        setLayout(null);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front1.jpg")));
        NewLabel.setBounds(-70, -195, 2000, 1000);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("WELCOME TO AIR NEPAL");
        AirlineManagementSystem.setForeground(Color.YELLOW);
        AirlineManagementSystem.setFont(new Font("helvetica", Font.BOLD, 64));
        AirlineManagementSystem.setBounds(550, 300, 1000, 55);
        NewLabel.add(AirlineManagementSystem);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AirlineSystem = new JMenu("DASHBOARD");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenu Updates = new JMenu("Updates comming soon");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(Updates);

        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
        AirlineSystem.add(FlightDetails);

        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
        AirlineSystem.add(ReservationDetails);

        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
        AirlineSystem.add(PassengerDetails);

        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
        AirlineSystem.add(SectorDetails_1);

        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        AirlineSystem.add(Cancellation);


        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
        });

        ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
        });

        setSize(1950,1090);
        setVisible(true);
    }
}
