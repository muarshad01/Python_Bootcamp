## 98. Decorators with Python Overview

### Returning a function defined inside another function

```python
def hello(name='Jose'):
    print('The hello() function has been executed!')

    def greet():
        return '\t This is the greet() func inside hello!'
    
    def welcome():
        return '\t This is welcome() func inside hello!'

    print('I'm going to return a function!')

    if name == 'Jose'
        return greet
    else:
        return welcome
```

```python
my_new_func = hello('Jose')
print(my_new_func())
```
```python
def cool():
    
    def super_cool():
        return 'I'm very cool!'

    return super_cool
```

```python
some_func = cool()
print(some_func())
```

### Passing function as argument 

```python
def hello():
    return 'Hi Jose!'

def other(some_other_func):
    print('Other code runs here!')
    print(some_other_func())
```

```python
hello()
other(hello)
```

###

```python
def new_decorator(original_func):
    
    def wrap_func():
        
        print('Some extra code, before the original function.')

        original_func()

        print('Some extra code, after the original function.')

    return wrap_func
```

```python
def func_needs_decorator():
    print('I want to be decorated!!')
```

```python
func_needs_decorator()
decorated_func = new_decorator(func_needs_decorator)
decorated_func()
```

```python
@new_decorator
def func_needs_decorator():
    print('I want to be decorated!!')
```
* This is used in web frameworks(WF) like `Django` and `Flask`

***

## 99. Decorators Homework

***
