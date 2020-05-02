package To_Do_List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Win extends JFrame {
    private final static String TITLE = "TO-DO List";
    private final static int WIN_WIDTH = 600;
    private final static int WIN_HEIGHT = 500;

    private ArrayList<String> activities;
    private ArrayList<String> dates;
    private ArrayList<String> descriptions;

    private int indexNumber;
    private static int clicksIndexNumber;
    private DefaultListModel model;
    private JList jlist;

    Font font;

    private boolean isMarked = false;

    public int getIndexNumber() {
        return indexNumber;
    }

    public Win() {
        this.setSize(WIN_WIDTH, WIN_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(TITLE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.ORANGE);

        activities = new ArrayList<>();
        dates = new ArrayList<>();
        descriptions = new ArrayList<>();

        model = new DefaultListModel();
        model.addAll(activities);
        jlist = new JList(model);

        font = new Font("TimesRoman", Font.BOLD | Font.ITALIC, 20);
        jlist.setFont(font);

        JButton addTask = new JButton("Add task");
        addTask.setBounds(400, 90, 150, 60);
        this.add(addTask);

        JButton editTask = new JButton("Edit task");
        editTask.setBounds(400, 170, 150, 60);
        this.add(editTask);

        JButton removeTask = new JButton("Remove task");
        removeTask.setBounds(400, 250, 150, 60);
        this.add(removeTask);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(400, 400, 150, 60);
        this.add(clearButton);

      /*  JTextArea activitiesArea = new JTextArea();
        activitiesArea.setBounds(10,10,350,420);
        activitiesArea.setEditable(false);
        this.add(activitiesArea);*/

        JLabel taskName = new JLabel("Task Name:");
        taskName.setBounds(WIN_WIDTH / 4 - 30, 10, 100, 30);

        JLabel dateOfTask = new JLabel("Date of Task:");
        dateOfTask.setBounds(WIN_WIDTH / 4 - 30, 100, 100, 30);

        JLabel description = new JLabel("Description:");
        description.setBounds(WIN_WIDTH / 4 - 30, 190, 100, 30);

        JTextField taskNameField = new JTextField();
        taskNameField.setBounds(10, 40, 270, 30);

        JTextField dateOfTaskField = new JTextField();
        dateOfTaskField.setBounds(10, 130, 270, 30);

        JTextField descriptionField = new JTextField();
        descriptionField.setBounds(10, 220, 270, 30);

        JButton saveButton = new JButton("Save & exit");
        saveButton.setBounds(WIN_WIDTH / 4 - 80, 270, 170, 40);

        JButton saveButton2 = new JButton("Save & exit");
        saveButton2.setBounds(WIN_WIDTH / 4 - 80, 270, 170, 40);

        JScrollPane scrollPane1 = new JScrollPane(jlist);
        scrollPane1.setBounds(10, 10, 350, 450);
        this.add(scrollPane1);

        jlist.addMouseListener(new MyMouseListener());
        jlist.addMouseListener(new MyMouseListener2());

        addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame newFrame = new JFrame("Add task");
                newFrame.setSize(WIN_WIDTH / 2, WIN_HEIGHT / 2 + 100);
                newFrame.setLayout(null);
                newFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                newFrame.setLocationRelativeTo(null);
                newFrame.setResizable(false);
                newFrame.add(taskName);
                newFrame.add(dateOfTask);
                newFrame.add(description);
                newFrame.add(taskNameField);
                newFrame.add(dateOfTaskField);
                newFrame.add(descriptionField);
                newFrame.add(saveButton);
                taskNameField.setText("");
                dateOfTaskField.setText("");
                descriptionField.setText("");
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        activities.add(taskNameField.getText());
                        dates.add(dateOfTaskField.getText());
                        descriptions.add(descriptionField.getText());
                        model.addElement(taskNameField.getText());
                        taskNameField.setText("");
                        dateOfTaskField.setText("");
                        descriptionField.setText("");
                        newFrame.dispose();
                    }
                });
                newFrame.setVisible(true);
            }
        });

        editTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!jlist.isSelectionEmpty()) {
                    JFrame newFrame = new JFrame("Edit task");
                    newFrame.setSize(WIN_WIDTH / 2, WIN_HEIGHT / 2 + 100);
                    newFrame.setLayout(null);
                    newFrame.setLocationRelativeTo(null);
                    newFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    newFrame.setResizable(false);
                    newFrame.add(taskName);
                    newFrame.add(dateOfTask);
                    newFrame.add(description);
                    newFrame.add(taskNameField);
                    newFrame.add(dateOfTaskField);
                    newFrame.add(descriptionField);
                    newFrame.add(saveButton2);
                    dateOfTaskField.setText(dates.get(indexNumber));
                    taskNameField.setText(activities.get(indexNumber));
                    descriptionField.setText(descriptions.get(indexNumber));

                    saveButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            activities.set(indexNumber, taskNameField.getText());
                            dates.set(indexNumber, dateOfTaskField.getText());
                            descriptions.set(indexNumber, descriptionField.getText());
                            model.set(indexNumber, activities.get(indexNumber));
                            newFrame.dispose();
                        }
                    });
                    newFrame.setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Please select an element!");
            }
        });

        removeTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete task", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    activities.remove(indexNumber);
                    dates.remove(indexNumber);
                    descriptions.remove(indexNumber);
                    model.remove(indexNumber);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!model.isEmpty()) {
                    int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Clear task", JOptionPane.YES_NO_OPTION);
                    if (choice == 0) {
                        activities.clear();
                        dates.clear();
                        descriptions.clear();
                        model.clear();
                    }
                }
            }
        });


        this.setVisible(true);
    }  //end Win constructor


    private static class Green extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (index==clicksIndexNumber)
                c.setBackground(Color.GREEN);
            return c;
        }
    }

    private static class notGreen extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            c.setBackground(null);
            return c;
        }
    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent mouseEvent) {
            JList theList = (JList) mouseEvent.getSource();
            if (mouseEvent.getClickCount() == 2) {
                int index = theList.locationToIndex(mouseEvent.getPoint());
                if (index >= 0) {
                    Object o = theList.getModel().getElementAt(index);
                    clicksIndexNumber = index;
                    Character c = 2713;
                    jlist.setCellRenderer(new Green());
                /*    if (isMarked) {
                        isMarked = false;
                        jlist.setCellRenderer(new notGreen());
                    }*/
                }
            }
        }
    }

    public static Component getRendererComponent(JList list, int item) {
        Object value = list.getModel().getElementAt(item);
        ListCellRenderer cellRenderer = list.getCellRenderer();
        Component rendererComponent = cellRenderer.getListCellRendererComponent(list, value, item, true, false);
        if (rendererComponent == null) {
            return null;
        }
        return rendererComponent;
    }

    class MyMouseListener2 extends MouseAdapter {
        public void mouseClicked(MouseEvent mouseEvent) {
            JList theList = (JList) mouseEvent.getSource();
            int index = theList.locationToIndex(mouseEvent.getPoint());
            if (index >= 0) {
                Object o = theList.getModel().getElementAt(index);
                indexNumber = index;
            }
        }
    }

    class MyMouseListener3 extends MouseAdapter {
        public void mouseClicked(MouseEvent mouseEvent) {
            if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                JList theList = (JList) mouseEvent.getSource();
                int index = theList.locationToIndex(mouseEvent.getPoint());
                if (index >= 0) {
                    Object o = theList.getModel().getElementAt(index);
                    indexNumber = index;

                }
            }
        }
    }

}
