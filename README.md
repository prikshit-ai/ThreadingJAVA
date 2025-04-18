# Java Threads Demonstration

This project demonstrates the basic working of **multithreading in Java** by running multiple operations simultaneously using separate thread classes.

## 📌 Author Info

- **Name:** Prikshit  
- **PRN:** 23070126094  
- **Batch:** AIML B-1  

---

## 💻 Functionality

This project simulates three independent threads, each performing a different task:

| File Name            | Function Description                                |
|----------------------|-----------------------------------------------------|
| `PrintNumbers.java`  | Prints numbers from 1 to 10                         |
| `PrintAlphabets.java`| Prints alphabets from A to J                        |
| `PrintGreetings.java`| Prints greeting message ("Hello from thread!")     |

All threads are triggered from the main class `MainThreadDemo.java`.

---

## ⚙️ How It Works

- Each class implements `Runnable` interface.
- All threads are started from `MainThreadDemo.java`.
- Threads run concurrently and print their respective outputs.
- Each file uses `Thread.sleep()` to simulate real-time multitasking behavior.

---

## 🧪 Exception Handling

Each thread handles two types of exceptions:

| Exception Type             | Description                                        |
|----------------------------|----------------------------------------------------|
| `InterruptedException`     | If thread execution is interrupted unexpectedly    |
| `Exception` (generic)      | To handle any unexpected runtime errors            |

In addition, custom exceptions have been defined in `CustomExceptions.java`:

### ✅ Custom Exceptions

| Exception Name             | Usage Example                                      |
|----------------------------|----------------------------------------------------|
| `InvalidThreadDataException` | Thrown when input data for thread is invalid      |
| `ThreadTimeoutException`     | Thrown when thread exceeds expected time limit    |

These can be integrated in real-time applications to make the system more robust.

---

## 🧾 Folder Structure

avaThreadsProject/ ├── MainThreadDemo.java ├── PrintNumbers.java ├── PrintAlphabets.java ├── PrintGreetings.java └── CustomExceptions.java