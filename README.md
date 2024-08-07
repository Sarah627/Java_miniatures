# Java Miniatures

Java Miniatures is a comprehensive repository dedicated to honing Java programming skills and delving into software engineering concepts. As a passionate Computer Science graduate aspiring to excel in the field of Software Engineering, I've curated this repository to serve as a platform for my continuous learning journey and to showcase my expertise in Java programming.

## **What the Repository Does:**

The repository encompasses a wide range of **Java topics**, starting from fundamental concepts and progressing towards more advanced **software engineering principles**. Each section of the repository is meticulously crafted to provide clear explanations, code examples, and practical projects, all aimed at deepening understanding and mastery of Java and its application in real-world software development scenarios. The repo will include the fundamental Computer Science topics.

## **Challenges Faced and Future Features:**

Throughout this learning journey, I've encountered various challenges, both technical and conceptual. However, each challenge has served as an opportunity for growth and learning. In the future, I aim to implement additional features such as interactive coding exercises, more extensive project examples, and collaborative learning opportunities to further enhance the repository's utility and effectiveness as a learning resource.

## **Important:**

This repository **IS NOT A ROADMAP FOR LEARNING JAVA** exactly, you can use different arrangement e.g. If you want to learn generics first before knowing about frameworks (e.g.spring boot) it won't cause a problem, I use this repo more likely as a documentation for my programming skills progress, how my code, thinking, experience in using java change over time in addition to aiming to be a good reference in future (ISA) for whom are concerned about learning java and software engineering.

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

<details><summary><strong>Object-Oriented Programming</strong></summary>

1. Objects and Classes
2. Object-Oriented Thinking
3. Inheritance and Polymorphism
4. Exception Handling and Text I/O
5. Abstract Classes and Interfaces</details>

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

<details><summary><strong>Advanced Java Topics</strong></summary>

1. Binary I/O
2. Generics
3. How JVM works
4. Multithreading and Parallel Programming
5. Networking
6. Java Database Programming</details>

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

### **Get-Started** :D 🔥

