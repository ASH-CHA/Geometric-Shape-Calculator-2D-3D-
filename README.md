# Geometric Shape Calculator (2D & 3D)

## Description

This Java Swing application allows users to select from a variety of **two-dimensional and three-dimensional geometric shapes**, enter the required dimensions, and calculate either the **area (2D shapes)** or **volume (3D shapes)**. The application also provides a **visual representation** of each shape within a graphical user interface.

The project demonstrates key object-oriented programming concepts including **inheritance**, **abstraction**, **polymorphism**, and **event-driven programming**, as well as GUI development using **Java Swing**.

---

## How It Works

1. When the program starts, a GUI window opens with:

   * A dropdown menu listing available shapes
   * A panel that dynamically updates with required input fields
   * A display panel that visually represents the selected shape
   * A result label showing the calculated area or volume

2. The user selects a shape from the dropdown menu:

   * **2D Shapes**: Circle, Square, Triangle, Rectangle
   * **3D Shapes**: Sphere, Cube, Cone, Cylinder, Torus

3. Based on the selected shape:

   * The program dynamically generates the required input fields (e.g., radius, height).
   * The display panel updates to draw the shape or load an image for 3D shapes.

4. After entering valid numerical values, the user clicks **Calculate**:

   * The program creates the corresponding shape object.
   * It computes the **area** (2D) or **volume** (3D).
   * The result is displayed at the bottom of the window.

5. If invalid input is entered, the program displays an error message prompting the user to correct it.

---

## Object-Oriented Design

* **`shape` (abstract class)**

  * Base class for all shapes
  * Stores number of dimensions
  * Enforces a `getName()` method

* **`TwoDimensionalShape` (abstract class)**

  * Extends `shape`
  * Requires implementation of `getArea()`

* **`ThreeDimensionalShape` (abstract class)**

  * Extends `shape`
  * Requires implementation of `getVolume()`

* **Concrete Shape Classes**

  * 2D: `circle`, `square`, `triangle`, `rectangle`
  * 3D: `sphere`, `cube`, `cone`, `cylinder`, `torus`

* **`project2.java`**

  * Main GUI class
  * Handles user interaction, dynamic input fields, calculations, and rendering

---

## How to Run

1. Ensure all `.java` files and shape image files (`.png`, `.jpeg`) are in the same directory.
2. Compile all files:

   ```bash
   javac *.java
   ```
3. Run the program:

   ```bash
   java project2
   ```
4. Use the dropdown menu to select shapes, enter parameters, and calculate results.

---

## Screenshots

1. **Application Startup Screen**

   * Shows the main window before any shape is selected.
   * <img width="482" height="491" alt="Screenshot 2025-12-25 152737" src="https://github.com/user-attachments/assets/c53be253-f75a-4b97-827a-3e96129be39f" />

2. **Shape Selection Dropdown**

   * Demonstrates selecting a shape (e.g., Sphere or Triangle).
   * <img width="485" height="488" alt="Screenshot 2025-12-25 152848" src="https://github.com/user-attachments/assets/31be1490-5011-450d-bcde-1e52f6a56843" />

3. **Dynamic Input Fields**

   * Shows input fields changing based on the selected shape.
   * **Sphere**
   * <img width="484" height="493" alt="Screenshot 2025-12-25 152934" src="https://github.com/user-attachments/assets/5289f1cb-17a3-4124-876c-d90ffd2baee9" />

   * **Triangle**
   * <img width="482" height="490" alt="Screenshot 2025-12-25 153002" src="https://github.com/user-attachments/assets/81791175-d5b2-4dae-bbdc-ccdd79c89aac" />

6. **Calculation Result**

   * Displays the calculated area or volume.
   * <img width="484" height="490" alt="Screenshot 2025-12-25 153145" src="https://github.com/user-attachments/assets/8aa713ba-f493-4207-b608-fa8cfb09b728" />

7. **Error Handling**

   * Shows the error message when invalid input is entered.
   * <img width="481" height="491" alt="Screenshot 2025-12-25 153221" src="https://github.com/user-attachments/assets/5f42bee6-a536-48be-80f9-e871e2bb67d9" />

---

## Concepts Demonstrated

* Java Swing GUI design
* Event handling (`ActionListener`)
* Inheritance and abstraction
* Polymorphism
* Dynamic UI updates
* Mathematical modeling of geometric shapes
