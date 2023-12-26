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
