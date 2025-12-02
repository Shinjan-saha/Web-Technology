import java.awt.*;
import java.awt.event.*;


public class PortfolioApp extends Frame implements ActionListener {
    MenuItem miAbout, miExp, miEdu, miProj, miContact, miExit;
    CardLayout cardLayout;
    Panel cardPanel;
    ScrollPane scrollPane;

    public PortfolioApp() {
        super("Shinjan Saha — Portfolio");
        setSize(800, 600);
        setLayout(new BorderLayout());

        
        MenuBar mb = new MenuBar();
        Menu mNavigate = new Menu("Navigate");

        miAbout = new MenuItem("About");
        miExp = new MenuItem("Experience");
        miEdu = new MenuItem("Education");
        miProj = new MenuItem("Projects");
        miContact = new MenuItem("Contact");
        miExit = new MenuItem("Exit");

        mNavigate.add(miAbout);
        mNavigate.add(miExp);
        mNavigate.add(miEdu);
        mNavigate.add(miProj);
        mNavigate.addSeparator();
        mNavigate.add(miContact);
        mNavigate.addSeparator();
        mNavigate.add(miExit);

        mb.add(mNavigate);
        setMenuBar(mb);


        miAbout.addActionListener(this);
        miExp.addActionListener(this);
        miEdu.addActionListener(this);
        miProj.addActionListener(this);
        miContact.addActionListener(this);
        miExit.addActionListener(e -> System.exit(0));


        cardLayout = new CardLayout();
        cardPanel = new Panel(cardLayout);

        cardPanel.add(createAboutPanel(), "About");
        cardPanel.add(createExperiencePanel(), "Experience");
        cardPanel.add(createEducationPanel(), "Education");
        cardPanel.add(createProjectsPanel(), "Projects");
        cardPanel.add(createContactPanel(), "Contact");

        
        scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
        scrollPane.add(cardPanel);

        add(scrollPane, BorderLayout.CENTER);


        add(createHeader(), BorderLayout.NORTH);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        
        cardLayout.show(cardPanel, "About");
        setVisible(true);
    }

   
    private Panel createHeader() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(new Color(35, 87, 126));
        Label name = new Label("Shinjan Saha", Label.LEFT);
        name.setFont(new Font("SansSerif", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        name.setPreferredSize(new Dimension(400, 50));
        p.add(name, BorderLayout.WEST);


        Panel right = new Panel(new FlowLayout(FlowLayout.RIGHT, 8, 12));
        Button bAbout = new Button("About");
        Button bExp = new Button("Experience");
        Button bProj = new Button("Projects");
        Button bContact = new Button("Contact");
        bAbout.addActionListener(e -> cardLayout.show(cardPanel, "About"));
        bExp.addActionListener(e -> cardLayout.show(cardPanel, "Experience"));
        bProj.addActionListener(e -> cardLayout.show(cardPanel, "Projects"));
        bContact.addActionListener(e -> cardLayout.show(cardPanel, "Contact"));
        right.add(bAbout);
        right.add(bExp);
        right.add(bProj);
        right.add(bContact);
        right.setBackground(new Color(35, 87, 126));
        p.add(right, BorderLayout.EAST);
        return p;
    }

    
    private Panel createAboutPanel() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(Color.WHITE);

        TextArea ta = new TextArea();
        ta.setEditable(false);
        ta.setFont(new Font("Serif", Font.PLAIN, 14));

        StringBuilder sb = new StringBuilder();
        sb.append("About / Summary\n");
        sb.append("----------------\n");
        sb.append("Name: Shinjan Saha\n");
        sb.append("Location: Kolkata, India\n");
        sb.append("Email: shinjansaha02@gmail.com\n\n");
        sb.append("Summary:\n");
        sb.append("Final-year B.Tech student in Electronics & Communication Engineering with hands-on\n");
        sb.append("experience in Embedded Systems, RTOS (FreeRTOS, Zephyr), Bare-metal programming,\n");
        sb.append("and full-stack development using Flutter, Next.js and cloud deployment.\n\n");
        sb.append("Skills Highlight (selected):\n");
        sb.append("- Embedded Systems & RTOS, ARM Cortex-M, FPGA (Xilinx)\n");
        sb.append("- Languages: C, C++, Python, Java, Go, JavaScript/TypeScript, Dart\n");
        sb.append("- Web & Cloud: HTML/CSS, React, Next.js, Flutter, AWS/GCP, Docker\n");
        sb.append("- Databases: MongoDB, MySQL\n\n");
        sb.append("Links & Profiles:\n");
        sb.append("LinkedIn: https://www.linkedin.com/in/shinjan-saha\n");
        sb.append("Trailblazer / Salesforce: https://www.salesforce.com/trailblazer/shinjansaha\n\n");
        sb.append("(Content taken from uploaded resume.)\n");

        ta.setText(sb.toString());
        p.add(ta, BorderLayout.CENTER);
        return p;
    }

    
    private Panel createExperiencePanel() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(Color.WHITE);

