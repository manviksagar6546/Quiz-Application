<video src="Quizapplication.mp4" controls width="800"></video>

# 🧠 Quiz Application (Core Java)

A simple **console-based Quiz Application** built using **Core Java** to practice programming fundamentals by solving a real-world problem.

Instead of only revising theory, this project focuses on applying core Java concepts such as Object-Oriented Programming (OOP), arrays, loops, methods, constructors, and user input to create a functional application.

This project is part of my **"Back to Basics"** journey, where I'm strengthening my Java fundamentals and improving my logical thinking by building small projects from scratch.

---

## 📌 Features

* Interactive command-line quiz
* Multiple-choice questions
* Accepts user input using `Scanner`
* Calculates the final score automatically
* Displays the correct answers after quiz completion
* Simple and clean object-oriented design

---

## 🛠️ Technologies Used

* Java
* IntelliJ IDEA
* Git & GitHub

---

## 📚 Core Java Concepts Practiced

This project helped reinforce the following concepts:

* Object-Oriented Programming (OOP)
* Classes & Objects
* Constructors
* Encapsulation
* Arrays
* Loops (`for`, enhanced `for`)
* Conditional Statements (`if`)
* Methods
* User Input using `Scanner`
* Business Logic Implementation

---

## 📂 Project Structure

```text
Quiz-Application/
│
├── Main.java
├── Question.java
└── QuestionService.java
```

---

## 📖 How the Application Works

### 1. `Question.java`

This class acts as the **model** of the application.

Each `Question` object stores:

* Question ID
* Question Text
* Four Options
* Correct Answer

It uses private fields with getters to follow the principle of **Encapsulation**.

---

### 2. `QuestionService.java`

This class contains all the business logic.

Responsibilities include:

* Creating quiz questions
* Displaying questions one by one
* Accepting user responses
* Storing selected answers
* Comparing answers
* Calculating the final score
* Displaying the correct answers

---

### 3. `Main.java`

This is the entry point of the application.

It simply creates a `QuestionService` object and calls the required methods in sequence:

1. Start the quiz
2. Calculate the score
3. Display the correct answers

This keeps the `Main` class clean while all business logic remains inside the service class.

---

## ▶️ Sample Output

```text
Question No. 1
What is the size of int?

A. 4 bytes
B. 2 bits
C. 8 bytes
D. 2 bytes

Choice: A

Question No. 2
...

Your Score : 3

Correct Answers:
Question 1 : A
Question 2 : C
Question 3 : A
```

---

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/manviksagar6546/Quiz-Application.git
```

### Navigate to the Project

```bash
cd Quiz-Application
```

### Compile the Project

```bash
javac *.java
```

### Run the Application

```bash
java Main
```

---

## 🎥 Video Explanation

Watch the complete project explanation and live coding session on YouTube:

**📺 YouTube:**
https://www.youtube.com/watch?v=YOUR_VIDEO_ID

---

## 🔮 Future Improvements

I plan to enhance this project by adding:

* More quiz questions
* Randomized questions
* Difficulty levels
* Timer for each question
* Reading questions from a file or database
* Score history
* JavaFX GUI version
* Spring Boot REST API
* React frontend

---

## 🎯 Why I Built This Project

As I continue learning software development, I realized that strong fundamentals are essential for writing better code and solving problems efficiently.

This project is one step in my journey of revisiting **Core Java** by building practical applications instead of only reading documentation or watching tutorials.

---

## 👨‍💻 Author

**Manvik Sagar**

If you found this project helpful or interesting, feel free to ⭐ star the repository and connect with me on LinkedIn.

Happy Coding! 🚀
