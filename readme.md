# Scala

## OOP

- Case class
- Case object
- Trait
- Object
- Companion object
- Class
- Inheritance
- Polymorphism
- Abstraction
- Encapsulation
- Constructor

### Object
An object is a class that has exactly one instance. 
It is created lazily when it is referenced, like a lazy val.

```scala
    object IdFactory {
        private var counter = 0
        def create(): Int = {
            counter += 1
            counter
        }
    }
    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2
```

### Companion object
A companion object is an object with the same name as 
a class or trait 
and is defined in the same source file as the class.

```scala


```

## Call by value vs call by name
Call by value evaluates the function arguments before calling the function. Call by name evaluates the function first 
and then evaluates the arguments if need be.

```scala
    def time() = {
        println("Getting time in nano seconds")
        System.nanoTime
    }
    def exec(t: Long) = {
        println("Executing function")
        println("Time is " + t)
    }
    exec(time())
```
    
```scala
    def time() = {
        println("Getting time in nano seconds")
        System.nanoTime
    }
    def exec(t: => Long) = {
        println("Executing function")
        println("Time is " + t)
    }
    exec(time())
```

## Case class
Case classes are like regular classes with a few key differences which we will go over.
    
    ```scala
    case class Person(name: String, age: Int)
    val p = Person("John", 30)
    println(p.name) // John
    println(p.age) // 30
    ```

Features of case classes:
- hashCode and equals methods are implemented out of the box
- toString method is implemented out of the box
- A copy method is implemented out of the box
- A factory method is implemented out of the box
- A companion object is created with the same name as the case class
- The parameters are public val by default
- The parameters are immutable by default

