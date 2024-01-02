## 77. Pip Install and PyPi

* `PyPI` is a repository for open-source third-party Python packages

```python
pip install requests

pip install colorama

pip install openpyxl
```

***

## 78. Modules and Packages

* Create file `mymodule.py`
```python
def my_func():
    print('Hey I'm in mymodule.py')
```

* Create file `myprogram.py`
```python
from mymodule import my_func

my_func()
```

![Code Diagram for Packages](https://github.com/muarshad01/Python_Bootcamp/blob/main/images/78_modules_and_packages.png)

***

## 79. `__name__` and "__main__"

```python
#one.py

def func():
    print("FUNC() IN ONE.PY")

print("TOP LEVEL IN ONE.PY")

if __name__ == "__name__":
    print('ONE.PY is being run directly!')
else:
    print('ONE.PY has been imported!')
```

```python
#two.py
import one

print("TOP LEVEL IN TWO.PY")

one.func()

if __name__ == "__name__":
    print("TWO.PY is being run directly!")
else:
    print("TWO.PY has been imported!")
```
***
