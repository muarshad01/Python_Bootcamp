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
    print("Hello")

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

***

## 47. Interactions between Python Functions

***

## 48. Overview of Quick Function

***

## 49









