/*
 * Ashton Chavez
 * project2.java
 * November 12, 2024
 * 
 * This class allows users to select a geometric shape from a list, 
 * input relevant parameters (such as dimensions), and display the shape in a frame.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class project2 extends JFrame {
    
    private JComboBox<String> shapeSelector;
    private JPanel inputPanel;
    private JTextField[] parameterFields;
    private JLabel resultLabel;
    private JPanel displayPanel;

    public project2() {
        // Frame settings
        setTitle("Project 4");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Shape selection dropdown
        String[] shapes = { "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" };
        shapeSelector = new JComboBox<>(shapes);
        shapeSelector.addActionListener(new ShapeSelectionHandler());
        add(shapeSelector, BorderLayout.NORTH);

        // Input panel for parameters
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2)); // Adjust for up to 3 parameters
        add(inputPanel, BorderLayout.CENTER);

        // Result label to display area or volume
        resultLabel = new JLabel("Select a shape and enter parameters.");
        add(resultLabel, BorderLayout.SOUTH);

        // Display panel for visual representation
        displayPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw a placeholder graphic based on the shape
                if (shapeSelector.getSelectedItem() != null) {
                    drawShape(g, (String) shapeSelector.getSelectedItem());
                }
            }
        };
        displayPanel.setPreferredSize(new Dimension(300, 300));
        add(displayPanel, BorderLayout.EAST);

        // Show the frame
        setVisible(true);
    }

    private void drawShape(Graphics g, String shapeName) {
    
        // Loads the image based on the shape selection
        ImageIcon shapeImage = null;
        switch (shapeName) {
            // 3D Shapes
            case "Sphere":
                shapeImage = new ImageIcon(getClass().getResource("sphere.png"));
                break;
            case "Cube":
                shapeImage = new ImageIcon(getClass().getResource("cube.png"));
                break;
            case "Cone":
                shapeImage = new ImageIcon(getClass().getResource("cone.jpeg"));
                break;
            case "Cylinder":
                shapeImage = new ImageIcon(getClass().getResource("cylinder.png"));
                break;
            case "Torus":
                shapeImage = new ImageIcon(getClass().getResource("torus.png"));
                break;
            // 2D Shapes
            case "Circle":
                g.drawOval(50, 50, 100, 100);
                break;
            case "Square":
                g.drawRect(50, 50, 100, 100);
                break;
            case "Triangle":
                g.drawPolygon(new int[] { 50, 100, 150 }, new int[] { 150, 50, 150 }, 3);
                break;
            case "Rectangle":
                g.drawRect(50, 50, 150, 100);
                break;
            /*default:
                g.drawString("2D shapes are drawn here.", 50, 50);
                return;*/
        }
    
        // Draw the image if it's not null
        if (shapeImage != null) {
            Image img = shapeImage.getImage();
            g.drawImage(img, 50, 50, 200, 200, this); // Adjust position and size as needed
        }
    }
    

    private class ShapeSelectionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputPanel.removeAll();
            String selectedShape = (String) shapeSelector.getSelectedItem();

            switch (selectedShape) {
                case "Circle":
                    createParameterFields("Radius");
                    break;
                case "Square":
                    createParameterFields("Side");
                    break;
                case "Triangle":
                    createParameterFields("Base", "Height");
                    break;
                case "Rectangle":
                    createParameterFields("Length", "Width");
                    break;
                case "Sphere":
                    createParameterFields("Radius");
                    break;
                case "Cube":
                    createParameterFields("Side");
                    break;
                case "Cone":
                    createParameterFields("Radius", "Height");
                    break;
                case "Cylinder":
                    createParameterFields("Radius", "Height");
                    break;
                case "Torus":
                    createParameterFields("Major Radius", "Minor Radius");
                    break;
            }
            inputPanel.revalidate();
            inputPanel.repaint();
        }
    }

    private void createParameterFields(String... labels) {
        parameterFields = new JTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            inputPanel.add(new JLabel(labels[i]));
            parameterFields[i] = new JTextField();
            inputPanel.add(parameterFields[i]);
        }

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculationHandler());
        inputPanel.add(calculateButton);
    }

    private class CalculationHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedShape = (String) shapeSelector.getSelectedItem();
            try {
                double result = 0;
                switch (selectedShape) {
                    case "Circle":
                        double radius = Double.parseDouble(parameterFields[0].getText());
                        circle circle = new circle(radius);
                        result = circle.getArea();
                        break;
                    case "Square":
                        double side = Double.parseDouble(parameterFields[0].getText());
                        square square = new square(side);
                        result = square.getArea();
                        break;
                    case "Triangle":
                        double base = Double.parseDouble(parameterFields[0].getText());
                        double height = Double.parseDouble(parameterFields[1].getText());
                        triangle triangle = new triangle(base, height);
                        result = triangle.getArea();
                        break;
                    case "Rectangle":
                        double length = Double.parseDouble(parameterFields[0].getText());
                        double width = Double.parseDouble(parameterFields[1].getText());
                        rectangle rectangle = new rectangle(length, width);
                        result = rectangle.getArea();
                        break;
                    case "Sphere":
                        radius = Double.parseDouble(parameterFields[0].getText());
                        sphere sphere = new sphere(radius);
                        result = sphere.getVolume();
                        break;
                    case "Cube":
                        side = Double.parseDouble(parameterFields[0].getText());
                        cube cube = new cube(side);
                        result = cube.getVolume();
                        break;
                    case "Cone":
                        radius = Double.parseDouble(parameterFields[0].getText());
                        height = Double.parseDouble(parameterFields[1].getText());
                        cone cone = new cone(radius, height);
                        result = cone.getVolume();
                        break;
                    case "Cylinder":
                        radius = Double.parseDouble(parameterFields[0].getText());
                        height = Double.parseDouble(parameterFields[1].getText());
                        cylinder cylinder = new cylinder(radius, height);
                        result = cylinder.getVolume();
                        break;
                    case "Torus":
                        double majorRadius = Double.parseDouble(parameterFields[0].getText());
                        double minorRadius = Double.parseDouble(parameterFields[1].getText());
                        torus torus = new torus(majorRadius, minorRadius);
                        result = torus.getVolume();
                        break;
                }
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers!");
            }
        }
    }

    public static void main(String[] args) {
        new project2();
    }
}