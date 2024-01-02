## 100. Generators with Python

```python
def create_cubes(n):
    result = []
    for x in range(n):
        result.append(x**3)

    return result
```

```python
for x in create_cubes(10):
    print(x)
```
***

```python
def create_cubes(n):
    result = []
    for x in range(n):
        yield x**3
```

```python

list(create_cubes(10))

for x in create_cubes(10):
    print(x)
```

***

```python
def gen_fibon(n):

    a = 1
    b = 1
    for i in range(n):
        yield = a
        a,b = b, a+b
```

```python
for number in gen_fibon(10):
    print(num)
```

***

```python
def simple_gen():
    for x in range(3):
        yield x
```

```python
for number in simple_gen():
    print(number)
```

```python
g = simple_gen()

print(next(g))
print(next(g))
print(next(g))
```
***

```python
s_iter = iter(s)
next(s_iter)
next(s_iter)
```

***

## 101. Generators Homework Overview

***

## 102. Generators Homework Solution

***
