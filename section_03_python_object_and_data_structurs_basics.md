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

* Tuples are very similar to lists. However, they've one key difference - immutability.
* Once an element is inside a tuple, it can not be reassigned.
* Tuples use parenthesis `(1,2,3)`

* Q: What you're going to be using tuples for mainly?
    * Manily beneficial once you're passing around objects in your program and you need to make sure that they don't accidentally get changed.
    * So, it provides a very convenient source of what's knows as data integrity.

***

## 26. Sets in Python

* Sets are unordered collections of unique elements.

```python
myset = set()
myset.add(1)
myset.add(2)
myset.add(3)

mylist = [1,1,2,2,2,3,3,3,3,3]
set(mylist)
```
***

## 27. Booleans in Python

* `True` of `False`

***

## 28. I/O with Basic Files in Python

```python
myfile = open('myfile.txt')
myfile.read()

myfile.read()   # will return empty '' string
myfile.seek(0)
myfile.readlines()
```

```python
myfile = open("C:\\Users\\YourUserName\\Folder\\myfile.txt")
myfile = open("/Users/YourUserName/Folder/myfile.txt")
```

```python
with open('myfile.txt', mode=r) as my_new_file:
    contents = my_new_file.read()

contents
```

### Reading, Writing, Appending Modes

* mode = `r` -- is read only
* mode = `w` -- is write only (will overwrite files or create new!)
* mode = `a` -- is append only (will add on to files)
* mode = `r+` -- is reading and writing
* mode = `w+` -- is writing and reading (Overwrites existing files or creates a new file!)

```python
with open('my_new_file.txt',mode='r') as f:
    print(f.read())
```

```python
with open('my_new_file.txt',mode='a') as f:
    f.write('\nFOUR ON FOURTH')
```

```python
with open('my_new_file.txt',mode='r') as f:
    print(f.read())
```

```python
with open('write_to_file.txt',mode='w') as f:
    f.write('I CREATED THIS FILE!')
```

***

## 29. Resources for More Basic Practice

***

## 30. Python Objects and Data Structures Assessment Test Overview

***

## 31. Python Objects and Data Structures Assessment Test Solutions


* `Strings`: Ordered sequence of characters
* `Lists`:   Ordered sequence of objects (mutable)
* `Tuples`:  Ordered sequence of objects (immutable)
* `Dictionary`: Key-value pairing that is unordered
***
