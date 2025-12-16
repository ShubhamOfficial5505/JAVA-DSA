# ArrayList (Basics)

1. **Class Loading**
   - When the JVM loads the `ArrayList` class (upon first use), a single shared empty array (capacity effectively 0) is created once.
   - Importing `ArrayList` does not load the class; the class is loaded only when it is first used.

2. **Creating an ArrayList Object**
   - Creating an `ArrayList` without specifying capacity creates an ArrayList object in the heap.

3. **Initial Array Reference**
   - This object initially holds the base address of the shared empty array.
   - The empty array is shared across multiple ArrayList objects.
   - No new internal array is created yet.

4. **Adding the First Element**
   - A new internal array of size 10 is created only for that ArrayList.
   - The element is stored in this array.
   - The base address inside the ArrayList object is updated to point to this new array.

5. **Adding Further Elements**
   - Java checks whether size == capacity. (size can thought of as the number of elements in the array)
   - If there is space, the element is added directly.

6. **Resizing When Full**
   - A new array is created with capacity oldCapacity + (oldCapacity / 2) (≈ 1.5× growth).
   - All elements from the old array are copied to the new array.
   - The new element is added.
   - The base address in the ArrayList object is updated to point to the new array.

7. **Garbage Collection**
   - Old arrays that are no longer referenced become eligible for garbage collection and are cleaned up automatically.

8. **Removing or Replacing Values**
   - Done in the same array.
   - Removing shifts elements to fill gaps.
   - Replacing overwrites the value at the given index.

9. **Indexing**
   - Works the same as arrays.
   - get(index) retrieves the element.
   - set(index, value) replaces the element.
   - Time Complexity = O(1).

10. **Object Storage and Wrapper Classes**
    - ArrayList stores objects, so primitive types require wrapper classes.
    - Java automatically converts between primitives and wrapper objects using autoboxing/unboxing.

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10); // int is autoboxed to Integer
int val = list.get(0); // Integer is unboxed to int
```

11. **ArrayList with Specified Capacity**
    - If an ArrayList is initialized with a specified capacity, it immediately creates an internal array of that length.
    - The ArrayList object’s base address points to this array from the start.
    - Rest of the behavior (adding elements, resizing if exceeded, indexing, removing, autoboxing) remains the same.