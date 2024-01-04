## 134. Introduction to Emails with Python

***

## 135. Sending Emails with Python

```
gmail - smtp.gmail.com
```

***

## 136. Receiving Emails with Python

```python
import imaplib

M = imaplib.IMAP4_SSL('imap.gmail.com')

import getpass

email = getpass.getpass("Email: ")
password = getpass.getpass('Password: ')

M.login(email,password)
M.list()

typ, data = M.search(None, 'SUBJECT "NEW TEST PYTHON"')
typ

email_id = data[0]

result, email_data = M.fetch(email_id, '(RFC822)')

raw_email = email_date[0][1]

raw_email_string = raw_email.decode(raw_email_string)

for part in email_message.walk():

    if part.get_content_type() == 'text/html'
        body = part.get_payload(decode=True)
        print(body)
```
***
