## 41 Methods and the Python Documentation

```python
mylist = [1,2,3]
mylist.append(4)
mylist
Out: [1, 2, 3, 4]

mylist.pop()
Out: [1, 2, 3]
```

### Object + Dot + Tab
* Shows methods available for you on that object
    * E.g., `mylist.insert`
        * `help(mylist.insert)`
        * `https://docs.python.org/3/` --> Library Reference
        * Shift + Tab
***

## 42. Introduction to Functions

***

## 43. `def` Keyword

```python
def name_of_function():
    print('Hello')
    
if __name__ == "__main__":
    name_of_function()
```

* Note: Everything inside the function is indented
* (`:`) at the end of parenthesis `()` tells that next we have an indented block of code
* Python uses `snake_casing`, by default, for name of function, which is all lowercase with underscores between words
* Class calls use `camel_casing`

***

```python
def name_of_function(name="Default"):
    print(f"Hello {name}")


if __name__ == "__main__":
    name_of_function("James")
```
***

```python
def name_of_function(num1, num2):
    return num1 + num2


if __name__ == "__main__":
    result = name_of_function(1, 2)
    print(result)
```

***

## 44. Basics of Python Functions

***

## 45. Logic with Python Functions

```python
def even_check(number):
   return number % 2 == 0
```

```python
# Return True if ANY number is even inside a list

def check_even_list(num_list):
   for number in num_list:
      if number % 2 == 0:
         return True
      else:
         pass
```

```python
# Return True if ANY number is even inside a list

def check_even_list(num_list):
   for number in num_list:
      if number % 2 == 0:
         return True
      else:
         pass

   return False    
```
* How you can have multiple returns inside a function.

```python
def check_even_list(num_list):
   # return all the even numbers in a list

   # placeholder variables
   even_numbers = []

   for number in num_list:
      if number % 2 == 0:
         even_numbers.append(number)
      else:
         pass

   return even_numbers
```

***

## 46. Tuple Unpacking with Python Functions

```python
stock_prices = [('APPL',200),('GOOG',400),('MSFT',100)]

for item in stock_prices:
   print(item)

for ticker, price in stock_prices:
   print(ticker)
```

```python
work_hours = [('Abby'100),('Billy',4000),('Cassie',800)]

def employee_check(work_hours):

   current_max = 0
   employee_of_month = ''

   for employee, hours in work_hours:
      if hours > current_max:
         current_max = hours
         employee_of_month = employee
      else:
         pass

    # Return
    return (employee_of_month, current_max)

result = employee_check(work_hours)    
```

***

## 47. Interactions between Python Functions

```python
example = [1,2,3,4,5,6,7]
from random import shuffle
result = shuffle(example)
result                      # This will not print anything

def shuffle_list(mylist):
   shuffle(mylist)
   return mylist

result = shuffle_list(example)
result
Out: [3,4,1,5,6,7,2]
```

```python
mylist = [' ','O',' ']
shuffle_list(mylist)
Out: ['O',' ',' ']

def player_guess():
   guess = ' '
   while guess not in ['0','1','2']
      guess = input("Pick a number: 0, 1 or 2")

   return int(guess)

player_guess()
Out: 1

def check_guess(mylist, guess):
   if mylist[guess] == 'O'
      print("Correct!")
   else:
      print("Wrong guess!")

print(mylist)
```

```python
# INITIAL LIST
mylist = [' ','O',' ']

# SHUFFLE LIST
mixedup_list = shuffle_list(mylist)

# USER GUESS
guess = player_guess()

# CHECK GUESS
check_guess=(mixedup_list,guess)
```

***

## 48. Overview of Quick Function

***

