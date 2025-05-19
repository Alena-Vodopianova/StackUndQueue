# Stack and Queue – Java Implementation

This project is part of the "Data Structures and Algorithms" course at FH JOANNEUM.  
We implemented different types of stacks and queues using two basic data structures: **arrays** and **linked lists**.

---

## 👨‍💻 Group Members

- Alena Vodopianova  
- Oleh Haievyi

---

## 📦 Implemented Classes

### ✅ Stack (LIFO – Last In, First Out)

- `MyStackArray<E>`  
  Stack using a dynamic array. Resizes automatically when full.
- `MyStackList<E>`  
  Stack based on a singly linked list.

**Methods:**
- `push(E element)` – add element to the top  
- `pop()` – remove and return top element  
- `isEmpty()` – check if the stack is empty  
- `size()` – number of elements in the stack

---

### ✅ Queue (FIFO – First In, First Out)

- `MyQueueArray<E>`  
  Queue using a circular array with dynamic resizing.
- `MyQueueList<E>`  
  Queue using a singly linked list (with front and rear nodes).

**Methods:**
- `put(E element)` – add element to the end  
- `get()` – remove and return first element  
- `isEmpty()` – check if the queue is empty  
- `size()` – number of elements in the queue

---

## ✅ Testing

We used **JUnit 4** for unit testing.  
Total test coverage:
- `MyStackArrayTest`  
- `MyStackListTest`  
- `MyQueueArrayTest`  
- `MyQueueListTest`

To run tests:

```bash
mvn test
