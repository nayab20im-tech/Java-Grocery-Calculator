# Java Grocery Calculator

A command-line Java application designed to calculate the total cost of grocery items in a shopping cart. The program iterates through user-entered items, calculates subtotals, and automatically applies a bulk discount logic based on the total quantity of units purchased.

## 📋 Features

- **Dynamic Input**: Accepts any number of distinct item types using a loop.
- **Cost Calculation**: Computes total cost based on item price and quantity.
- **Bulk Discount System**: automatically applies a **10% discount** if the total quantity of items purchased exceeds 5 units.
- **Formatted Output**: Displays clear, formatted monetary values for subtotals, discounts, and final bills.

## 🚀 How to Run

1. **Prerequisites**: Ensure you have Java installed on your machine.
   ```bash
   java -version
   
Compile the program:
javac GroceryStoreCalculator.java

Run the application:
java GroceryStoreCalculator

💻 Usage Example
Enter the number of distinct items in cart: 2

--- Item 1 ---
Enter the price of item: $10
Enter the quantity purchased: 3

--- Item 2 ---
Enter the price of item: $5
Enter the quantity purchased: 4


Subtotal Amount: $50.00
Total Units Purchased: 7
Bulk Discount (10%): -$5.00
Total Bill after Discount: $45.00

🛠️ Technologies Used

    Language: Java

    Core Concepts: Loops (for), Conditional Logic (if-else), Input Handling (Scanner)

📄 License

This project is open-source and available for educational use.
