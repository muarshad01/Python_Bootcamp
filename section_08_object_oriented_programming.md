## 68. OOP - Introduction

* Objects
    * Methods
    * Attributes

```python
class NameOfClass():
    def __init__(self,param1,param2):
        self.param1 = param1
        self.param2 = param2

    def some_method(self):
        # perform some action
        print(self.param1)
```

***

## 69. OOP - Attributes and Class Keyword

* The class is blueprint for creating objects.
* An object is an instance of a class.

```python
class Dog():
    def __init__(self,breed,name,spots):
        # Attributes
        # We take in the argument
        # Assign in using self.attribute_name
        self.breed = breed
        self.name = name

        # Expect boolean True/False
        self.spots = spots
```

```python
my_dog = Dog(breed='Lab',name='Sammy',spots=False)

type(my_dog)
my_god.breed
my_god.name
my_god.spots
```

* By convention, the parameter_name and attribute_name are the same.

***

## 70. OOP - Class Object Attributes and Methods

```python
class Dog():

    # CLASS OBJECT ATTRIBUTE
    # SAME FOR ANY INSTANCE OF A CLASS
    species = 'mammal'

    def __init__(self,breed,name):

        # Attributes
        # We take in the argument
        # Assign in using self.attribute_name
        self.breed = breed
        self.name = name

    # OPERATIONS / Actions -> Methods
    def bark(self,number):
        print("Woof! My name is {}".format(self.name,number))
```

```python
my_dog = Dog('Lab','Frankie')
my_dog.bark(10)
```

```python
class Circle():

    # CLASS OBJECT ATTRIBUTE
    pi = 3.14

    def __init__(self,radius=1):

        self.radius = radius
        self.area = Circle.pi * radius * radius

    # Method
    def circumference():
        return 2* Circle.pi * self.radius
```

```python
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
    
    def who_am_i(self):
        print("I'm an animal")
    
    def eat(self):
        print("I'm eating")
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

    def __init__(self,name):
        self.name = name

    def speak(self):
        return self.name + " says woof!"
```

```python
class Cat():

    def __init__(self,name):
        self.name = name

    def speak(self):
        return self.name + " says meow!"
```

```python
niko = Dog("niko")
felix = Cat("felix")

print(niko.speak())
print(felix.speak())

for pet in [niko,felix]:
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
    
    def __init__(self,name):
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

***

## 73. OOP - Homework

***

## 74. OOP - Homework Solutions

```python
class Line():

    def __init__(self,coor1,coor2):
        # coordinates are being passed and tuples
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
c1 = (3,2)
c2 = (8,10)

line = Line((c1,c2))

line.distance()
line.slope()
```

```python
class Cylinder():
    def __init__(self,height=1,radius=1):
        
        self.height = height
        self.radius = radius

    def volume(self):
        return 3.14 * self.radius**2 * self.height

    def surface_area(self):
        
        top = 3.14 * (self.radius**2)

        return (2 * top) + (2 * 3.14 * self.radius * self.height)
```

```python
mycyl = Cylinder(2,3)
mycyl.volume()
mycyl.surface_area()
```

***

## 75. OOP - Challenge Overview

***

## 76. OOP - Challenge Solution

```python
class Account():

    def __init(self,owner,balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self, dep_amt):
        self.balance += dep_amt
        print(f"Added {dep_amt} to the balance.")

    dep withdraw(self,wd_amt):
        if self.balance >= wd_amt:
            self.balance -= wd_amt
            print("Withdrawal accepted.")
        else:
            print("Sorry, not enough funds.")

    def __str__(self):
        return f"Owner {self.owner} \nBalance {self.balance}"
```

***
