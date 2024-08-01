
# Object Oriented Programming Lab

Welcome to the Object Oriented Programming Lab repository! This repository contains implementations of various object-oriented programming concepts using Java. Whether you're a beginner looking to learn or an experienced developer seeking reference implementations, you've come to the right place.

## Cheat Sheet 😉

<a target="_blank" href="https://quickref.me/java">Java Cheat Sheet</a>

<div>
<h2><span> <img src="https://github.com/abhraneel2004/MAKAUT_3rdSem_DSA_AOT/assets/115551450/6725a58a-baaa-467d-9069-35aab3f3bef6" style="width: 3%;"> Using Replit</h2> </span>
</div>

# Step-by-Step Guide: How to Use Java in Replit.com

Replit.com is a powerful online IDE that allows you to write, run, and share code directly in your browser. Follow these steps to use Java in Replit.

## Step 1: Create a New Repl

1. **Visit Replit:** Open your web browser and go to [Replit.com](https://replit.com).
2. **Log In/Sign Up:** If you don't have an account, sign up for one. If you do, log in.
3. **Start a New Repl:** Click the `+ Create` button on the top left of the dashboard.

## Step 2: Select the Java Template

1. **Choose Template:** In the "Create a new Repl" window, type "Java" in the search bar.
2. **Select Java:** Click on the "Java" template.

## Step 3: Set Up Your Project

1. **Name Your Repl:** Enter a name for your project in the "Title" field.
2. **Create Repl:** Click the `Create Repl` button.

## Step 4: Write Your Java Code

1. **Open the Main Class:** In the Replit IDE, you will see a file named `Main.java` opened by default.
2. **Edit the Code:** Write your Java code in the `Main.java` file. For example, you can start with a simple program:
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```
3. **Save Your Work:** Replit automatically saves your changes, but you can manually save them by clicking `Ctrl + S` or using the save button.

## Step 5: Run Your Java Program

1. **Run the Program:** Click the `Run` button at the top of the screen. This will execute your `Main.java` program.
2. **View Output:** The output of your program will be displayed in the console at the bottom of the screen.

## Step 6: Explore and Share

1. **Explore:** Feel free to explore more features of Replit, such as version control, collaborative coding, and more.
2. **Share Your Repl:** You can share your project by clicking the `Share` button and copying the link to share with others.

## Example Program

Here's an example of a simple Java program that calculates the factorial of a number:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }
}
```

## Running the Example Program

1. **Copy the Program:** Copy the above program into your `Main.java` file.
2. **Run the Program:** Click the `Run` button to execute the program.
3. **Input a Number:** When prompted, enter a number to see its factorial.

---

By following these steps, you can easily write and execute Java programs using Replit.com. Happy coding!

<div>
<h2><span> <img src="https://github.com/abhraneel2004/MAKAUT_3rdSem_DSA_AOT/assets/115551450/6725a58a-baaa-467d-9069-35aab3f3bef6" style="width: 3%;"> Installation and Setup on Local Machine</h2> </span>
</div>

### 1. Install Java

Make sure you have Java installed. You can install it using the following steps:

#### For Windows:
1. **Download Java:** Go to the [Java SE Development Kit (JDK) download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and download the installer for Windows.
2. **Install Java:** Run the downloaded installer and follow the instructions to install Java.

#### For macOS:
1. **Download Java:** Go to the [Java SE Development Kit (JDK) download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and download the installer for macOS.
2. **Install Java:** Run the downloaded installer and follow the instructions to install Java.

#### For Linux:
1. **Update package list:** Open your terminal and run:
    ```bash
    sudo apt-get update
    ```
2. **Install Java:** Run the following command to install the default JDK:
    ```bash
    sudo apt-get install default-jdk
    ```

### 2. VS Code (Optional)

Download and install [Visual Studio Code](https://code.visualstudio.com/). This repository is configured with a `.vscode` folder containing useful settings for your coding environment.

<div>
<h2><span> <img src="https://github.com/abhraneel2004/MAKAUT_3rdSem_DSA_AOT/assets/115551450/1c115655-468b-442b-a379-a571ded16107" style="width: 3%;"> Running the Code</h2> </span>
</div>

Navigate to the specific directory of the code you want to run and use the following commands:

```bash
# Compile the Java program
javac Main.java

# Run the Java program
java Main
```

Replace `Main.java` with the name of your Java file.

<div>
<h2><span> <img src="https://github.com/abhraneel2004/MAKAUT_3rdSem_DSA_AOT/assets/115551450/7c437a5b-2f8e-426a-bf5a-290ad2c3d99a" style="width: 3%;"> Contributing</h2> </span>
</div>

We welcome contributions from the community! To contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature-name`.
3. Make your changes and commit them with a descriptive commit message.
4. Push your changes to your fork: `git push origin feature-name`.
5. Open a pull request to the main repository.

Below is an explanation of the commands for forking and contributing to a GitHub repository:

<div>
<h2><span> <img src="https://github.com/abhraneel2004/MAKAUT_3rdSem_DSA_AOT/assets/115551450/ec813301-09b4-4c04-9730-b84df7f2fbd3" style="width: 3%;"> Forking the Repository</h2> </span>
</div>

1. **Fork the repository:** Click the "Fork" button at the top right of the repository page. This creates a copy of the repository in your GitHub account.

   ![Forking](gifs/fork.gif)

2. **Clone your forked repository:** Open your terminal and run the following command to clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/repository.git
   ```

   Replace `your-username` with your GitHub username and `repository` with the name of the repository.

   ![Clone](gifs/clone.gif)

## Contributing

1. **Create a new branch:** Move into the repository directory and create a new branch for your feature or bug fix:

   ```bash
   cd repository
   git checkout -b feature-name
   ```

   Replace `feature-name` with a descriptive name for your contribution.

   ![Branch](gifs/branch.gif)

2. **Make your changes:** Modify the code, add new features, or fix bugs. Once done, stage and commit your changes:

   ```bash
   git add .
   git commit -m "Description of changes"
   ```

   Replace "Description of changes" with a concise and descriptive commit message.

   ![Commit](gifs/commit.gif)

3. **Push to your fork:** Push your changes to your forked repository on GitHub:

   ```bash
   git push origin feature-name
   ```

   Replace `feature-name` with the name of your branch.

   ![Push](gifs/push.gif)

4. **Create a Pull Request (PR):** Go to the GitHub page of your forked repository. GitHub will detect the recent push and display a "Compare & pull request" button. Click on it to create a new
