## 103. Introduction to Advanced Python Modules

***

## 104. Python Collections Modules

### `collections`

```python
from collections import Counter
mylist = [1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3]
Counter(mylist)

mylist = ['a','a',10,10,10]
Counter(mylist)

Counter('aaaabbbbshhshsjs')

sentence = "How many times does each work show up in this sentence with a word"
Counter(sentence.lower().split())

letters = 'aaabbbcccddddddddddd'
c = Counter(letters)
c.most_common(3)
list(c)
```

### `defaultdict`

```python
from collections import defaultdict

d = defaultdict(lambda: 0)
d['correct'] = 100
d['correct']
d['WRONG KEY!']
d
```

### `namedtuple`

```python
from collections import namedtuple

Dog = namedtuple('Dog', ['age','breed','name'])
sammy = Dog(age=5,breed='Husky',name='Sam')
type(sammy)
sammy
```

***

## 105. Opening and Reading Files and Folders (Python OS Module)

***

## 106. Python Datetime Module

***

## 107. Python Math and Random Modules

***

## 108. Python Debugger

***

## 109. Python Regular Expressions Part One

***

## 110. Python Regular Expressions Part Two

***

## 111. Python Regular Expressions Part Three

***

## 112. Timing Your Python Code

***

## 113. Zipping and Unzipping Files with Python

***

## 114. Advanced Python Module Puzzle - Overview

***

## 115. Advanced Python Module Puzzle - Solution

***
