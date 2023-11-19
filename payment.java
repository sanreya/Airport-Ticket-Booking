import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.*;

public class payment {
    payment(){
        JFrame frame = new JFrame("Payment Page");
        frame.getContentPane().setBackground(new Color(135, 206, 235)); // Set sky blue background color
        
        Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
		Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
		frame.setSize(screenSize.width,screenSize.height);

        

        JPanel paymentPanel = new JPanel();
        paymentPanel.setLayout(new BoxLayout(paymentPanel, BoxLayout.Y_AXIS));
        paymentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel paymentMethodLabel = new JLabel("Payment Method");
        paymentMethodLabel.setFont(new Font("Arial", Font.BOLD, 16));
        paymentMethodLabel.setForeground(Color.BLACK); // Set navy blue color for the label

        JButton option3 = new JButton("UPI");
        JButton option5 = new JButton("Wallet");
        JButton option2 = new JButton("Debit Card");
        JButton option1 = new JButton("Credit Card");
        JButton option4 = new JButton("Net Banking");

        paymentPanel.add(paymentMethodLabel);
        paymentPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing between heading and buttons
        paymentPanel.add(option3);
        paymentPanel.add(option5);
        paymentPanel.add(option2);
        paymentPanel.add(option1);
        paymentPanel.add(option4);

        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new GridLayout(8, 2));
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel cardHolderLabel = new JLabel("Card Holder Name:");
        JTextField cardHolderField = new JTextField();
        JLabel cardNumberLabel = new JLabel("Card Number:");
        JTextField cardNumberField = new JTextField();
        JLabel cvvLabel = new JLabel("CVV:");
        JPasswordField cvvField = new JPasswordField();
        JLabel upiIdLabel = new JLabel("UPI ID:");
        JTextField upiIdField = new JTextField();
        JLabel expiryLabel = new JLabel("Expiry Date:");
        JComboBox<String> monthComboBox = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        JComboBox<String> yearComboBox = new JComboBox<>(generateYearOptions());
        JLabel branchLabel = new JLabel("Branch Name:");
        JComboBox<String> branchComboBox = new JComboBox<>(new String[]{"SBI", "HDFC", "AXIS", "ICICI Bank"});
        JLabel walletLabel = new JLabel("Wallets List:");
        JComboBox<String> walletComboBox = new JComboBox<>(new String[]{"Paytm", "Mobikwik", "PayZapp", "ICASH", "FreeCharge", "PhonePe"});

