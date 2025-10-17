# 🦁 Zoo Management System

> A comprehensive Java project exploring Object-Oriented Programming concepts through a zoo management system

![Java](https://img.shields.io/badge/Java-8+-orange?style=for-the-badge&logo=java)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Learning-green?style=for-the-badge)

---

## 📚 About This Project

This repository contains the complete journey of learning **Java fundamentals and Object-Oriented Programming** through building a zoo management system. From basic concepts to advanced OOP principles, each branch represents a progression in understanding Java development.

### 🎯 Learning Objectives

Throughout this course, we explored:

- ✅ **Notions de Base de Java** - Java fundamentals and syntax
- 🔒 **Encapsulation** - Data hiding and access modifiers
- 🧬 **Héritage** - Inheritance and class hierarchies
- 🎭 **Polymorphisme** - Method overriding and dynamic binding

---

## 🌳 Repository Structure

This repository is organized into **2 main branches**, each representing different stages of the learning process:

### 📌 Branch 1: `steps/prosit1`
**Foundation & First Steps**

The initial branch where we created the foundation of our zoo system:
- `ZooManagement` class - Core management functionality
- Basic Java concepts implementation
- Introduction to classes and objects

```bash
git checkout steps/prosit1
```

### 📌 Branch 2:  `steps/prosit2`
**Complete Zoo System**


```
📦 gestionszoo
├── 🐾 entities/
│   ├── Animal.java          # Base animal class
│   ├── Aquatiques.java      # Aquatic animals
│   ├── Dolphin.java         # Dolphin implementation
│   ├── Penguin.java         # Penguin implementation
│   ├── Terrestrial.java     # Land animals
│   └── Zoo.java             # Zoo management
└── 🎮 main/
    └── Main.java            # Application entry point
```

```bash
git checkout steps/prosit2
```

---

## 🎨 Key Concepts Demonstrated

### 1️⃣ Encapsulation 🔒
```java
// Private attributes with public getters/setters
private String name;
private int age;

public String getName() { return name; }
public void setName(String name) { this.name = name; }
```

### 2️⃣ Héritage 🧬
```java
// Animal as parent class
public class Animal { ... }

// Specialized animal types
public class Aquatiques extends Animal { ... }
public class Terrestrial extends Animal { ... }
```

### 3️⃣ Polymorphisme 🎭
```java
// Method overriding
@Override
public void swim() {
    // Dolphin-specific swimming
}

// Dynamic binding
Animal myAnimal = new Dolphin();
myAnimal.swim(); // Calls Dolphin's swim method
```

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE
- Basic understanding of programming concepts

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/JasGLe/Java_prosit_20252026
   cd Java_prosit_20252026
   ```

2. **Switch between branches**
   ```bash
   # For initial version
   git checkout steps/prosit1
   
   # For complete version
   git checkout steps/prosit2
   ```

3. **Open in IntelliJ IDEA**
    - File → Open → Select project folder
    - Wait for indexing to complete
    - Right-click on `Main.java` → Run

### Running the Project

```bash
# Compile
javac tn/esprit/gestionzoo/main/Main.java

# Run
java tn.esprit.gestionzoo.main.Main
```

---

## 🐘 Class Overview

### Animal Class Hierarchy

```
                    Animal
                      |
        +-------------+-------------+
        |                           |
   Aquatiques                 Terrestrial
        |                           |
   +----+----+                     ...
   |         |
Dolphin   Penguin
```

### Core Classes

| Class | Description | Key Features                          |
|-------|-------------|---------------------------------------|
| `Animal` | Base class for all animals | Name, age, family, isMammal           |
| `Aquatiques` | Aquatic animals | Habitat (sea/river)           |
| `Dolphin` | Dolphin species | Swimming speed                        |
| `Penguin` | Penguin species | Swimming depth capabilities           |
| `Terrestrial` | Land animals | Number of legs                        |
| `Zoo` | Zoo management | Animals collection, capacity management |

---

## 💡 What I Learned

### Technical Skills
- ✨ Java syntax and best practices
- 🏗️ Object-oriented design patterns
- 📦 Package organization and modularity
- 🔍 Access modifiers and visibility
- 🎯 Inheritance hierarchies
- 🔄 Polymorphic behavior

### Soft Skills
- 📝 Code documentation
- 🗂️ Project structure organization
- 🔀 Version control with Git
- 🤔 Problem-solving through OOP

---

## 🎓 Course Progress

- [x] Prosit 1: Basic Java & ZooManagement
- [x] Prosit 2+: OOP Concepts Implementation
- [x] Encapsulation mastery
- [x] Inheritance implementation
- [x] Polymorphism application

---

## 🤝 Contributing

This is a learning project, but suggestions and improvements are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/FEATURE`)
3. Commit your changes (`git commit -m 'Feature: ..'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📝 License

This project is created for educational purposes as part of a Java programming course.

---

## 👨‍💻 Author

**Your Name**
- GitHub: [@Jasser_Yahyaoui](https://github.com/JasGLe)
- Email: jasser.yahyaoui@esprit.tn

---

## 🙏 Acknowledgments

- Thanks to my instructor for the comprehensive Java course
- The Java community for extensive documentation

---

<div align="center">

### ⭐ Star this repository if you found it helpful!

**Made with ❤️ and ☕ while learning Java**

</div>