according to Java Docs official website [Oracle Docs](https://docs.oracle.com/en/java/).

> \'Java is a general-purpose, concurrent, strongly typed, class-based object-oriented programming language'

- #### _**`general puprose`**_ means you can build applications using this language in a wide range of different domains (Desktop applications, client/server applications/ web applications, Enterprise applications).

- #### _**`concurrent`**_ means the ability of the language to execute mulitple processes in the same time. (This is kinda an advanced concrpt for beginners and maybe cs students in first 2 or three semesters)

- #### **_`strongly-typed`_** means the strict attatchment of language syntax to define variabels datatypes. (This will be explained and noticed as we go deep in the language)

- #### **_`class based object oriented`_** means this language structure is based on object oriented concepts and use of classes.

Don't worry **these charactaristics of the language will be more clear as we go down in this repo**

---

<details><summary><H3><strong>Installing JDK</strong><H3></summary>

To get started with java we must install JDK on our local machine, (here, I'm considering you are a beginner or totally newcommer in programming world or even didn't visit virtualization concepts|tools before).

Installing JDK is a **must** it provides the necessary tools and libraries to develop, compile, and run Java applications.

click on the following link [oracle](https://www.oracle.com/eg/java/technologies/downloads/) and install the latest JDK versions on your own device

![screenshot](/images/image.png)

> download and install JDK based on your os and processor acritecture set

### What's JDK?

"**_JDK_**" stands for Java Development Kit, it's the development environment for building java applications, it consists of JVM -_Java Virtual Machine_-, JRE -_Java Runtime Environment_- and development tools like compiler etc.

![JDK](/images/JDK.jpg)

Java is machine independent language or it's more descriptive to refer to it as **platform-independent**; you can run it on any platform, while the JVM is platform-dependent; different JVM is designed for each platform (Linux, Windows, MacOs).

In othwe words, if we have three local devices, each of which has a different platform installed in it e.g.(windows, mac, linux), all is required to install a JVM for each device and the java files can run on any machine of them after compiling it just one time.

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

                java -version

      ![java version on cmd](/images/java%20version.png)

      I have JDK version 17 installed on my own, now we are going to switch it to the new version of JDK

      - we'll repeat the steps of the previous option (editing system environment variables, etc)
      - Check your java version again in cmd (restart it if you didn't close it already)

      _and Voila!_

      ![new jdk version is working well](/images/java%20updated%20jdk%20version.png)

    </details>

---

<details><summary><H3><strong>1. Elementary Programming</strong><H3></summary>

Remember this part mentioned earlier ? [class-based](#class-based-object-oriented-means-this-language-structure-is-based-on-object-oriented-concepts-and-use-of-classes)

> Java is a **class-based object-oriented** programming language

Let's see how this concept was applied!

_*Writing your first Hello world program!*_:-D "programmers' traditional custom"

_prerequisites_ ⚠

> if you didn't install the jdk yet, go to [this part](#installing-jdk) and install it
>
> It's better if you have an IDE, till this point it's not mandatory yet but then it will be as we are not at the age of DOS anymore.

1.  If you don't have an IDE: (note: I won't let you stay lazy forever, you'll have to install it)

    - create a new directory (folder) for your java practice, right-click, new, text document
    - yes, that's it just empty text document, rename this document "HelloWorld.java"
    - open the document, as mentioned before java is class based so to write any instructions they **must be** inside classes, now let's type our first class:

            public class HelloWorld{}

    > public & class are both keywords all written in lower case letters
    >
    > HelloWorld is the name of the class and it must be written in [pascal case](https://www.freecodecamp.org/news/snake-case-vs-camel-case-vs-pascal-case-vs-kebab-case-whats-the-difference/#pascal-case) (the first letter of each word is capital)
    >
    > inside the curly braces `{}` we are going to illustrate our code

    - keywords or reserved words are predefined words in a programming language with a specific use, you can't use them for naming (simply, because the compiler will be confused if it's the word used by the language to identify some order to be executed by the program or it's just a programmer defined variable)

    - every java program should at least have one class, to execute the program we should have a _main method_ (in other words method its name is "main")
    - inside our created class we define the main method as follows:

             public static void main(String[] args){}

      > public, static, void, String are all keywords
      >
      > naming methods using [camelCase](https://www.freecodecamp.org/news/snake-case-vs-camel-case-vs-pascal-case-vs-kebab-case-whats-the-difference/#camel-case) in java if it consists of more than one word other wise all lower case

    - the curly braces `{}` mean block of code, here we write the lines of code that will be executed, their place is after every class, method, control statements, specific keywords e.g. static keyword. They also represent a specific scope (we'll talk about this soon).
    - inside the curly braces of the main method we will print our first hello world

             System.out.println("Hello World!");

      > **Do Not Forget The Semicolon!**
      >
      > any string is enclosed in double quotes
      >
      > System.out.println() is the method we'll use for printing anything on the terminal or console screen to user.

    - to run your program open your cmd `win + R type cmd then enter ↩`, in the same directory, if you cannot navigate to the directory where the java file lies, simply in the address bar of your folder window type cmd as follows:
      ![cmd of the current directory](/images/cmd%20from%20current%20directory.png)

    - inside cmd type `javac {yourfilename.java}` (don't forget the extension)

            javac replacethis.java

    ![cmd](/images/javacompile.png)

    - write the name of the file right with its correct formate or you'll face `error: file not found`

    > **_javac_** stands for java compile, you'll notice that a `.class` file is created on your directory this is the `bytecode`. you compile one time and run the code infinitely.

    - to run the program write `java {yourfilename}` (note here without the extension).

    _and Voila!_

![program run](/images/hellodeveloper.png)

![what does program looks like](/images/firstHelloprogram.png)

you can check the file here in this directory [Hello.java](/Test%20Files%20Elementary/Hello.java) file.

**Now we consider you a real programmer**
![queen's knight](</images/Accolade_by_Edmund_Blair_Leighton%20(1).jpg>)

#### notes about java syntax:

- every programming language has a syntax defines it, simply like grammar in English defines how you form a sentence has context, simmilarly in programming the syntax allows you to write program instructions correct or with a context for the compiler.

- curly braces`{}` define a block of code -in other words **lines** of code- and also define scope.

- yup, just like C language semicolon is the statements terminator `;`

- `//` double slashes for single line comments and `/* comments lines go here */` for multiple lines of comments (for those who are new to programming, comments are setences or lines won't be treated as code or instruction they will be ignored by the compiler, programmers use comments to clarify points about their code, like comments show imcomplete implementation or reference to the original source code or even to clear confusion about the code they wrote)

- java is case sensitive language (you get syntax error if you mistyped a keyword or wrote its letetr capital rather than small or vice versa), e.g.

  > `Public void fun(){...}` --> syntax error (Public is not a keyword)

- parenthesis `()` follow functions names, flow control keywords like for, while, if...etc.

- while square brackets follow 'Array' types `[]` e.g.

  > `String[]` -> indecates array of type String.

- later in advanced java programming we will get familiar with the ArrayList, we will find the angle brackets `<>` follow ArrayLists keyword in which contain the Type of the ArrayList (ArrayList is simply resizable array) e.g.

  > `ArrayList<String>`.

- every java program must have at least one class.

- java program start execution from main method.

- string is enclosed in double quotes while character is enclosed in single quotes.

#### errors types:

- Syntax errors: mistyping, missing puncituation

- Runtime errors: occur while program is actually running if the IDE indeicated a process cannot be carried out or through input errors.

- Logical errors (semantic) -cruel one😈-:
  the code actually works fine but doesn't give you the expected output e.g. you wanted to make simple program that multiply numebrs. now look at the followin code:

  > int x = 2, y = 2;
  >
  > int result = x + y;
  >
  > System.out.println(result); >>>> 4 looks fine nothing wrong, no errors, the result is right :)

  try again making y = 3 instead of 2

  > int x = 2, y = 3;
  >
  > int result = x + y;
  >
  > System.out.println(result); >>> 5 here there is a problem, the code is working fine as no errors appear but wait a minute 😅, a plus " + " sign where inserted instead of " \* " multiplication sign.

  here where the error takes place, it's not in code it workds fine but doesn't give you the expected results, this type of errors are dedicted and corrected using tests we will come to this point later.

for more on errors types here is a useful link [not for new commers](https://www.geeksforgeeks.org/types-of-errors-in-java-with-examples/)
, this is nice introduction to errors [types of erros in java](https://www.scaler.com/topics/types-of-errors-in-java/).

<h3>Dealing with data in Java</h3>

- a variable is used to store data, you can think of variables as where we store values, these values can be numeric, string (group of characetrs), reference, etc.

- basic syntax to declare a variable in java

  > datatype {variable-name} = value;

  - declaring means you announce to your compiler about storage place of name (your variable name) and type (your variable type) and it has to reserve or allocate this amount of memory space.
  - definition is when you assign a value to this identifier or the variable, equal sign `=` is the assignment operator.
  - assignment is right-to-lef operation -**this is super important**-, as you say the value 3 is assigned to variable x of type integer for this statement `int x = 3;` .
  - obviously, we don't have to mention "**not to forget the damn semicolon `;` after each statement you write**", thank you :) .

- naming conventions:

  - camel case.
  - do not start naming a varable with a number
  - you can start your variable name with dollar sign `$` or with underscore `_`.
  - variables cannot be reserverd words, e.g. you cannot name your variable '_static_' gives you syntax error.
  - for clean code early teaching purpose, choose meaningful names for your variables describe them.
  - do not contain spaces in your variable name, keep using camel case if your variable name is more than one word.

- data types:

  - In general they are two types numerical or non-numerical, numerical like integers, floating point or decimal numbers, non-numrical like strings "Hello my name is" or boolean like True or False.
  - In java they are two categories, premitive data types and reference datatypes, they are classified based on how they store data, primitive copies only values while reference hold the address to the value they just copied, if you couldn't understand this no problem it will be clear later.
  - primitive data types are:
    - byte
    - short
    - int
    - long
    - float
    - double
    - boolean
    - char
  - reference data type -the only one you'll use for now- is String (take care of the capital letter).
  - data types tell the compiler how much space to reserve for that variable in memory. ![see this](./images/Java%20data%20types%20sizes%20and%20their%20default%20value.png)

- **note** as variable word declares, its value can be changes during the execution of the program, from this point let's get familiar with constants.

- constants cannot change their value, we declare them using `final` keyword then data type follows final then the constant name, e.g.
  > final float PI = 3.14;
  - Upper case as naming convention for constants.
- **note** you cannot re-declare variable but you can re-assign i, e.g.

  ![redeclaration](./images/redeclaration.png)
  ![definition](./images/definiyion.png)

#### simple operations:

- you can perform simple operations using binary arithmetic operators: `+ , - , * , / , %`

  - 'astrisk' `*` is used for multiplication, 'single slash' `/` is used for division, and `%` is called modulus gives you the remainder, e.g.

    ![remainder](./images//remainder.png)

  - note that `=` means assignment not equality.

#### taking user input

- for taking custom input from user, either from console or keyboard input, we are going to start using classes.

- In java to take user input using three classes: Console, BufferedReader, and Scanner. For now we will deal with Scanner only.

- first of all we need to import the class, so using the keyword `import` we will invoke the `Scanner` class as follows:
  ![import scanner class](./images/Scanner%20Class.png)

  - note that even in import we don't forget the semi colon :) .
    ![import scanner](/images/2023_02_Java-Scanner-Class.jpg)

- Then, we create a new object from Scanner class

  ![creating scanner object](./images/creating%20Scanner%20object.png)

  - we created object of name input of Scanner class using **new** operator.

  ![Scanner class methods](/images/reading%20input%20methods.jpg)

- importing statement is placed before class declaration.

- simple java program takes input from user to calculate the area of a circle:
  you can simply see the file here: [ComputeCircleArea.java](/Test%20Files%20Elementary/ComputeArea.java)

  ![circle area](./images/calculate%20circle%20area.png)

- so, at any point you want to take user input:
  1. `import java.util.Scanner;`
  2. inside main mathod block of code
     `Scanner input = new Scanner(System.in);`
  3. based on what data you want to take, e.g. prompt user to enter integer:
     `int number = input.nextInt();`
     and that's it.

#### Jshell interactive tool as Java REPL (Read, Evaluate, Print, Loop)

- Read-Evaluate-Print Loop (REPL), which evaluates declarations, statements, and expressions as they are entered and immediately shows the results.

- it's an interactive tool for quickly prototyping java code, all without the need for a `public static void main` or the need to compile your code before executing it.

- it's super easy open your cmd or powershell and type jshell

- try simple declaring variable called hello, `var hello = "welcome to jshell"`

![jshell](/images/jshell.png)

- find more on this link [how to use jshell](https://www.infoq.com/articles/jshell-java-repl/)

#### notes:

### First Chapter is Finished!!! :D

</details>

---

<details><summary><H3><strong>2. Control Structure Part 1: (_Selections_)</strong><H3></summary>

In this section you will learn **the way you take decision**.

According to documentation:

> control flow statements, break up the flow of execution by employing decision making, looping, and branching, enabling your program to conditionally execute particular blocks of code.

types of control flow statements:

1. Decision making statements.
2. Iteration (Looping) statements.
3. Branching statements.

in this section we'll talk about **Selections** | **Conditionals** | **Decision Making statements**.

Conditional keywords: `if`, `else`, `else if`,`switch`,`case`,`break`.

#### 1. If statements:

Conditional statement evaluate a (condition) if it's true or false to perform set of instructions:

![if condition](./images/if%20condition.png)

a boolean expression is expression will yeild true or false, e.g. is 4 + 5 = 9? if their sum equal to nine so the answer is yes otherwise no. so, an expression will be given to be evaluated.

now, the question is how to build a conditional:

before anything let's learn about the second category you hear in this guide, **relational operators**:
`==`
`<=`
`>=`
`!=`
`>`
`<`

> note that assignment operator `=` is not the same as `==` equality operator, equality operator mean if the value of smth **equals** some value on the other hand the assignment oeprator assigns value to variable.

Conditionals evaluate boolean expressions, boolean expression are expression expected to have true or false as answer so we are kinda building comparison statments.

![if example](./images/ifexample.png)

it's simply like saying: is dividing 7 by 10 equals 70? if yes please print the result and if not do nothing.

- Checking for alternatives:
  using else if we can check for alternatives, e.g.
  here is a simple program to check if a number is positive or negative or equal to 0:

  ![conditional example](./images/conditionalsexample.png)

- you can find more examples in Test Files Elemntary, e.g. [addition Quiz](./Test%20Files%20Elementary/AdditionQuiz.java)

we can check using `if` then another `if` but what we hit the goal from first time why do we continue checking? that's why we use else if instead of if to skip the rest of conditional statement checking if we already satisfied one.

#### notes:

- any boolean expression is enclosed by parenthesis `()`.
- if by mistake you placed a semicolon after if statement `if ( y == x );` is like doing this: `if ( y == x ){}` means do nothing.
- avoid redundant testing of boolean expression e.g. `if (even == true)` better do this `if (even)`, so if even have a number other than zero it sill evaluate to true or if even a boolean variable it will evaluate to its boolean value.
- avoid equaltiy test to float variables to avoid percision problem of floating point numbers.
- you can simplyfy boolean variable assignment:
  ![dothis](./images/dothis1.png)

now we could build simple conditionals using of, else and if else. What if we want to check two conditions at the same time, can we? actually yes, using compound boolean expressions we can check two conditions at the same time, but first let's get familiar with the logical operators:

`|| OR operator`

`&& AND operator`

`! NOT operator`

`^ XOR operator`

if you are a computer science, or electrical engineering student you are already familiar with thess operators as you took this knowledge in Logic design course -probably it's name nearly like this-, if you or not here's a simple explaination and I'll provide you a link for a video to simplify the concept more:

OR operator `||` check if one of the expressions `at least` is true or both of them.
e.g. `(5+6 == 11 || 5+7 == 11)` evaluates to true because the first expression is true. it will only evaluates to false if both of them are false.

AND operator `&&` check if both of the expressions `must be true` if one of them is false so the whole evaluation of both of them will be false.

NOT operator `!` is to negate any value to oppose any expression in other words: !(expression) means to flip the evaluation value of this expression if it's evaluated to true the not operator will make it false and so on. same when we use `!=` we mean not equal.

XOR operator `^` is used to check if both expressions evaluates to different answers, simply if both of the expression is evaluated to true or both false it return to us false, if they are different (true , false or false , true) return to us true.

we can use DeMorgan's law to best practise these compound boolean expression conditionals

> !(condition1 && condition2) == ! condition1 && ! condition2 using DeMorgan's.

**note** `&&` and `||` are called lazy operator as they perform short circuit concept as if `false && anything` evaluates to false without checking the second expression same in `true || anything` will evaluate to true without checking the second expression.

#### 1. Switch case statements:

we use switch case statements with menu-like -means many choices- problems, e.g. choosing operation to be done on numerical values, based on day of week choosen perform some action:

![switch case flow chart](./images/switch-statement-flowchart-in-java.jpg)

![switch case syntax](./images/Syntax-of-Switch-Case-Stetement-in-C-Programming.jpg)

This is a simple program perform basic operations on the entered numbers:
you can check it from here [switch program](./Test%20Files%20Elementary/Calculator.java)

![switch case example](./images/switchcase%20example.png)

- if `break` is not used, switch will evaluate all other cases, we use default if the expression doesn't match any case.

lastly we will learn about the boolean ternary operator `(boolean expression)? (if true)expression1 : (if false)expression2` this oeprator return exp1 if it evaluates to true and exp if it evaluates to false, e.g. :

![ternaryoperator](./images/ternaryoperator.png)

#### notes:

### Second Chapter is Finished!!! :D

</details>

---

<details><summary><H3><strong>3. Mathematical Functions,Characters, and Strings</strong><H3></summary>

In this section you will learn about some built-in mathematical functions in addition to introducing two data types (Character and String).

let's breakdown the concepts we are going to learn:

- Methods
- Important built-in methods
- example using these methods
- Character datatype
- Operations
- Casting
- String Reference Type
- Important methods for dealing with Strings
- Java String pool

before we go in methods with more details on the next Chapter, we can have quick definition help us to figure out what these block of codes mean.

> Methods can be used to define reusable code and organize and simplify coding, and make code easy to maintain.

We also refer to methods as routines and other words will be mentioned later, for now remember the word "reusable".

note: if you experienced other languages other than java you may find that methods are called functions, but with a programming language which is sticked to Object Oriented concepts you'll find the word 'method' is the convention here.

methods can be:

1. user defined
2. built-in

Before we go deeper in this

### Why do we need methods?

#### Coffee Shop analogy:
![coffeeShop](/images/organizational-structure-of-coffee-shop.jpg)

**Imagine we have the following situation:**

Imagine you run a coffee shop. When customers come in and order coffee, the barista follows specific steps to make the coffee. If you have many customers, repeating these steps for each order can be exhausting and time-consuming


**Here is the ongoing scenario:**

> 1. 10 customers order coffee.
> 2. The barista follows the same steps for each coffee order.

**Identifying the problem:**
steps erpition for every customer in addition to time consumed

**Offered Solution: Introducing a coffee machine**

To improve efficiency, you introduce a coffee machine. The machine has buttons for different types of coffee. Now, the barista simply presses a button, and the coffee machine follows the predefined steps to make the coffee.

**Analogy to Methods:**

* **Without Methods:** The barista repeats the same steps (code) for each customer.
* **With Methods:** The barista uses the coffee machine (method) to make coffee efficiently.

### Java Code Simulation:
#### Without Methods (Exhausting Process)
![withoutmethods](/images/without%20methods.png)

#### With Methods (Effective Process)
![withmethods](/images/without%20methods.png)

### Analysis to what happened:
* **DRY Principle:** By using methods, we encapsulate the repetitive steps of making coffee into a single method makeCoffee. This follows the DRY principle by avoiding repetition of the same code.

* **Built-In vs. User-Defined Methods:** 
  
  **Built-In Methods:** These are like the common coffee machines available in the market. They perform **common** tasks and are part of the **Java Standard Library**. For example, **`System.out.println`** is a built-in method used to print messages to the console.

  **User-Defined Methods:** These are like the custom coffee machine **designed specifically** for your coffee shop. They perform specific tasks defined by the programmer. In our example, **`makeCoffee`** is a user-defined method that encapsulates the steps to make coffee.

For now in this chapter we're going to discuss built-in methods only.
<details><summary><strong>more about built-in functions</strong></summary>

  easy definition for these functions foun on NinjaOne blog:

  > Built-in functions refer to those pre-defined functions that come along with a programming language. They are intrinsic components of the language’s library, ready to be used without requiring any additional installation or importation. These functions have been designed to perform common tasks, thus facilitating efficient and swift coding.

  for short: built-in functions or methods are pre-defined methods in the language library itself which are already implemented for you to perform common tasks.

  now let's getting familiar with them, first of all I prefer to categorize them, so it's easily inside my head to choose the suitable one for the suitable situation:

  We'll use **Math** class for this mission, Math class in java contains all mathematical constants and methods you'll need to use, according to Oracle documentation:

  > The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions. 
</details>

**Built-in Functions in Math Class:**

1. Trignometric Methods
2. Exponential Methods
3. Service Methods (rounding, min-max-abs, random)


1- Trignometric Methods:
| Method | Description |
| ----------- | ----------- |
|  `sin(radians)` | Returns the trigonometric sine of an angle in radians. |
|  `cos(radians)`  | Returns the trigonometric cosine of an angle in radians.|
|  `tan(radians)` | Returns the trigonometric tangent of an angle in radians. |
| `toRadians(degree)` | Returns the angle in radians for the angle in degrees. |
|  `toDegrees(radians)` | Returns the angle in degrees for the angle in radians. |
| `asin(a)` |Returns the angle in radians for the inverse of sine. |
| `acos(a)` | Returns the angle in radians for the inverse of cosine. |
| `atan(a)` | Returns the angle in radians for the inverse of tangent. |

2- Exponential Methods:

| Method | Description |
| ------ | ----------- |
|`exp(x)` |Returns e raised to power of x (ex).|
| `log(x)` | Returns the natural logarithm of x (ln(x) = loge(x)).|
| `log10(x)` | Returns the base 10 logarithm of x (log10(x)).|
| `pow(a, b)`| Returns a raised to the power of b (ab).|
| `sqrt(x)` | Returns the square root of x (2x) for x7 =0.|

3- Service Methods:
  * Rounding Methods
  * The min, max, and abs Methods
  * The random()Method

**Rounding Methods**

The best way to understand rounding methods in Math class in java is by example:

![ciel method](/images/ciel%20method.png)

![floormethod](/images/floor.png)

![rintmethod](/images/rint.png)

![roundmethod](/images/round.png)

**The min, max, and abs Methods**


  * The min and max methods return the minimum and maximum numbers of two numbers

  * The abs method returns the absolute value of the number 
  
Here is a worked example:

![minmaxabs methods](/images/usignminmaxabs%20methods.png)

**The random() Method**

In my own opinion random method is super important in a lot of situations, for example in programs used for making test models, in the preceding chapters and projects you'll figure this out

> This method generates a random double value greater than or equal to 0.0 and less than 1.0

![randomMethod](/images/random.png)

### Simple Application !
![angle between two vectors](/images/Angle-Between-Two-Vectors-01.png)
there is a little application "Calculate Theta value" calculates the value of the angle between any two vectors using dot product
you can take a look on the application here, whereas you can find how can we use **Math Class** built-in functions are used.
[Calculate Theta](/Test%20Files%20Elementary/CalculateTheta.java) 



**For now we addressed the following:**
* **Methods**
* **Important built-in methods**
* **example using these methods**

-----
### Character data type and String reference type:

#### Character Data Type:

Character data type is used to represent single character surrounded by single quotes. `char firstLetter = 'S'`

Caution ⚠

> characters must be surrounded by single qoutes while Strings must be surrounded by double qoutes, thus "S" is a String and 'S' is a character my this is not important in other languages like: Python but here it's essential to differentiate between them as java s a stongly static typed language

If you are not a computer science student or you are not familiar with the idea of how computers deals with data, so expand this section, if you are familiar go to the next points

---
<details><summary><h4>How computers deal with data</h4></summary>

#### How computers deals with data?
You need to know what machine language is. Machine language is the language that computers actually understand. This language consists of 0's and 1's based on the fact that computers, at their core, consist of transistors that can be switched to two states: ON or OFF (1 or 0). From this, the binary system was born.

![zeros and ones](/images/zeros%20and%20ones.jpg)

The processes are carried out in a central processing unit (CPU), which performs the necessary mathematical operations for processing incoming data. It handles all computing tasks required for running the operating system and applications.

![CPU](/images/CPU.jpeg)

Anything represented in a high-level language, like "Human Language," is too complex for computers to understand directly. This is where the role of the CPU and other computing components comes in, translating this data into something understandable to the computer, known as "machine language." 

Similarly, computers don't understand characters directly; they need a translator. This can be a lengthy process that we won't delve into deeply here, but the main idea is conveyed. 

Computers only understand binary data, binary code, or machine language. They represent everything (text, images, sound, etc.) using binary.


Today, no one deals with 0's and 1's directly. This level of operation is abstracted within the computer hardware.

Here are videos will help you so much for understanding the topic:

- [khan academy](https://www.khanacademy.org/computing/computers-and-internet/xcae6f4a7ff015e7d:digital-information/xcae6f4a7ff015e7d:bits-and-bytes/v/khan-academy-and-codeorg-binary-data) : short and informative


- [How computers Actually work](https://youtube.com/shorts/CZY881WyrB8?si=dGyKynD_p2trawy1) : the same
  
- [How computers Actually work -The detailed video- ](https://www.youtube.com/watch?v=5f3NJnvnk7k) : for more details 

A good arcticle about how data is stored and how computers deal with it: [How data is stored in computers](https://www.datarecoveryspecialists.co.uk/blog/how-is-data-in-a-computer-stored)


Since you may not be familiar with computer science, I'll recommend a superior playlist. The videos are relatively short and very informative:  [Crash Course computer science](https://www.youtube.com/playlist?list=PL8dPuuaLjXtNlUrzyH5r6jN9ulIgZBpdo)

- **`note` You can watch this playlist to get an idea of what computer science is and how it has evolved over the decades. It will help you pick up keywords, history, important names, applications, etc. However, it's not for in-depth study.**

- Watch the playlist like your daily series; you'll learn amazing things about this field that has revolutionized humanity in the last decade!

Another one, but this time you cannot just watch and enjoy, also I want to inform its lectures are long, but super informative recommended from almost everyone and it's considered as one of the most common and best introductions to computer science,
CS50 - from Harvard [CS50](https://www.youtube.com/playlist?list=PLhQjrBD2T381WAHyx1pq-sBfykqMBI7V4)

**`Note`: You don't need to master this topic to understand character data types. Just grasp the main idea. If you want to delve deeper into computer science, these playlists and courses are great resources. These playlists take time, and it's okay to keep learning without finishing them first. You can do both in parallel.**

**I address the problem of getting bored due to the huge and often complicated information for the first time to understand. When you get bored and decide to stop, you risk losing out on important knowledge. You may end up with incomplete knowledge about a language that could be crucial for your future job. Instead, you could spend that time learning something enjoyable, like how to bake the perfect cinnabon! 🥯😂**
</details>

----
#### Characters and Encoding

- Computers use binary numbers internally. A character is stored in a computer as a sequence of `0s and 1s.` 
  
- Mapping a character to its binary representation is called `encoding`. (encoding is converting data from one format to another)
  
- There are different ways to encode a character. How characters are encoded is defined by an `encoding scheme`.
  
- Java supports `Unicode`, an encoding scheme established by the Unicode Consortium to support the interchange, processing, and display of written texts in the world’s diverse languages.
  
- Before Unicode, ASCII encoding scheme were used; a standard data-encoding format for electronic communication between computersencoding scheme, it was 7 bits (every bit can represent either one or zero) so it could hold only 128 characters English characters with some puncituation and control features then it was expanded to be 8 bits to hold 256 characters.
  
- other encoding schemes are widely used today like UTF-8 which is algorithmic mapping in addition to providing backward compatibility with ASCII. 
  
### Character Encoding Analogy! Teaching Colors with a Numbered Painting Sketch

**If we want to teach a child how to get used with colors and their names we use the `Numbered Painting Sketch`**
- `Encoding`: in the context of `The Numbered Painting Sketch`, Encoding is like the painting sketch where each sector of the drawing is assigned (encoded to) a unique number (1 for red color, two for green, 21 for mint green, etc).

![numbered painting sketch](/images/Color%20by%20number.jpg)
  
- Just as each sector in the sketch has a number to indicate which color to use, encoding assigns a unique number to each character so that it can be stored and identified correctly.
  
- `encoding schema` or `Unicode`: **The Color Table**
  
  ![color table](/images/Coloring%20Table.jpg)
  
  Unicode is like the color table that shows which number corresponds to which color.

  The table ensures that no matter what color you need, there's a specific number assigned to it.

  Similarly, Unicode assigns a unique code point to every character in every language, ensuring a universal standard.

- `UTF-8`: The Flexible Coloring Kit
  
  UTF-8 is like a coloring kit that adapts to the complexity of the drawing.

  - In the coloring kit: Simple, common colors (like "Red") might be represented by one marker.
  
  - More complex, less common colors might be represented by more markers. 

  - This makes the kit efficient and flexible, capable of handling all sorts of drawings (characters) without wasting resources.
  
  ![blending colors](/images/blending%20colors.jpg)

------
#### **Now we can indroduce the data type :)**

you define the character data type using **`char`** keyword, then give it a name and assign a character value to it.

> **Caution**⚠ don't forget that characters must be surrounded by single quotes **`' '`**.

**Why did we indtroduced the character encoding with all this staff? to understand the following**
 
 ![characetrs](/images/characters.png)


 **Here you can see that character data type can store numeric value and weird code starts with **`\u`** but how?**

 In Java, the char data type can store numeric values, but these values are not interpreted as numbers by Java. Instead, they are treated as their corresponding ASCII or Unicode characters. For example, the character 'a' has an ASCII value of 97. In Unicode, the same character is represented as \u0061. 

 > **`note`** The increment and decrement operators can also be used on char variables to get the next or preceding Unicode character. For example, the following statements display character b:

 ![character operations increment](/images/characterincrement.png)

 > also numerical operations are allowed but you'll get numeric output

 ![char operations](/images/charops.png)

 #### Escape Sequences for Special Characters

 if you know already C you maybe familiar with these characters 

 `Escape characetr` is a character preceded by a backslash `\` is an escape sequence and has special meaning to the compiler.

 from Oracle java tutorial:
 > When an escape sequence is encountered in a print statement, the compiler interprets it accordingly. For example, if you want to put quotes within quotes you must use the escape sequence, \", on the interior quotes. To print the sentence

> She said "Hello!" to me. you would write:


 ![escape sequence](/images/escape%20sequence.png)

|Character|Name|
|-----|----|
|`\b`|**Backspace**|
|`\t`|**Tab**|
|`\n`|**Linefeed**|
|`\f`|**Formfeed**|
|`\r`|**Carriage Return**|
|`\\`|**Backslash**|
|`\"`|**Double Quote**|

**Don't worry if you are not familiar with some terms like "`carriage return`" here is clarification:**

- **`Carriage return`** means to return to the beginning of the current line without advancing downward. (Abbreviated CR)

- **`Linefeed`** means to advance downward to the next line (Abbreviated LF or NL) **`CRLF is used for the pair "\r\n"`**.

- **`Formfeed`** means advance downward to the next "page".
***
#### Casting
Now let's move to new topic (Casting) which will be expanded later when you got familiar with OOP.

> Casting : is a process that converts a variable's data type into another data type, casting may be **implicit** (auto) or **explicit**.

Characters (char) can be converted to numerical data types because characters are internally represented by numeric values according to the Unicode standard, **thus** character data type can be casted into any numeric type and vice versa.

- `note 1`: character data type is `2 bytes` so only the lower 16 bits of data are used when casting from numeric into character

- `note 2`: if you cast a floating number data to character, first the float data will be cated into integer then character

![casting one](/images/character%20casting%20one.png)

When a `char` is cast into a numeric type, the character’s Unicode is cast into the specified numeric type.

![casting two](/images/character%20casting%20two.png)


> **`⚠ note`** Implicit casting can be used if the result of a casting fits into the target variable. Otherwise, explicit casting must be used.

- Each data type reserves different amount of space in memory, so it's important to take this in consideration when casting, char is 2 bytes, boolean is one byte while integer is 4 bytes.

- Two characters can be compared using the relational operators just like comparing two numbers. This is done by comparing the Unicodes of the two characters.
  - for example:
  
   ![comparing characters](/images/comparing%20characters.png)

taking the advantage that we got familiar with built-in functions, let's use the built-in functions which can be used to perform some tests on characters:

|Method|Description|
|---|---|
|`isDigit(ch)` |Returns true if the specified character is a digit.|
|`isLetter(ch)` |Returns true if the specified character is a letter.|
|`isLetterOrDigit(ch)` |Returns true if the specified character is a letter or digit.|
|`isLowerCase(ch)` |Returns true if the specified character is a lowercase letter.|
|`isUpperCase(ch)` |Returns true if the specified character is an uppercase letter.|
|`toLowerCase(ch)` |Returns the lowercase of the specified character.|
|`toUpperCase(ch)` |Returns the uppercase of the specified character.|

**`note`** to use character built-in function, it's like Math class you have to import Character Class as follows:

![Import Character class](/images/import%20Character%20class.png)


Character data type is finished!!!
****

#### String reference type

A `string` is a sequence of characters.

> "Hello, World!" >>> the most popular string ever in programming world!

Strings are enclosed by double quotes `" "`.

> again and again characters are surrounded by single quotes and it's a must or they will be considered as strings 


#### Reference Types in Java
In Java, there are two main categories of data types: **primitive** types and **reference** types.

**`Primitive Types`**: These include `int`, `char`, `boolean`, etc. They store simple values.

**`Reference Types`**: These include objects like **`Strings`**, **`arrays`**, and **`custom classes`**. They store references (or addresses) to the actual data in memory.

In other words, Any class can be used as a `reference type`, and any variable declared using this reference type is called reference variable or an object. 

- For now, the class is like a template and the object is the custom version you make from this template. 
- Objects and Classes will be discussed in details **LATER** :)

So, like **Scanner** class you have to follow the naming convention and capitalize the first letter of the class name: 

     String sentence = "Hello, Developer!"; 

**STRINGS IS A SUPER IMPORTANT TOPIC IN ALMOST ALL AREAS OF  PROGRAMMING**

**SO, KEEP YOUR FOCUS ON THIS TOPIC**

#### String Operations

Now we are going to discuss the most important concepts that are necessary to know about strings:

- How to get the length of a string
- Concatenating Strings
- Trimming Strings
- Find character/s | substring/s in a given string
- Comparing Strings 
- Converting and reading strings as user input.


#### For short this is a table containing all the needed methods to perform the mentioned tasks:

| Method|  Description| 
| ---| ---- |
| `length()`|  Returns the number of characters in this string.| 
| `charAt(index)`|  Returns the character at the specified index from this string.| 
| `concat(s1)`|  Returns a new string that concatenates this string with string s1.| 
| `toUpperCase()`|  Returns a new string with all letters in uppercase.| 
| `toLowerCase()`|  Returns a new string with all letters in lowercase.| 
| `trim()`|  Returns a new string with whitespace characters trimmed on both sides.| 
|`equals(s1)`| Returns true if this string is equal to string s1.|
|`equalsIgnoreCase(s1)`| Returns true if this string is equal to string s1; it is case insensitive.|
|`compareTo(s1)`| Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.|
|`compareToIgnoreCase(s1)`| Same as compareTo except that the comparison is case insensitive.|
|`startsWith(prefix)`| Returns true if this string starts with the specified prefix.|
|`endsWith(suffix)`| Returns true if this string ends with the specified suffix.|
|`contains(s1)`| Returns true if s1 is a substring in this string|

**1- Getting String Length**
- you'll use strings almost for everything, getting a string length is important if you are going to iterate over this string for any task or to check if the returned data is matching from their lengths. 
- an instance method `length()` returns to you the length of the given string.
- **here comes another question, What is an instance method?** 
    - till now, we've passed by static and instance methods, static methods like Math.rint(), Math.sin()... , `length()`method here is the first instance method we meet.
    - regarding mentioninng classes and objects earlier without details, for now instance methods are methods tied to a specific object (relies on specific data) and static methods are methods which are not tied to a specific object they only cling to the class itself that's why you invoke them using the class name itself and not the reference variable (object).
    - clarification: 
      - Think of a school where students and classrooms play important roles:
        - Instance Methods: Imagine each student has their own notebook. The notes in these notebooks are personal and unique to each student. For example, a student's grades or personal notes are tied to that specific student. In the same way, instance methods in a class belong to specific objects (or instances) of that class. These methods can access and modify the instance variables of the object they belong to.
      - 
        ![notebooks](/images/notebooks%20object.jpg)

        - Static Methods: Now, think about the whiteboard in a classroom. The whiteboard is a shared resource that any teacher can use to teach any student. The information on the whiteboard is not tied to any specific student; it can be used by all students collectively. Similarly, static methods belong to the class itself, not to any particular instance. These methods can be called without creating an instance of the class and cannot access instance variables directly. Instead, they work with class-level data.
  
        ![board](/images/classboardstaticmethodexample.jpg)

        - this is the difference noticed when you use static methods of Math class like round(), as rounding number doesn't rely on specific data, but length() from String class is tied to specific object data, in our case here [`sentence`](#string-reference-type) string above, you return the length of this specific string object.
  
you can check this example here about how to use length() method [Check Password Length example](/Test%20Files%20Elementary/CheckingPasswordLength.java)


![checkpassword](/images/CheckingPasswordLength.png)

****

#### Learn by example:

we're going to explain each method and common use cases by examples in addition to clarifying any ambiguity:

- **charAt(index) method**
  
  let's clarify a point, string as mentioned earlier is a sequence of characters, people who already familiar with programming or already tried C/C++ knew that string is an array of characters, each character is indexed.

  The (string variable).charAt(index) method can be used to retrieve a specific character in a string s,where the index is between 0 and (string variable).length()–1.

  > **`note`** ⚠ a coomon programming error **"StringIndexOutOfBoundsException."** if you tried to access character which is our of array bounds as we count from zero, so charAt(string.length()) will expose you to this error :) 


       String message = "Welcome to Java";
      
       System.out.println(message.length());


  ![java indexed string](/images/string%20example.png)


<details><summary><strong>To Someone Totally New to Programming<strong></summary>

  - Imagine you have a row of lockers, and each locker has a number on it, starting from 0. These numbers help you find and open a specific locker quickly.

  - A string is like a row of lockers, but instead of holding things, it holds characters (letters, numbers, symbols, etc.). Each character in the string has a number called an index, which tells you its position in the row.

  For example, in the string "Hello":

  - The first character 'H' is at index 0
  - The second character 'e' is at index 1
  - The third character 'l' is at index 2
  - The fourth character 'l' is at index 3
  - The fifth character 'o' is at index 4
  
  So, if you want to find or use a specific character, you can refer to its index number, just like you'd find a specific locker by its number.



  > ⚠ **`note`** in programming by default we count from 0 index

</details>

example on using charAt(index) method: [email validation](/Test%20Files%20Elementary/CheckingEmailElgibility.java)


![charAt()](/images/emailvalidation.png)

- **concat(s1) method**:
  
  concatenation is one of the most important concepts you need to learn about strings, concatenation means merging two strings together <3

  concatenation is acheived using multiple ways, one shortcut is by using plus sign '+' between two strings as follows:

        String name = "Sarah";
        String greeting = "Hello, " + name;
        System.out.println(greeting);
        //prints >>> Hello, Sarah 
  also `+=` operator can be used with strings:

         String studentsNames = "";  //empty string
         studentsNames += input.next();
         // enetrs Mariam 
         System.out.println(studentsNames);
         // prints Mariam as the empty string is concatenated with the user input "Mariam"

  using s2.concat(s1) method:

        String spongepopFandomgreeting = "Hi Hi,"; 
        String name = "Captain";
        spongepopFandomgreeting = spongepopFandomgreeting.concat(name);
        System.out.println(spongepopFandomgreeting);
        //prints Hi Hi, Captain

  > `note` the reassignment happened above with `spongepopFandomgreeting` because the method concat(s1) returns a string so it must be stored in string variable or update an existing string variable.

  you can concatenate strings with any data type resulting a new string with all the concatenated values

  ![string concatenation](/images/concatenateStrings.png)


- **trim(), toUpperCase(), toLowerCase() methods**:

   The `toLowerCase()` method returns a new string with all lowercase letters, and the `toUpperCase()` method returns a new string with all uppercase letters. For example:

        String convertToLower = "Welcome".toLowerCase(); // returns a new string **welcome**.
        String convertToUpper ="Welcome".toUpperCase(); //returns   a new string **WELCOME**.

  The `trim()` method returns a new string by eliminating whitespace characters from both ends of the string. The characters `' '`, `\t`, `\f`, `\r`, or `\n` are known as **whitespace** characters. For example,
       
        String trimmedSentence = "\t Good Night \n".trim(); //returns a new string Good Night.
  
- **equals(s1) & equalsIgnoreCase(s1) methods**:

take a look on the next two examples:

![example using == operator](/images/strings%20comparison%20using%20equality%20operator.png)

![example using equals() method](/images/equality%20method%20for%20strings.png)

What Happened?

introducing a new concept: String pool in heap:





















  




  






  
















</details>
