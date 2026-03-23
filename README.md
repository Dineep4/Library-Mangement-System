# 📚 Java Library Management System 

## 🚀 Project Overview

The **Java Library Management System** is a desktop-based application developed using **Java Swing (GUI)** and **MongoDB**.
It allows users to manage library operations such as adding and viewing books through an interactive graphical interface.

This project demonstrates **Object-Oriented Programming (OOP)** concepts, database integration, and GUI development.

---

## ✨ Features

* 📖 Add new books to the library
* 🔍 View all available books
* 💾 Data stored in MongoDB database
* 🖥️ Interactive GUI using Java Swing
* ⚡ Real-time data updates

---

## 🛠️ Technologies Used

* **Java (JDK 17+/26)**
* **Java Swing (GUI Development)**
* **MongoDB (Database)**
* **MongoDB Java Driver (JAR files)**

---

## 📂 Project Structure

```
Library-Management-System/
│── src/
│   ├── LibraryUI.java          # Main UI (Entry Point)
│   ├── BookService.java        # Business logic (CRUD operations)
│   ├── MongoDBConnection.java  # Database connection
│
│── lib/                        # MongoDB driver JAR files
│── .gitignore
│── README.md
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/Dineep4/Library_Mangement-System.git
cd Library-Management-System
```

---

### 2️⃣ Install Requirements

* Install **Java JDK (17 or above)**
* Install **MongoDB Community Server**
* Install **MongoDB Compass (optional UI)**

---

### 3️⃣ Add MongoDB Driver

Download and add these JAR files to `lib/`:

* `mongodb-driver-sync`
* `mongodb-driver-core`
* `bson`

---

### 4️⃣ Run MongoDB

Make sure MongoDB is running:

```
localhost:27017
```

---

### 5️⃣ Run the Application

Open project in IntelliJ and run:

```
LibraryUI.java
```

---

## 🖥️ Application UI

* Add Book → Opens input dialog
* View Books → Displays formatted book list
* Exit → Closes application

---

## 📊 Sample Data Format

```
Title: Java Programming
Author: James Gosling
Quantity: 5
```

---

## 📌 Future Enhancements

* 📊 Table-based UI (JTable)
* 🔄 Issue & Return Book system
* ❌ Delete Book feature
* 👤 User/Admin authentication
* 🎨 Advanced UI styling (Dark Mode)

---

## 👨‍💻 Author

**Dineep B**
B.Tech CSE (AI & ML)
VNR Vignana Jyothi Institute of Engineering and Technology

---

## ⭐ GitHub

If you like this project, give it a ⭐ on GitHub!

---
