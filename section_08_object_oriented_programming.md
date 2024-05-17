## 68. OOP - Introduction

### Objects (Instances)
* Methods (Functions in Python); We pass parameters to functinos
* Instance variables (i.e., Attributes)

```python
class NameOfClass():

    # constructor
    def __init__(self, param1, param2):
        # instance variables
        self.param1 = param1
        self.param2 = param2

    # instance method
    def some_method(self):
        print(self.param1)
```

* By convention, the `parameter_name` and `attribute_name (i.e. instance variable name)` are the same.
  
***

## 69. OOP - Object Attributes (`Instance variables`) and `class` Keyword

* The `class` is blueprint for creating objects.
* An `object` is an instance of a class.

```python
class Dog():

    # constructor
    def __init__(self, breed, name, spots):
        # instance variables
        self.breed = breed
        self.name = name
        self.spots = spots
```

```python
if __name__ == "__main__":

    # object (instance)
    my_dog =  Dog(breed="Lab", name="Sammy", spots=False)

    print(type(my_dog))
    print(my_dog.breed)
    print(my_dog.name)
    print(my_dog.spots)
```

* By convention, the `parameter_name` and `attribute_name` are the same.

***

## 70. OOP - Class Attributes (Static Variables) and Methods

```python
class Dog:

    # class variable (static variable)
    species = "mammal"

    def __init__(self, breed, name):
        # instance variable
        self.breed = breed
        self.name = name

    # instance method
    def bark(self, number):
        print('Woof! My name is {}'.format(self.name), number)
```

```python
if __name__ == "__main__":

    # instance (object)
    my_dog = Dog('Lab', 'Frankie')

    my_dog.bark(10)
```

```python
class Circle():

    # class variable (static variable)
    pi = 3.14

    def __init__(self, radius=1):
        # instance variables
        self.radius = radius
        self.area = Circle.pi * self.radius * self.radius

    # instance method
    def circumference(self):
        return 2 * Circle.pi * self.radius
```

```python
if __name__ == "__main__":

    # instance (object)
    my_circle = Cirle(10)

    my_circle.circumference()
```

***

## 71. OOP - Inheritance and Polymorphism

* Reuse code
* Reduce complexity of program

### Interitance

```python
class Animal():

    def __init__(self):
        print("ANIMAL CREATED")

    def eat(self):
        print("I'm eating")

    def who_am_i(self):
        print("I'm an animal")
```

```python
class Dog(Animal):
    
    def __init__(self):
        Animal.__init__(self)
        print("Dog Created")
   
    def eat(self):
        print("I'm a dog and eating") 
    
    def who_am_i(self):
        print("I'm a dog!")

    def bark(self):
        print("Woof!")
```

### Polymorphism

```python
class Dog():

    def __init__(self, name):
        self.name = name

    def speak(self):
        return self.name + " says woof!"
```

```python
class Cat():

    def __init__(self, name):
        self.name = name

    def speak(self):
        return self.name + " says meow!"
```

```python
if __name__ == "__main__":

    # instance (object)
    niko = Dog("niko")
    felix = Cat("felix")

    print(niko.speak())
    print(felix.speak())

    for pet in [niko, felix]:
        print(type(pet))
        print(type(pet.speak()))
```

```python
def pet_speak(pet):
    print(pet.speak())

pet_speak(niko)
pet_speak(felix)
```

### Abstract Classes and Inheritance

```python
class Animal():
    
    def __init__(self, name):
        self.name = name

    def speak(self):
        raise NotImplementedError("Subclass must implement this abstract method")
```

```python
class Dog(Animal):

    def speak(self):
        return self.name + " says woof!"
```

```python
class Cat(Animal):

    def speak(self):
        return self.name + " says meow"
```

***

## 72. OOP - Special (Magic / Dunder) Methods
* Dunder: double underline(`__`)

```python
class Book():

    def __init__(self, title, author, pages):
        # instance variables
        self.title = title
        self.author = author
        self.pages = pages

    def __str__(self):
        return f'{self.title} by {self.author}'

    def __len__(self):
        return self.pages

    def __del__(self):
        print(f'A book object has been deleted.')
```

```python
b = Book('Python Rocks', 'Jose', 200)

print(b)
print(len(b))
del b
```

***

## 73. OOP - Homework

***

## 74. OOP - Homework Solutions

```python
class Line():

    def __init__(self, coor1, coor2):
        # coordinates are being passed as tuples
        self.coor1 = coor1
        self.coor2 = coor2

    def distance(self):
        x1,y1 = self.coor1
        x2,y2 = self.coor2
        return ((x2-x1)**2 + (y2-y1)**2)**0.5

    def slope(self):
        x1,y1 = self.coor1
        x2,y2 = self.coor2
        return (y2-y1)/(x2-x1)
```

```python
c1 = (3, 2)
c2 = (8, 10)

line = Line(c1, c2)

line.distance()
line.slope()
```

```python
class Cylinder():

    # class variables
    pi = 3.14
  
    def __init__(self, height=1, radius=1):
        # instance variables
        self.height = height
        self.radius = radius

    # instance method
    def volume(self):
        return Cylinder.pi * self.radius**2 * self.height

    # instance method
    def surface_area(self):
        top = Cylinder.pi * self.radius**2
        return (2 * top) + (2 * Cylinder.pi * self.radius * self.height)
```

```python
mycyl = Cylinder(2, 3)
mycyl.volume()
mycyl.surface_area()
```

***

## 75. OOP - Challenge Overview

***

## 76. OOP - Challenge Solution

```python
class Account():

    def __init__(self, owner, balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self, dep_amt):
        self.balance += dep_amt
        print(f"Added {dep_amt} to the balance.")

    def withdraw(self, wd_amt):
        if self.balance >= wd_amt:
            self.balance -= wd_amt
            print("Withdrawal accepted.")
        else:
            print("Sorry, not enough funds.")

    def __str__(self):
        return f'Owner {self.owner} \nBalance {self.balance}'
```

***

## MethodTypes
```python
class MethodTypes:

    # class variable (static variable)
    name = "Ragnar"

    def instanceMethod(self):
        # Creates an instance atribute through keyword 'self'
        self.name = "Lothbrock"
        print(self.name)

    @classmethod
    def classMethod(cls):
        # Access a class atribute through keyword cls
        cls.name = "Lagertha"
        print(cls.name)

    @staticmethod
    def staticMethod():
        print("This is a static method")

# Creates an instance of the class
m = MethodTypes()

# Calls instance method
m.instanceMethod()

MethodTypes.classMethod()
MethodTypes.staticMethod()
```

***

* [Object-Oriented Programming in Python vs Java](https://realpython.com/oop-in-python-vs-java/)

