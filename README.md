File Handling: Word Counter
This is the second project in my Java Development internship with CodVeda. This application demonstrates essential Java file handling skills by reading from one text file, processing the content, and writing the result to another file.

The program reads a text file, counts the number of words, and then writes the final word count to a separate output file. It also includes robust exception handling to ensure the application doesn't crash if the input file is not found.

Key Concepts and Features
File I/O: The program uses Java's built-in I/O classes (FileReader, FileWriter, BufferedReader) to efficiently read from and write to text files.

Exception Handling: The code uses a try-catch block to handle potential IOException and FileNotFoundException, making the application more resilient.

String Manipulation: It processes the file content by splitting each line into words based on whitespace.

How to Run
Create Files: Make sure you have a text file named input.txt in the same directory as the Java code. This file should contain the text you want to count.

Save the Code: Save the provided Java code as WordCounter.java.

Compile: Open your terminal, navigate to the project directory, and compile the code.

Bash

javac WordCounter.java
Run: Execute the compiled program.

Bash

java WordCounter
After running, a new file named output.txt will be created in the same directory, containing the total word count.

Project Structure
WordCounter.java: The main Java source file containing the logic for reading, processing, and writing files.

input.txt: The input file from which the program reads data.

output.txt: The output file where the program writes the final word count.