* [Exercise Solutions](https://docs.google.com/document/d/181AMuP-V5VnSorl_q7p6BYd8mwXWBnsZY_sSPA8trfc/edit?pli=1)

***

## 49. `*args` and `**kwargs` in Python

```python
def myfunc(*args):
   print(args)

myfunc(40,60,100,1,34)
```

```python
def myfunc(**kwargs):
   if 'fruit' in kwargs:
      print('My fruit of choice is {}'.format(kwargs['fruit']))
   else:
      print('I didn't find any fruit')

myfunc(fruti='apple',veggie='lettuce')
```

```python
def myfunc(*args, **kwargs):
    print(args)
    print(kwargs)
    print('I would like {} {}'.format(args[0], kwargs['food']))

myfunc(10,20,30,fruit='orange',food='eggs')
```

***

## 50. Function Practice Exercises - Overview

***

## 51. Function Practice - Solutions

***

## 52. Function Practice - Solutions Level One

***

## 53. Function Practice - Solutions Level Two

```python

def summer_69(arr):
    
    total = 0
    add = True

    for num in arr:
        while add:
            if num != 6:
                total += num
                break
            else:
                add = False
        while no add:
            if num != 9:
                break
            else:
                add = True
                break
    return total
```

***

## 54. Function Exercise Solutions - Challenge Problem

```python
def spy_game(nums):

    code = [0,0,7,'x']
    # [0,7,'x']
    # [7,'x']
    # ['x'] length = 1
    for num in nums:
        if num == code[0]:
            code.pop(0)
    
    return len(code) == 1
```

***

## 55. Lambda Expressions, Map, and Filter Functions

* Lambda Expressions - are a way to quickly create what are known as anonymous functions.
* Basically, just one time use functions that you don't even really name.

### `map()` function

```python
def square(num):
    return num**2

my_nums = [1,2,3,4,5]

for item in map(square, my_nums):
    print(item)
OR

list(map(square,my_nums))
```

```python
def splicer(mystring):
    if len(mystring)%2 == 0:
        return 'EVEN'
    else:
        return mystring[0]

names = ['Andy','Eve','Sally']

list(map(splicer, names))
```

### `filter()` function

```python
def check_even(num):
    return num%2 == 0

mynums = [1,2,3,4,5,6]

list(filter(check_even, mynums))

OR

for n in filter(check_even, mynums):
    print (n)
```

### Lambda function

```python
list(map(lambda num:num**2, mynums))
```

```python
list(filter(lambda num:num%2 ==0, mynumber))
```

```python
list(map(lambda x:x[::-1], names))
```

***

## 56. Nested Statements and Scope

* LEGB rule format:
    * L: Local -- Names assigned in any way within a function (def or lambda), and not declared global in that function.
    * E: Enclosing function locals -- Names in the local scope of any and all enclosing functions (def or lambda), from inner to outer.
    * G: Global (module) -- Names assigned at the top-level of module file, or declared global in a def within the file.
    * B: Built-in (Python) -- Names preassigned in the built-in names module: open, range, SyntaxError, ...

```python
lambda num:num**2
```

```python
# GLOBAL
name = 'THIS IS A GLOBAL STRING'

def greet():

    # ENCLOSING
    name = 'Sammy'
    
    def hello():
        # LOCAL
        name = 'IM a LOCAL'
        print('Hello ' + name)

    hello()

greet()
```

```python
x = 50

def func(x):
    print(f'x is {x}')

    # LOCAL REASSIGNMENT
    x = 200
    print(f'I JUST LOCALLY CHANGED X TO {X}')

func(x)
```

### `global` keyword

```python
x = 50

def func(x):
    global x
    print(f'x is {x}')

    # LOCAL REASSIGNMENT ON A GLOBAL VARIABLE!
    x = 'NEW VALUE'
    print(f'I JUST LOCALLY CHANGED GLOBAL X TO {X}')

func(x)
```

* Using the `global` keyword, you're able to reach out into that `global namespace` and then your local assignments do affect the global variable.

***

## 57. Methods and Functions Homework Overview

***

## 58. Methods and Functions Homework - Solutions

```python
import string

def ispangram(
    str1: string,
    alphaset=string.ascii_lowercase
) -> bool:
    '''
    ispangram method
    '''
    # Create a set of alphaset
    alphaset = set(alphaset)
  
    # Remove any spaces from the input string
    str1 = str1.replace(' ', '')
    
    # Convert into all lowercase
    str1 = str1.lowercase()
    
    # Grab all unique letters from the string set()
    str1 = set(str1)
       
    # alphabet set == string set input
    return str1 == alphaset
```

***

