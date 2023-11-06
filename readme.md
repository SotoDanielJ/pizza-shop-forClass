# Pizza Shop
Pizza is a popular and beloved food that consists of a round, flattened dough base, typically topped with tomato sauce, cheese, and various toppings, which can include ingredients like vegetables, meats, and herbs. It is often baked in an oven and is known for its delicious taste and versatility. 

**Table of Contents**
- [Pizza Shop](#pizza-shop)
  - [Introduction](#introduction)
    - [Here are some key points about pizza:](#here-are-some-key-points-about-pizza)
  - [Program Requirements](#program-requirements)
  - [User Stories:](#user-stories)
    - [Customer User Stories:](#customer-user-stories)
    - [Admin User Stories:](#admin-user-stories)
    - [Chef User Stories:](#chef-user-stories)
    - [Delivery Driver User Stories:](#delivery-driver-user-stories)
    - [Wait Staff User Stories:](#wait-staff-user-stories)
  - [Database Structure](#database-structure)
    - [Tables](#tables)
    - [Relationships](#relationships)

## Introduction

Our pizza shop application relies on a robust database structure to store and manage data efficiently. This structure allows us to handle pizza menu items, customer orders, customer information, and staff records seamlessly.

### Here are some key points about pizza:

**Dough:** The dough used for pizza is usually made from wheat flour, water, yeast, and salt. The dough is kneaded and allowed to rise, resulting in a soft, elastic texture when baked.

**Sauce:** Tomato sauce, often seasoned with herbs and spices, serves as the base for most pizzas. It provides a savory and slightly tangy flavor.

**Cheese:** Mozzarella cheese is the most common choice for pizza due to its meltability and mild flavor. However, other cheeses like cheddar, parmesan, and provolone can be used for variety.

**Toppings:** Pizza toppings vary widely and can be customized to suit personal preferences. Common toppings include pepperoni, mushrooms, bell peppers, onions, olives, sausage, bacon, and more. Vegetarian and vegan options are also popular, with ingredients like artichokes, spinach, and plant-based cheese.

**Styles:** There are various styles of pizza around the world, each with its unique characteristics. Some popular styles include:

  - **Neapolitan:** A traditional Italian pizza known for its thin crust and simple, high-quality ingredients.

  - **New York:** Characterized by large, foldable slices and a slightly thicker crust.
Chicago: Deep-dish or stuffed pizza, known for its thick, doughy crust and layers of cheese and toppings.

  - **Sicilian:** A square-shaped pizza with a thicker, fluffy crust.
Cooking Methods: Pizzas can be baked in traditional ovens, wood-fired ovens, brick ovens, or even on grills. Each method imparts its unique flavor and texture to the pizza.

**Popularity:** Pizza is enjoyed worldwide and is a staple in many countries. It is commonly found in pizzerias, restaurants, and even made at home.

**Variations:** Over the years, there have been numerous creative pizza variations, including dessert pizzas with sweet toppings like Nutella and fruit, as well as gluten-free and vegan options to accommodate various dietary preferences.

**Cultural Significance:** Pizza has become an iconic part of food culture in the United States and around the world. It's often enjoyed socially and is associated with gatherings and celebrations.

**Delivery and Takeout:** Pizza is a popular choice for food delivery and takeout, with many pizzerias offering convenient services for those who don't want to cook at home.

Creating a Java pizza shop application involves various components and functionalities to manage orders, customers, and menu items. Below are the basic program requirements for such an application:


## Program Requirements
1. User Authentication:
    User login and registration for customers and staff (admin, chefs, delivery drivers).

2. Menu Management:
    Ability to add, update, and delete menu items (e.g., pizzas, sides, drinks).
    Each menu item should have a name, description, price, and category (e.g., pizza, side, drink).
    Categorize menu items (e.g., vegetarian, non-vegetarian, specialty, etc.).

3. Order Management:
    Allow customers to create and customize their orders.
    Calculate the total cost of an order.
    Keep track of order status (e.g., received, preparing, out for delivery, delivered).

4. Customer Interaction:
    Display the menu to customers.
    Allow customers to browse the menu and add items to their cart.
    Enable customers to place an order with delivery or pickup options.

5. Admin Features:
    Ability to manage menu items.
    Monitor and manage customer orders.
    Manage staff accounts and access privileges.

6. Kitchen Management:
    Display orders to chefs.
    Update order status (e.g., when the order is being prepared).
    Notify chefs about new orders.

7. Delivery Management:
    Assign delivery drivers to orders.
    Track the status of delivery (out for delivery, delivered).
    Notify drivers about new delivery assignments.

8. Payment Processing:
    Support multiple payment methods (credit card, cash on delivery, etc.).
    Calculate the total cost of an order, including taxes and delivery charges.

9. Notification System:
    Send order updates and notifications to customers, chefs, and delivery drivers.

10. Database Integration:
    Store and retrieve customer data, order details, and menu items in a database.

11. Reporting and Analytics:
    Generate reports on sales, popular items, and customer order history.

12. Security:
    Ensure secure user authentication and protect sensitive information.

13. Exception Handling:
Implement error handling to manage unexpected issues.

14. User-Friendly Interface:
    Develop a user-friendly and responsive user interface for both customers and staff.

15. Testing:
    Perform thorough testing, including unit testing and integration testing, to ensure the application functions correctly.

16. Documentation:
    Create documentation, including user manuals and developer guides.

17. Scalability:
    Design the application to be easily expandable for adding new features or menu items.

18. Performance Optimization:
    Optimize the application for speed and resource efficiency.

19. Deployment:
    Deploy the application to a web server or cloud platform for accessibility.

20. Maintenance and Support:
    Plan for ongoing maintenance, updates, and customer support.
    These are the fundamental requirements for a Java pizza shop application. Depending on your specific needs and the scale of your project, you may need to add additional features or make modifications to suit your business model.

User stories are a helpful way to outline the specific functionalities and features of your Java pizza shop application from the perspective of different users. Here are some user stories for various roles in the application:

## User Stories:
### Customer User Stories:
1. As a customer, I want to be able to create an account and log in so that I can place orders.
2. As a customer, I want to browse the menu and view details about each menu item, including name, description, price, and category.
3. As a customer, I want to add menu items to my shopping cart and see the total cost of my order.
4. As a customer, I want to be able to customize my pizza by choosing toppings, crust type, and size.
5. As a customer, I want to specify my delivery address and payment method when placing an order.
6. As a customer, I want to receive email or SMS notifications about the status of my order, including when it's out for delivery.
7. As a customer, I want the option to save my favorite orders for quick reordering in the future.
8. As a customer, I want to be able to track the location of my delivery driver in real-time.
   
### Admin User Stories:
1. As an admin, I want to be able to add, edit, or delete menu items to update the menu in each store.
2. As an admin, I want to manage user accounts, including customers and staff members.
3. As an admin, I want to view and manage incoming customer orders, including changing order status.
4. As an admin, I want to generate reports on sales by store, popular items, and order history.
5. As an admin, I want to have the ability to assign delivery drivers to orders.
6. As an admin, I want to be able to manage staff members, salery, schedules, work locations

   
### Chef User Stories:
1. As a chef, I want to see a list of orders that need to be prepared, including order details and customer preferences.
2. As a chef, I want to update the status of an order when it's being prepared.
3. As a chef, I want to receive notifications when a new order is received.
   
### Delivery Driver User Stories:
1. As a delivery driver, I want to view a list of orders that need to be delivered.
2. As a delivery driver, I want to accept or reject a delivery assignment.
3. As a delivery driver, I want to receive notifications about new delivery assignments.
4. As a delivery driver, I want to update the order status when I'm out for delivery and when the order has been delivered.
   
### Wait Staff User Stories:
1. As wait staff, I want to log in to the application to access my serving responsibilities.
2. As wait staff, I want to view a list of tables with their current occupancy status.
3. As wait staff, I want to assign customers to available tables and record the number of guests in each party.
4. As wait staff, I want to take food and drink orders from customers at their tables.
5. As wait staff, I want to customize orders based on customer preferences or dietary restrictions.
6. As wait staff, I want to send orders to the kitchen for preparation.
7. As wait staff, I want to split checks for a table with multiple guests, apply discounts, and calculate the total bill.
8. As wait staff, I want to process payments, including cash and credit card payments, and provide change if necessary.
9. As wait staff, I want to keep track of table turnover and ensure that tables are cleaned and ready for the next party.
10. As wait staff, I want to communicate with the kitchen to inquire about order status or request special preparations.
11. As wait staff, I want to provide excellent customer service by addressing customer inquiries and special requests.
12. As wait staff, I want to have access to customer order history and preferences to offer personalized service.

These user stories provide a starting point for developing your Java pizza shop application. You can further break down these stories into smaller tasks and prioritize them based on your project's requirements and deadlines. Agile methodologies like Scrum can help manage and prioritize these user stories during the development process.


## Database Structure

### Tables

1. **Pizza Menu**

   - `id` (Primary Key)
   - `name` (e.g., Margherita, Pepperoni)
   - `description` (Description of the pizza)
   - `price` (Price of the pizza)
   - `category` (e.g., Vegetarian, Meat Lovers)

2. **Customers**

   - `id` (Primary Key)
   - `name` (Customer's name)
   - `email` (Customer's email address)
   - `phone` (Customer's phone number)
   - `address` (Customer's default delivery address)

3. **Customer Orders**

   - `id` (Primary Key)
   - `customer_id` (Foreign Key, references Customers)
   - `order_date` (Date and time the order was placed)
   - `status` (e.g., Pending, In Progress, Delivered)
   - `total_price` (Total price of the order)

4. **Order Items**

   - `id` (Primary Key)
   - `order_id` (Foreign Key, references Customer Orders)
   - `pizza_id` (Foreign Key, references Pizza Menu)
   - `quantity` (Quantity of a specific pizza in the order)
   
5. **Staff Members**

   - `id` (Primary Key)
   - `name` (Staff member's name)
   - `role` (e.g., Chef, Delivery Driver)
   - `shift` (e.g., Morning, Evening)

### Relationships

- Each `Customer Order` is associated with a `Customer` who placed the order (via `customer_id`).
- `Order Items` are linked to a specific `Pizza` from the `Pizza Menu` (via `pizza_id`) and an order (via `order_id`).
- `Staff Members` can be associated with specific orders based on their roles (e.g., chefs preparing orders or delivery drivers fulfilling them).

This database structure allows you to store and manage information about pizzas, customers, customer orders, order items, and staff members efficiently. It also establishes relationships that help in tracking and processing orders in your pizza shop application.

