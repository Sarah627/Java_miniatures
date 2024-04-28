# Java Miniatures

Java Miniatures is a comprehensive repository dedicated to honing Java programming skills and delving into software engineering concepts. As a passionate Computer Science graduate aspiring to excel in the field of Software Engineering, I've curated this repository to serve as a platform for my continuous learning journey and to showcase my expertise in Java programming.

## **What the Repository Does:**

The repository encompasses a wide range of **Java topics**, starting from fundamental concepts and progressing towards more advanced **software engineering principles**. Each section of the repository is meticulously crafted to provide clear explanations, code examples, and practical projects, all aimed at deepening understanding and mastery of Java and its application in real-world software development scenarios. The repo will include the fundamental Computer Science topics.

## **Challenges Faced and Future Features:**

Throughout this learning journey, I've encountered various challenges, both technical and conceptual. However, each challenge has served as an opportunity for growth and learning. In the future, I aim to implement additional features such as interactive coding exercises, more extensive project examples, and collaborative learning opportunities to further enhance the repository's utility and effectiveness as a learning resource.

<details>
<summary> <H1>Table of Contents</H1></summary>

<details>
<summary> <H3>Part One : Pick up your weapon !</H3></summary>

<details><summary><strong>Java Basics</strong></summary>

1. Elementary Programming
2. Control Structure Part 1: (_Selections_)
3. Mathematical Functions,Characters, and Strings
4. Control Structure Part 2: (_Iterators_)
5. Methods
6. Arrays
</details>

<details><summary><strong>Java in Action</strong></summary>
1. Build tools

- Ant
- Maven
- Gradle

2. building GUI

- JavaFX
- Java Swing

3. Web Frameworks

- Spring
- Springboot

4. ORM

- JPA
- Hibernate

</details>

<details><summary><strong>Object-Oriented Programming</strong></summary>

1. Objects and Classes
2. Object-Oriented Thinking
3. Inheritance and Polymorphism
4. Exception Handling and Text I/O
5. Abstract Classes and Interfaces</details>

<details><summary><strong>Advanced Java Topics</strong></summary>

1. Binary I/O
2. Generics
3. Multithreading and Parallel Programming
4. Networking
5. Java Database Programming</details>

<details><summary><strong>Data Structures</strong></summary>

1. Recursion
2. Stacks & Queues
3. Lists
4. Trees
5. Priority Queues
6. Maps & Hash Tables
7. Search Trees</details>

<details><summary><strong>Algorithms</strong></summary>

1. Asymptotic analysis
2. Sorting
3. Searching
4. Graphs
5. Strings</details>
</details>

<details><summary><H3>Part Two: Software Engineering Principles</H3></summary>

1.  OOA & OOD
2.  SOLID Principles
3.  Design Patterns
4.  Refactoring Techniques
5.  Software Development Methodologies
</details>

<details><summary><h3>Part Three: Projects</h3></summary>

1. Small-scale Java Projects
2. Medium-scale Software Engineering Projects
3. Real-world Application Examples</details>

<details><summary><H3>Cross-Part knowledge</H3></summary>

**_Challenges and Exercises_**

- Coding Challenges
- Problem-solving Exercises
- Algorithm Implementations

**_Resources_**

- Online Tutorials and Courses
- Recommended Books
- Useful Articles and Videos

**_Contributions_**

- How to Contribute
- Guidelines for Contributors
- Community Engagement Opportunities</details>
</details>

---

## Part One : 1 - Java Basics

### **Get Started** :D 🔥

according to Java Docs official website [Oracle Docs](https://docs.oracle.com/en/java/).

> \'Java is a general-purpose, concurrent, strongly typed, class-based object-oriented programming language'

- _**general puprose**_ means you can build applications using this language in a wide range of different domains.

- _**concurrent**_ means the ability of the language to execute mulitple processes in the same time

- **_strongly-typed_** means the strict attatchment of language syntax to define variabels datatypes

- **_class based object oriented_** means this language structure is based on object oriented concepts and use of classes

Don't worry **these charactaristics of the labguage will be more clear as we go in this repo**

### **Installing JDK**

click on the following link [oracle](https://www.oracle.com/eg/java/technologies/downloads/) and install the latest JDK versions on your own device

![screenshot](/images/image.png)

download and install JDK based on your os and processor acritecture set

"**_JDK_**" stands for Java Development Kit, it's the development environment for building java applications, it consists of JVM -_Java Virtual Machine_-, JRE -_Java Runtime Environment_- and development tools like compiler etc.

Java is machine independent language or it's more decriptive to refer to it as platform-independent; you can run it on any platform, while the JVM is platform-dependent; different JVM is designed for each platform (Linux, Windows, MacOs).

Once you downloaded the latest version of JDK here you have two options:

1.  if it's your first time downloading

    > you need to edit system environment variables first

    These instructions for windows users only ⚠:

    - open your Program Files directory navigate till you find the jdk directory
    - open the bin directory then copy its path
      ![path image](/images/path%20image.png)
    - press win key on your kewboard ⌨ then type in search bar down edit system environment variables
    - click on Evironment Variables, from user variables choose path then click on edit
    - on path window click add new, then paste the path you copied earlier and press enter
    - click on move up to make it on the top of the list and voila!

2.  if you've already installed earlier JDK version

    - open your cmd(win key, type cmd | win key + R then type cmd)
    - write the following:

      > `java -version`

    ![java version on cmd](/images/java%20version.png)

    I have JDK version 17 installed on my own, now we are going to switch it to the new version of JDK

    - we'll repeat the steps of the previous option (editing system environment variables, etc)
    - Check your java version again in cmd (restart it if you didn't close it already)

    _and Voila!_

    ![new jdk version is working well](/images/java%20updated%20jdk%20version.png)
