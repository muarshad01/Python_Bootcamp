`Success isn't always about greatness. It's about CONSISTENCY. Consistent hard work leads to success. Greatness will come.` - **Dwayne Johnson**

*** 

[The Complete Python Bootcamp From Zero to Hero in Python](https://www.udemy.com/course/complete-python-bootcamp/)

***

* [Section 1: Course Overview](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_01_course_overview.md) -- Dec 15, 2023
* [Section 2: Python Setup](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_02_python_setup.md) -- Dec 15, 2023
* [Section 3: Python Object and Data Structures Basics](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_03_python_object_and_data_structurs_basics.md) -- January 09, 2024
* [Section 4: Python Comparison Operators](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_04_python_comparison_operatos.md) -- January 09, 2024t
* [Section 5: Python Statements](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_05_python_statements.md) -- January 11, 2024
* [Section 6: Methods and Functions](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_06_methods_and_functions.md) -- March 05, 2024
* [Section 7: Milestone Project-1](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_07_milestone_project-1.md) -- January 11, 2024
* [Section 8: Object Oriented Programming](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_08_object_oriented_programming.md) -- March 05, 2024
* [Section 9: Modules and Packages](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_09_modules_and_packages.md) -- January 02, 2024
* [Section 10: Errors and Exception Handling](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_10_erros_and_exceptions_handling.md) -- January 03, 2024
* [Section 11: Milestone Project-2](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_11_milestone_project-2.md) -- NA
* [Section 12: Python Decorators](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_12_python_decorators.md) -- Jan 01, 2024
* [Section 13: Python Generators](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_13_pyton_generators.md) -- January 02, 2024
* [Section 14: Advanced Python Modules](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_14_advanced_pyton_modules.md) -- Dec 30, 2023
* [Section 15: Web Scraping with Python](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_15_web_scraping_with_python.md) -- NA
* [Section 16: Working with Images with Python](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_16_working_with_images_with_python.md) -- NA
* [Section 17: Working with PDFs and Spreadsheet CSV Files](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_17_working_with_pdfs_and_spreadsheet_csv_files.md) -- January 04,2024
* [Section 18: Emails with Python](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_18_emails_with_python.md) -- January 04,2023
* [Section 19: Final Capstone Python Project](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_19_final_capstone_python_project.md) -- NA
* [Section 20: Advanced Python Objects and Data Structures](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_20_advanced_python_objects_and_data_structures.md) -- Dec 31, 2023
* [Section 21: Bonus Material Introduction to GUIs](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_21_bonus_material_introduction_to_GUIs.md)
* [Section 22: Appendix - Older Python 2 Material](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_22_appendix_old_python2_material.md)
* [Section 23: Bonus Section - Thank you!](https://github.com/muarshad01/Python_Bootcamp/blob/main/section_23_thank_you.md)

***

## TODO

* $\color{red}{Python\ Postgres}$
* Python MySQL - https://www.w3schools.com/python/python_mysql_getstarted.asp
* Python MongoDB - https://www.w3schools.com/python/python_mongodb_getstarted.asp
* Python RESTful API

***

## NOTES

* Python is `dynamically typed`, which means I don't need to specify beforehand what data type I expect for `num1` and `num2` to be.
    * This allows you to program much faster, but it also leaves you open to possible bugs.
```python
def add_nums(num1, num2):
    return num1 + num2
```
* Everything in Python is `public`
   * Instead of `private`, Python has a notion of a `non-public` instance variable. Any variable which starts with an `underscore (_)` character is defined to be `non-public`. This naming convention makes it harder to access a variable, but it’s only a naming convention, and you can still access the variable directly.
   * Python further recognizes using `double underscore characters (__)` in front of a variable to `conceal an attribute in Python`. When Python sees a double underscore variable, it changes the variable name internally to make it difficult to access directly. This mechanism avoids accidents but still doesn’t make data impossible to access. When Python sees an `attribute with double underscores (__name)`, it changes the attribute by `prefixing the original name of the attribute with an underscore, followed by the class name(_class_name__name)`. To use the attribute directly, you need to change the name you use as well.
   * Python `supports multiple inheritance`, or creating classes that inherit behavior from more than one parent class.
   * In contrast to Java’s strict variable typing, Python uses a concept called `duck typing`, which in basic terms means that if a variable `“walks like a duck and quacks like a duck, then it’s a duck.”` Instead of identifying objects by type, Python examines their behavior. You can learn more about the Python type system, and duck typing, [in The Ultimate Guide to Python Type Checking](https://realpython.com/python-type-checking/).

***

## Useful Links

* [The official Python Tutorial](https://docs.python.org/3/tutorial/)
* [Object-Oriented Programming in Python vs Java](https://realpython.com/oop-in-python-vs-java/)
* [Getters and Setters: Manage Attributes in Python](https://realpython.com/python-getter-setter/)
* [Understanding self and cls in Python](https://grzegorz-makowski.medium.com/understanding-self-and-cls-in-python-b674f5e5951d)
* [Cls vs. Self: Understanding Method Types in Python](https://builtin.com/software-engineering-perspectives/python-cls)
* [__dict__ attribute and vars() function in python.](https://medium.com/analytics-vidhya/dict-attribute-and-vars-function-in-python-42d82dbaba73)

***

# Java vs Python Differences
* Java classes are defined in `files with the same name as the class`. So, you have to save this class in a file named ClassName.java. Only ONE class can be defined in each file.
* All variables in Python are `loosely typed`.
* In Python, when you declare a `variable outside of a method`, it’s treated as a `class variable`. 
* We don't have curlery braces (`{}`), instead we use (`:`) and indentation.
* We don't put `semi-colon(;)` after a statement ends
* ClassName is `Camel Case` and method_name is `Snake Case`

#### Access Control 
* Everything in Python is `public`
   * We don't have `public, private, protected`, visibility modifiers. For `non-public` members, we have a convention of prefixing the variable name with `underscore(_)`.
   * We can also prefix variable name with `double underscore(__)`. When Python sees an attribute with `double underscores (__attribute_name)`, it changes the attribute by prefixing the original name of the attribute with an `underscore(_ClassName__attribute_name), followed by the class name`. 
   * `@property` decorator.
   * The names of the decorated functions are all the same, indicating they control access to the same attribute. The function names also become the name of the attribute you use to access the value.
* `this` versus `self`

#### Instance versus Static methods
* Use of `self`
* For `instance methods`, we pass also `self` (it’s required if you want to create or refer to a member attribute)
* A `static method` does not receive an implicit first argument. A static method is also a method that is bound to the class and not the object of the class.

#### Type and Polymorphism
* Python supports `multiple inheritance`, or creating classes that inherit behavior from more than one parent class.
* In contrast to `Java’s strict variable typing`, Python uses a concept `called duck typing`, which in basic terms means that if a variable `“walks like a duck and quacks like a duck, then it’s a duck.”` Instead of identifying objects by type, Python examines their behavior. You can learn more about the Python type system, and duck typing, in The [Ultimate Guide to Python Type Checking](https://realpython.com/python-type-checking/).
##### Default Methods
```java
class Object {
   boolean equals(Object obj) { ... }    
    int hashCode() { ... }    
    String toString() { ... }    
}
```
* Python provides similar functionality with a set of common [dunder (short for “double underscore”) methods](https://dbader.org/blog/python-dunder-methods). Every Python class inherits these methods, and you can override them to modify their behavior.
   * For string representations of an object, Python provides `__repr__()` and `__str__()`, which you can learn about in Pythonic OOP String Conversion: `__repr__ vs __str__`. The unambiguous representation of an object is returned by `__repr__()`, while `__str__()` returns a human readable representation. These are roughly analogous to .hashcode() and .toString() in Java.
     
####
