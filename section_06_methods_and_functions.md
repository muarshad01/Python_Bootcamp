## 41 Methods and the Python Documentation

```python
In: mylist = [1,2,3]
In: mylist.append(4)
In: mylist
Out: [1, 2, 3, 4]

In: mylist.pop()
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
    ```
    Docstring explains function.
    ```
    print('Hello')

>> name_of_function()
>> Hello
```

* Note: Everything inside the function is indented
* (`:`) at the end of parenthesis `()` tells that next we have an indented block of code
* Python uses `snake-casing`, by default, for name of function, which is all lowercase with underscores between words
* Class calls use `camel-casing`

***

```python
def name_of_function(name='Default'):
    print(f'Hello {name}')

>> name_of_function('James')
>> Hello James
```
***

```python
def name_of_function(num1, num2):
    return num1 + num2
```

```python
>> result = name_of_function(1,2)
>> 
>> print result
>> 3
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

for ticker,price in stock_prices:
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
In: example = [1,2,3,4,5,6,7]
In: from random import shuffle
In: result = shuffle(example)
In: result                      # This will not print anything

In: def shuffle_list(mylist):
        shuffle(mylist)
        return mylist

In: result = shuffle_list(example)
In: result
Out: [3,4,1,5,6,7,2]
```

```python
In: mylist = [' ','O',' ']
In: shuffle_list(mylist)
Out: ['O',' ',' ']

In: def player_guess():
        guess = ' '
        while guess not in ['0','1','2']
            guess = input("Pick a number: 0, 1 or 2")

        return int(guess)

In: player_guess()
Out: 1

In: def check_guess(mylist, guess):
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

***

## 50. Function Practice Exercises - Overview

***

## 51. Function Practice - Solutions

***

## 52. Function Practice - Solutions Level One

***

## 53. Function Practice - Solutions Level Two

***

## 54. Function Exercise Solutions - Challenge Problem

***

## 55. Lambda Expressions, Map, and Filter Functions

***

## 56. Nested Statements and Scope

***

## 57. Methods and Functions Homework Overview

***

## 58. Methods and Functions Homework - Solutions

***

