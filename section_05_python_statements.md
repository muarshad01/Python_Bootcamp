## 34. `If Elif` and `Else` Statements in Python

```python
if some_condition:
    # execute some code
elif some_other_condition:
    # do something different
else:
    # do something else
```

***

## 35. For Loop in Python

```python
mylist = [1,2,3]
for item in mylist:
    print(item)
```

```python
for num in mylist:
    # Check for even
    if num % 2 == 0:
        print(num)
    else:
        print(f'Odd Number: {num}')
```

```python
mystring = 'Hello World'
for letter in mystring:
    print(letter)
```

### Tuple Unpacking

```python
mylist = [(1,2),(3,4),(5,6),(7,8)]
len(mylist)

for a,b in mylist:
    print(a)
    print(b)
```

```python
mylist = [(1,2,3),(4,5,6),(7,8,9)]
for a,b,c in mylist:
    print(a)
    print(b)
    print(c)
```

### Dictionaries

```python
d = {'k1':1,'k2':2,'k3':3}

for key,value in d.items():
    print(value)
```

***

## 36. While Loops in Python

```python
while some_boolean_condition:
    # do something
else:
    # do something different
```

```python
x = 0

while x < 5:
    print(f'The current value of x is {x}')
    x = x + 1   # x += 1
else:
    print("X IS NOT LESS THAN 5")
```

### `break`, `continue`, `pass`

* `break` - Breaks out the current closest enclosing loop.
* `continue` - Goes to the top of the closest enclosing loop.
* `pass` - Does nothing at all.

```python
x = [1,2,3]

for item in x:
    # comment
    pass
```

```python
for letter in mystring:
    if letter == 'a':
        continue
    print(letter)
```

```python
for letter in mystring:
    if letter == 'a':
        break
    print(letter)
```
***

## 37. Useful Operators in Python

```python
list(range(0,11,2))
```

```python
index_count = 0

for letter in 'abcde':
    print('At index {} the letter is{}'.format(index_count,letter))
    index_count += 1
```

```python
word = 'abcde'

for item in enumerate(word):
    print(item)
```

```python
mylist1 = [1,2,3]
mylist2 = ['a','b','c']
mylist3 = [100,200,300]

for item in zip(mylist1,mylist2,mylist3):
    print(item)

list(zip(mylist1,mylist2))
```


```python
from random import shuffle

mylist = [1,2,3,4,5,6,7,8,9,10]
shuffle(mylist)
```

```python
from random import randint

randint(0,100)
```

```python
result = int(input('Favourite Number: '))
```
***

## 38. List Comprehensions in Python

```python
mystring = 'hello'

mylist = []

for letter in mystring:
    mylist.append(letter)

---

mylist = [letter for letter in mystring]
```

```python
mylist = [x for x in 'word']
```

```python
mylist = [num for num in range(0,11)]
```


```python
mylist = [num**2 for num in range(0,11)]
```

```python
mylist = [x for x in range(0,11) if x%2==0]
```


```python
celcius = [0,10,20,34.5]

fahrenheit = [((9/5)*temp + 32) for temp in celcius]
```

```
fahrenheit = []

for temp in celcius:
    fahrenheit.append(((9/5)*temp + 32))
```

***

## 39. Python Statements Test Overview

***

## 40. Python Statements Test Solutions

***
