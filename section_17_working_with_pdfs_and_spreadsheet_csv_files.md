## 129. Introduction to PDFs and Spreadsheets with Python

***

## 130. Working with CSV Files in Python

* CSV - Comma Separated Variables

### Useful libraries

* `Pandas`
* `Openpyxl`
* https://python-excel.org
* Google Sheets Python API

```python
import csv

# Open the file
data = open('example.csv',encoding='utf-8')

# csv.reader
csv_data = csv.reader(data)

# reformat it into a Python object list of lists
data_lines = list(csv_data)

data_lines[0]

len(data_lines)

for line in data_lines[1:]:
    print(line)

# all emails
all_emails = []
for line in data_lines[1:]:
    all_emails.append(line[3])

# full names
full_names = []
for line in data_lines[1:]:
    full_names.append(line[1]+' '+line[2])
```

```python
file_to_output = open('to_save_file.csv',mode='w',newline='')

csv_writer = csv.writer(file_to_output,delimiter=',')

csv_writer.writerow(['a','b','c'])

csv_writer.writerows([['1','2','3'],['4','5','6']])

file_to_output.close()
```

```python
f = open('to_save_file.csv',mode='a',newline='')
csv_writer = csv.writer(f)
csv_writer.writerow(['1','2','3'])
f.close()
```

***

## 131. Working with PDF Files in Python

* PDF - Portable Document Format

* `PyPDF2` 
* `pip install PyPDF2`

```python
import PyPDF2

f = open('Working_Business_Proposal.pdf','rb')

pdf_reader = PyPDF2.pdfFileReader(f)

pdf_reader.numPages

page_one = pdf_reader.getPage(0)

page_one_text = page_one.extractText()

page_one_text

f.close()
```

***

```python
pdf_writer = PyPDF2.PdfFileWriter()

type(first_page)

pdf_writer.addPage(first_page)

pdf_output = open('Some_BrandNew_Doc.pdf','wb')

pdf_writer.write(pdf_output)

f.close()

pdf_output.close()
```

***

## 132. PDFs and Spreadsheets Python Puzzle Exercise

***

## 133. PDFs and Spreadsheets Python Puzzle Exercise - Solutions

```python
import csv

data = open('Exercise_Files/find_the_link.csv','utf-8')

csv_data = csv.reader(data)

data_lines = list(csv_data)

link_str = ''

for now_num,data in enumerate(data_lines):
    
    link_str += data[row_num]

link_str
```

***

```python
import PyPDF2

f = open('Exercise_Files/Find_the_Phone_Number.pdf','rb')

pdf = PyPDF2.PdfFileReader(f)

pdf.numPages
```

```python
import re

pattern = r'\d{3}.\d{3}.\d{4}'

all_text = ''

for n in range(pdf.numPages):

    page = pdf.getPage(n)
    page_text = page.extractText()

    all_text = all_text+' '+page_text

for match in re.finditer(pattern,all_text):
    print(match)
```

***
