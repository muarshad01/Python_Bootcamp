## 80. Errors and Exception Handling

```python
try:
    # WANT TO ATTEMPT THIS CODE
    # MAY HAVE AN ERROR
    result = 10 + '10'
except:
    print("Hey, it looks like you aren't adding correctly!")
else:
    print("Add went well!")
    print(result)
```

***

```python
try:
    f = open('testfile','w')
    f.write("Write a test line")
except TypeError:
    print("There was a type error!")
except OSError:
    print('Hey, you've an OS Error!')
finally:
    print("I always run")
```

***

```python
def ask_for_int():

    while True:
        try:
            result = int(input("Please provide number: "))
        except:
            print("Whoops! This is not a number")
            continue
        else:
            print("Yes thank you.")
            break
        finally:
            print("End of try/except/finally")
            print("I'll always run at the end!")
```

***

## 81. Errors and Exceptions Homework

***

## 82. Errors and Exception Homework - Solutions

***

## 83. Update for `Pylint` Users

***

## 84. `Pylint` Overview

* `pylint`: This is a library that looks at your code and reports back possible issues.
* `unittest`: This built-in library will allow to test your own programs and check you are getting desired outputs.
* Python as a set of style convention rules known as **PEP 8**

```
pip install pylint
```
***

## 85. Running tests with the Unittest Library

* Create cap.py
```python
def cap_text(text):
    '''
    Input a string
    Output the capital
    '''
    return text.title()
```

```python
import unittest
import cap

class TestCap(unittest.TestCase):

    test_one_word(self):
        text = 'python'
        result = cap.cap_text(text)
        self.assertEqual(result,'Python')

    test_multiple_words(self):
        text = 'monty python'
        result = cap.cap_text(text)
        self.assertEqual(result,'Monty Python')

if __name__=='__main__':
    unittest.main()
```
***
