## 11. Introduction to Python Data Types

### Data Types

* Numbers
    * `int` - 3,300,300
        * whole numbers
    * `float`   - 2.3, 4.6, 100.0
        * numbers with a decimal
* `str`     - "hello", 'Sammy', "2000"
* `bool`    - True or False

### Data Structures

* `list`    - [10,"hello",200.3]
    * lists are ordered sequence of objects
* `dict`    - {"mykey":"value","name":"Frankie"}
* `tuples`  - (10,"hello",200.3)
    * ordered _immutable_ sequence of objects
* `set` - {"a","b"}

***

## 12. Python Numbers

***

## 13. Numbers - FAQ

***

## 14. Variable Assignments

* Python uses **Dynamic Typing**
    * This means you can reassign variables to different data types
    * This is different that other languages that are **Statically Typed**

```python
my_dogs = 2

my_dogs = ["Sammy","Frankie"]
```

* `type(variable_name)`

***

## 15. Introduction to Strings

* Strings are sequence of characters, using the syntax of single quotes or double quotes:
```python
'hello'
"Hello"
"I don't do that"
```

### Indexing Strings
```python
Character:     h  e  l  l  o
index:         0  1  2  3  4
Reverse Index: 0 -4 -3 -2 -1
```
### Slicing Sentax
* `[start:stop:step]`
* **start** is a numerical index for the slice start
* **stop** is the index you'll go up to (but not include)
* step is the size of "jump" you take.

***

## 16. Indexing and Slicing with Strings

***

## 17. String Properties and Methods

* String are not mutable.
    * You can't use indexing to change individual elements of a string

```python
name = "Sam"
# name[0] = 'P'

last_letters = name[1:]

'P' + last_tetters
```

***

## 18. Strings - FAQ

***

## 19. Print Formatting with Strings

* String interpolation

### Two methods

* `.format()`

```python
'String here {} then also {}'.format('something1','something2')

print('This is a string{}'.format('INSERTED'))

print('The {} {} {}'.format('fox','brown','quick'))

print('The {q} {b} {f}'.format('f=fox','b=brown','q=quick'))
```

```python
result = 100/777


<!-- Float formatting follows "{value:width.precision f}"-->
print("The result was {r:1.3f}".format(r=result))
```
* `f-strings` (formatted string literals)

```python
name = "Jose"
print('Hello, his name is {}'.format(name))
print(f'Hello, his name is {name}')

name = "Sam"
age = 3
print(f'{name} is {age} years old.')
```

***

## 20. Print Formatting FAQs

***

## 21. Lists in Python

* Ordered sequences that can hold a variety of types

```python
my_list = [1,2,3]
my_list = ['STRING',100,23.2]
len(my_list)
```

```python
my_list = ['one','two','three']
another_list = ['four','five']
new_list = my_list + another_list
new_list

new_list.append('six')
new_list.pop()
```

```python
my_list = [7,2,9]
my_list.sort()
my_list.reverse()
```
***

## 22. Lists - FAQ

***

## 23. Dictionaries in Python

* Dictionaries are unordered mappings
* key-value pairings
* Cannot be sorted

```python
d = {'k1':10,'k2':20,'k3':30}
d.keys()
d.values()
d.items()
```

***

## 24. Dictionaries - FAQ

***

## 25. Tuples with Python

***

## 26. Sets in Python

***

## 27. Booleans in Python

***

## 28. I/O with Basic Files in Python

***

## 29. Resources for More Basic Practice

***

## 30. Python Objects and Data Structures Assessment Test Overview

***

## 31. Python Objects and Data Structures Assessment Test Solutions

***
