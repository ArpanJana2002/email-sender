
# 📧 Gmail SMTP Java Mail Sender

![Build](https://img.shields.io/badge/build-passing-brightgreen)
![Java](https://img.shields.io/badge/Java-17+-blue)
![Maven](https://img.shields.io/badge/Maven-3.8+-orange)

A simple Java project that demonstrates how to send emails using **Jakarta Mail (JavaMail API)** with **Gmail SMTP**.

This project is structured as a Maven project and includes:

* A `GmailService` class for sending emails.
* A `Main` class to run and test the service.

---

## 🚀 Features

* Send plain-text emails via Gmail SMTP.
* Uses **Jakarta Mail (JavaMail API)**.
* Secure authentication with **App Passwords**.
* Simple and reusable service class.

---

## 📂 Project Structure

```
gmail-sender/
 ├── src/
 │   ├── main/java/com/example/
 │   │    ├── Main.java
 │   │    └── email/GmailService.java
 ├── pom.xml
 └── README.md
```

---

## 🛠️ Prerequisites

1. **Java 17+** (or compatible JDK).
2. **Maven 3.8+** (for dependency management).
3. A **Gmail account** with:

   * **2-Step Verification enabled**
   * An **App Password** generated for Mail

📌 [How to create an App Password](https://support.google.com/accounts/answer/185833?hl=en)

---

## ⚙️ Setup & Installation

1. **Clone the repo**

```bash
git clone https://github.com/your-username/gmail-sender.git
cd gmail-sender
```

2. **Build the project**

```bash
mvn clean install
```

3. **Update credentials**
   In `GmailService.java`, replace with your Gmail and App Password:

```java
String username = "yourgmail@gmail.com";  
String password = "yourapppassword"; // no spaces
```

---

## ▶️ Usage

Run the `Main` class:

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

---

## 📦 Dependencies

* [Jakarta Mail](https://eclipse-ee4j.github.io/mail/)
* [Jakarta Activation](https://eclipse-ee4j.github.io/jaf/)

Already included in `pom.xml`:

```xml
<dependency>
    <groupId>com.sun.mail</groupId>
    <artifactId>jakarta.mail</artifactId>
    <version>2.0.1</version>
</dependency>
<dependency>
    <groupId>com.sun.activation</groupId>
    <artifactId>jakarta.activation</artifactId>
    <version>2.0.1</version>
</dependency>
```
✅ Console Output

<img width="943" height="567" alt="Screenshot (17)" src="https://github.com/user-attachments/assets/cefbebdd-f298-4a4d-87a4-5b330c147167" />

---

## 🔐 Security Notes

* **Never commit your real Gmail username or password** into source control.
* Use environment variables or a `.properties` file (ignored by Git).
* App Passwords can be revoked anytime from your Google Account.

---

## 📌 Future Improvements

* Support **HTML email**.
* Send **attachments (PDF, images, etc.)**.
* Add **logging** instead of `printStackTrace()`.
* Store credentials securely (e.g., environment variables).

---