        TextArea ta = new TextArea();
        ta.setEditable(false);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 13));

        StringBuilder sb = new StringBuilder();
        sb.append("Experience\n");
        sb.append("----------\n");

        sb.append("Siemens (Sept 2025 - Nov 2025) — Intern, Gurugram, India\n");
        sb.append("- Worked on Building Management Systems (BMS) and HVAC automation.\n");
        sb.append("- Programmed and commissioned field controllers, tuned parameters for reliability and efficiency.\n\n");

        sb.append("Techno Billion AI (Mar 2025 - Aug 2025) — SDE Intern, Kolkata, India\n");
        sb.append("- Developed educational solutions using Flutter and Next.js, integrated REST APIs and ML models.\n\n");

        sb.append("WBPDCL (Jun 2025 - Jul 2025) — Intern/Trainee\n");
        sb.append("- Thermal unit operations and PHP-based IT solutions for data management in plant operations.\n\n");

        sb.append("Mindwatt Industries (Sept 2024 - Oct 2024) — Embedded Engineer Intern\n");
        sb.append("- Worked with microcontrollers, FPGAs, TI DLP6000EVM and Nordic nRF boards for hardware development.\n\n");

        sb.append("Projects and Achievements are listed in Projects section.\n");

        ta.setText(sb.toString());
        p.add(ta, BorderLayout.CENTER);
        return p;
    }

    
    private Panel createEducationPanel() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(Color.WHITE);

        TextArea ta = new TextArea();
        ta.setEditable(false);

        StringBuilder sb = new StringBuilder();
        sb.append("Education\n");
        sb.append("---------\n");
        sb.append("Techno Main Salt Lake — Bachelor of Technology in Electronics and Communication Engineering (2026)\n");
        sb.append("Aditya Academy — Senior Secondary (Class 10: 82%, Class 12: 79.1%)\n\n");
        sb.append("Relevant coursework: Embedded Systems, Digital Signal Processing, Microcontrollers,\nOperating Systems and Computer Networks.\n");

        ta.setText(sb.toString());
        p.add(ta, BorderLayout.CENTER);
        return p;
    }

    
    private Panel createProjectsPanel() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(Color.WHITE);

        TextArea ta = new TextArea();
        ta.setEditable(false);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 13));

        StringBuilder sb = new StringBuilder();
        sb.append("Projects & Open Source\n");
        sb.append("----------------------\n");
        sb.append("Sentiment Analysis — TensorFlow model, Mac M1 GPU acceleration (see article)\n");
        sb.append("Fire Detection System — NodeMCU ESP8266, ThingSpeak, Next.js & Flutter dashboards (Github)\n");
        sb.append("Perspecto Sphere — Wearable for visually impaired (Raspberry Pi 4, OpenCV, YOLO)\n");
        sb.append("Kheti-Sathi — AI-driven agriculture app (Winner SIH 2024)\n");
        sb.append("PyFilterLab — Python package to visualize IIR & FIR filters (pypi)\n");
        sb.append("Salary Management System — Golang + PostgreSQL (Github)\n");
        sb.append("Certifyme — Flutter package to export certificates (pub.dev)\n\n");

        sb.append("Links (from resume):\n");
        sb.append("- GitHub: https://github.com/Shinjan-saha\n");
        sb.append("- PyPI: https://pypi.org/project/pyfilterlab/0.1.1/\n");
        sb.append("- Pub.dev: https://pub.dev/packages/certify_me\n");
        sb.append("- SIH Winner project reference and other drive links included in resume.\n\n");

        ta.setText(sb.toString());
        p.add(ta, BorderLayout.CENTER);
        return p;
    }

    
    private Panel createContactPanel() {
        Panel p = new Panel(new BorderLayout());
        p.setBackground(Color.WHITE);

        Panel form = new Panel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Label lName = new Label("Name:");
        Label lEmail = new Label("Email:");
        Label lPhone = new Label("Phone (optional):");
        Label lMsg = new Label("Message:");

        TextField tfName = new TextField(30);
        TextField tfEmail = new TextField(30);
        TextField tfPhone = new TextField(20);
        TextArea taMsg = new TextArea(6, 40);

        Button btnSend = new Button("Send Message");

        // Place components
        gbc.gridx = 0; gbc.gridy = 0; form.add(lName, gbc);
        gbc.gridx = 1; gbc.gridy = 0; form.add(tfName, gbc);

        gbc.gridx = 0; gbc.gridy = 1; form.add(lEmail, gbc);
        gbc.gridx = 1; gbc.gridy = 1; form.add(tfEmail, gbc);

        gbc.gridx = 0; gbc.gridy = 2; form.add(lPhone, gbc);
        gbc.gridx = 1; gbc.gridy = 2; form.add(tfPhone, gbc);

        gbc.gridx = 0; gbc.gridy = 3; form.add(lMsg, gbc);
        gbc.gridx = 1; gbc.gridy = 3; form.add(taMsg, gbc);

        gbc.gridx = 1; gbc.gridy = 4; gbc.anchor = GridBagConstraints.EAST; form.add(btnSend, gbc);

        p.add(form, BorderLayout.CENTER);

       
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText().trim();
                String email = tfEmail.getText().trim();
                String phone = tfPhone.getText().trim();
                String msg = taMsg.getText().trim();

                if (name.isEmpty() || email.isEmpty() || msg.isEmpty()) {
                    showDialog("Error", "Please fill Name, Email and Message fields.");
                    return;
                }
                // VERY basic email check
                if (!email.contains("@") || !email.contains(".")) {
                    showDialog("Error", "Please enter a valid email address.");
                    return;
                }


                System.out.println("=== Contact Form Submission ===");
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
                System.out.println("Message:\n" + msg);
                System.out.println("===============================");

                showDialog("Success", "Message sent! Thank you, " + name + ".");
                
                // Clear form
                tfName.setText("");
                tfEmail.setText("");
                tfPhone.setText("");
                taMsg.setText("");
            }
        });

        return p;
    }

    private void showDialog(String title, String message) {
        Dialog d = new Dialog(this, title, true);
        d.setLayout(new BorderLayout());
        Label msg = new Label(message, Label.CENTER);
        Button ok = new Button("OK");
        ok.addActionListener(ev -> d.dispose());
        d.add(msg, BorderLayout.CENTER);
        Panel p = new Panel();
        p.add(ok);
        d.add(p, BorderLayout.SOUTH);
        d.setSize(350, 150);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == miAbout) cardLayout.show(cardPanel, "About");
        else if (src == miExp) cardLayout.show(cardPanel, "Experience");
        else if (src == miEdu) cardLayout.show(cardPanel, "Education");
        else if (src == miProj) cardLayout.show(cardPanel, "Projects");
        else if (src == miContact) cardLayout.show(cardPanel, "Contact");
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> new PortfolioApp());
    }
}
