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

```python
f = open('practice.txt','w+')
f.write('This is a test string')
f.close()
```

```python
import os

os.getcwd()
os.listdir()
os.listdir('/Users')
```
### Move Files

```python
import shutil

shutil.move('src','dst')
```

### Delete Files

```python
os.unlink(path)
os.rmdir(path)
os.rmtree(path)
```

```python
pip install send2trash

import send2trash

send2trash.send2trash()
```

### `os.walk()`

```python
file_path = os.getcwd()
for folder, sub_folders, files in os.walk(file_path):
    
    print(f"Currently looking at {folder}")
    print('\n')
    print('The sub_folders are: ')
    for sub_fold in sub_folders:
        print(f"\t sub_folder: {sub_fold}")

    print('\n')
    print('The files are: ')
    for f in files:
        print(f"\t File: {f}")
    print('\n')
```







***

## 106. Python Datetime Module

```python
import datetime

mytime = datetime.time(13,20,1,20)

today = datetime.date.today()
print(today)

today.ctime()
```

```python
from datetime import datetime
```

***

## 107. Python Math and Random Modules

```python
import random

random.randint(0,100)
```

```python
random.seed(101)
random.randint(0,100)
random.randint(0,100)
random.randint(0,100)
```

```python
mylist = list(range(0,20))

random.choice(mylist)
```

### Sample With REPLACEMENT

```python
random.choices(population=mylist,k=10)
```

### Sample Without REPLACEMENT

```python
random.sample(population=mylist,k=10)
```

```python
random.shuffle(mylist)
```

***

## 108. Python Debugger

***

## 109. Python Regular Expressions - Part One

```
(555)-555-555
r"(\d\d\d)-\d\d\d-\d\d\d\d"
r"(\d{3})-\d{3}-\d{4}"
```

```python
text = "The agent's phone number is 408-555-1234. Call soon!"

import re
pattern = 'phone'
match = re.search(pattern,text)
matcn.span()
matcn.start()
matcn.end()

text = 'my phone once, my phone twice'
matches = re.findall('phone',text)
len(matches)
for match in re.finditer('phone',text):
    print(match.group())
```

***

## 110. Python Regular Expressions - Part Two

***

## 111. Python Regular Expressions - Part Three

***

## 112. Timing Your Python Code

```python
def func_one(n):
    return [str(num) for num in range(n)]
```

```python
def fund_two(n):
    return list(map(str,range(n)))
```

### `import time`

```python
# CURRENT TIME BEFORE
start_time = time.tme()

# RUN CODE
result = func_one(10)

# CURRENT TIME AFTER RUNNING CODE
end_time = time.time()

# ELAPSED TIME
elapsed_time = end_time - start_time

print(elapsed_time)
```

### `import timeit`

```python
import timeit

stmt = """
fund_one(100)
"""

setup ="""
def func_one(n):
    return [str(num) for num in range(n)]
"""

timeit.timeit(stmt,setup,number=100000)
```

***

## 113. Zipping and Unzipping Files with Python

```python
f = open('fileone.txt','w+')
f.write('ONE FILE')
f.close()
```

```python
f = open('filetwo.txt','w+')
f.write('TWO FILE')
f.close()
```

```python
import zipfile
comp_file = zipfile.ZipFile('comp_file.zip','w')
comp_file.write('fileone.txt',compress_type=zipfile.ZIP_DEFLATED)
comp_file.write('filetwp.txt',compress_type=zipfile.ZIP_DEFLATED)
comp_file.close()

zip_obj = zipfile.ZipFile('comp_file.zip','r')
zip_obj.extractall('extracted_content')
```
***

## 114. Advanced Python Module Puzzle - Overview

***

## 115. Advanced Python Module Puzzle - Solution

***
