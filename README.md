# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project]
https://docs.google.com/drawings/d/1aqTOASGztQHCcx9AUbgjYKX4CA3mhFO1nEySStYT0uk/edit?usp=sharing
## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

I made a boba store because I love boba drinks and I thought it would be fun to make a buisness out of it. I represented the boba drink from my store through each class, bobadrink, smoothie, and milk tea, that have instance variables that store the state of an object. These instance variables are declared as private for encapsulation, so they can't be accessed from outside the class, but the accesor and mutator methods allow access to the variables. They each have a non-arguement constructor  that intializes the object with default values and parameterized constructors that accept formal parameters which allows the user to create instances with specific value. The accessor methods such as getPrice() return values, allows the external code to read the state of an object and print it out. The user will interact with my store by providing responses from the questions asked such as the type of drink they want, the price of the drink, the flavor, etc.... The program expects responses from these questions, so for the type of drink, it would expect an answer of a smoothie or milk tea. This would used to output information as the program will generate the order receipt that will print out the user's choices.