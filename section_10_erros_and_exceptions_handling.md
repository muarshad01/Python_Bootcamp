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

```pyton
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

***

## 85. Running tests with the Unittest Library

***
