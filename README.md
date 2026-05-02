# Basic Java

Basic Java practice programs and small projects.

## Folder Structure

```text
Basic-java/
├── condition/       # Java programs using conditional logic
├── loop/            # Java programs using loops and patterns
├── project/         # Small Java project files
│   ├── lib/         # External JAR dependencies
│   └── src/         # Project source code
├── src/             # Standard source folder for future Java code
│   ├── main/java/
│   └── test/java/
├── docs/            # Documentation
├── scripts/         # Helper scripts
├── .gitignore
└── README.md
```

## Run a Java File

From the repository root:

```bash
javac condition/GradeProgram.java
java -cp condition GradeProgram
```

Replace `condition/GradeProgram.java` with the file you want to run.

## Push to GitHub

```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
git push -u origin main
```