        detailsPanel.add(cardHolderLabel);
        detailsPanel.add(cardHolderField);
        detailsPanel.add(cardNumberLabel);
        detailsPanel.add(cardNumberField);
        detailsPanel.add(cvvLabel);
        detailsPanel.add(cvvField);
        detailsPanel.add(upiIdLabel);
        detailsPanel.add(upiIdField);
        detailsPanel.add(expiryLabel);
        detailsPanel.add(monthComboBox);
        detailsPanel.add(new JLabel(""));
        detailsPanel.add(yearComboBox);
        detailsPanel.add(branchLabel);
        detailsPanel.add(branchComboBox);
        detailsPanel.add(walletLabel);
        detailsPanel.add(walletComboBox);

        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsPanel.setVisible(true);
                cardNumberLabel.setVisible(true);
                cardNumberField.setVisible(true);
                cvvLabel.setVisible(true);
                cvvField.setVisible(true);
                cardHolderLabel.setVisible(true);
                cardHolderField.setVisible(true);
                upiIdLabel.setVisible(false);
                upiIdField.setVisible(false);
                expiryLabel.setVisible(true);
                monthComboBox.setVisible(true);
                yearComboBox.setVisible(true);
                branchLabel.setVisible(false);
                branchComboBox.setVisible(false);
                walletLabel.setVisible(false);
                walletComboBox.setVisible(false);
            }
        });

        option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsPanel.setVisible(true);
                cardNumberLabel.setVisible(true);
                cardNumberField.setVisible(true);
                cvvLabel.setVisible(true);
                cvvField.setVisible(true);
                cardHolderLabel.setVisible(true);
                cardHolderField.setVisible(true);
                upiIdLabel.setVisible(false);
                upiIdField.setVisible(false);
                expiryLabel.setVisible(true);
                monthComboBox.setVisible(true);
                yearComboBox.setVisible(true);
                branchLabel.setVisible(false);
                branchComboBox.setVisible(false);
                walletLabel.setVisible(false);
                walletComboBox.setVisible(false);
            }
        });

        option3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsPanel.setVisible(true);
                cardNumberLabel.setVisible(false);
                cardNumberField.setVisible(false);
                cvvLabel.setVisible(false);
                cvvField.setVisible(false);
                cardHolderLabel.setVisible(false);
                cardHolderField.setVisible(false);
                upiIdLabel.setVisible(true);
                upiIdField.setVisible(true);
                expiryLabel.setVisible(false);
                monthComboBox.setVisible(false);
                yearComboBox.setVisible(false);
                branchLabel.setVisible(false);
                branchComboBox.setVisible(false);
                walletLabel.setVisible(false);
                walletComboBox.setVisible(false);
            }
        });

        option4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsPanel.setVisible(true);
                cardNumberLabel.setVisible(false);
                cardNumberField.setVisible(false);
                cvvLabel.setVisible(false);
                cvvField.setVisible(false);
                cardHolderLabel.setVisible(false);
                cardHolderField.setVisible(false);
                upiIdLabel.setVisible(false);
                upiIdField.setVisible(false);
                expiryLabel.setVisible(false);
                monthComboBox.setVisible(false);
                yearComboBox.setVisible(false);
                branchLabel.setVisible(true);
                branchComboBox.setVisible(true);
                walletLabel.setVisible(false);
                walletComboBox.setVisible(false);
            }
        });

        option5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsPanel.setVisible(true);
                cardNumberLabel.setVisible(false);
                cardNumberField.setVisible(false);
                cvvLabel.setVisible(false);
                cvvField.setVisible(false);
                cardHolderLabel.setVisible(false);
                cardHolderField.setVisible(false);
                upiIdLabel.setVisible(false);
                upiIdField.setVisible(false);
                expiryLabel.setVisible(false);
                monthComboBox.setVisible(false);
                yearComboBox.setVisible(false);
                branchLabel.setVisible(false);
                branchComboBox.setVisible(false);
                walletLabel.setVisible(true);
                walletComboBox.setVisible(true);
            }
        });

        detailsPanel.setVisible(false);

        JPanel summaryPanel = new JPanel();
        summaryPanel.setLayout(new BoxLayout(summaryPanel, BoxLayout.Y_AXIS));
        summaryPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel summaryLabel = new JLabel("Summary");
        summaryLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JTextArea summaryArea = new JTextArea(10, 20);
        summaryArea.setEditable(false);
        summaryArea.setFont(summaryArea.getFont().deriveFont(Font.BOLD)); // Set bold font for the summary
        JScrollPane scrollPane = new JScrollPane(summaryArea);

        summaryPanel.add(summaryLabel);
        summaryPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing between heading and text area
        summaryPanel.add(scrollPane);

        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder summary = new StringBuilder();
                summary.append("Person Details:\n");

                if (option1.isSelected() || option2.isSelected()) {
                    summary.append("Card Holder Name: ").append(cardHolderField.getText()).append("\n");
                    summary.append("Card Number: ").append(cardNumberField.getText()).append("\n");
                    summary.append("CVV: ").append(new String(cvvField.getPassword())).append("\n\n");
                } else if (option5.isSelected()) {
                    summary.append("Wallet: ").append(walletComboBox.getSelectedItem()).append("\n\n");
                }

                String seatType = "Business";
                int numAdults = 2;
                int numChildren = 1;
                double cost = 1500.0;
                double subcharges = 100.0;
                double total = cost + subcharges;

                summary.append("Seat Type: ").append(seatType).append("\n");
                summary.append("Number of Adults: ").append(numAdults).append("\n");
                summary.append("Number of Children: ").append(numChildren).append("\n");
                summary.append("Cost: ₹").append(cost).append("\n");
                summary.append("Subcharges: ₹").append(subcharges).append("\n");
                summary.append("Total: ₹").append(total).append("\n");

                summary.append("Flight Info:\n");
                summary.append("SUN 16 JUL 23 ----> SUN 16 JUL 23\n");
                summary.append("04:05                       05:50\n");

                summaryArea.setText(summary.toString());
            }
        });

        detailsPanel.setVisible(false);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(paymentPanel, BorderLayout.WEST);
        mainPanel.add(detailsPanel, BorderLayout.CENTER);
        mainPanel.add(summaryPanel, BorderLayout.EAST);

        frame.getContentPane().add(mainPanel);

        frame.pack(); // Automatically adjust frame size
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    private static String[] generateYearOptions() {
        int startYear = Calendar.getInstance().get(Calendar.YEAR);
        int endYear = 2050;
        int totalYears = endYear - startYear + 1;
        String[] years = new String[totalYears];
        for (int i = 0; i < totalYears; i++) {
            years[i] = String.valueOf(startYear + i);
        }
        return years;
    }
}
