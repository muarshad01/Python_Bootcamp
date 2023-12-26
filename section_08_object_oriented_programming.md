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

my_dog = Dog('Lab','Frankie')
my_dog.bark(10)
```



```python
class Circle():

    # CLASS OBJECT ATTRIBUTE
    pi = 3.14

    def __init__(self,radius=1):

        self.radius = radius
        self.area = radius * radius * Circle.pi

    # Method
    def circumference():
        return Circle.pi * self.radius * 2

my_circle = Cirle(10)
my_circle.circumference()
```

***

## 71. OOP - Inheritance and Polymorphism

***

## 72. OOP - Special (Magic / Dunder) Methods

***

## 73. OOP - Homework

***

## 74. OOP - Homework Solutions

***

## 75. OOP - Challenge Overview

***

## 76. OOP - Challenge Solution

***
