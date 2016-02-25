# Java date format

We use ``SimpleDateFormat`` to format date in java. It allows you formatting(date -> string) and parsing(string -> date).
Before using ``SimpleDateFormat`` you have to choose user-defined patterns for date-time formatting. The following
pattern letters are defined (all other characters from 'A' to 'Z' and from 'a' to 'z' are reserved).
You can use them define different patterns.

Letter | Date or Time Component | Presentation | Examples
:-- | :-- | :-- | :--
G | Era designator | Text | AD
y | Year | Year | 1996; 96
Y | Week year | Year | 2009; 09
M | Month in year | Month | July; Jul; 07
w | Week in year | Number | 27
W | Week in month | Number | 2
D | Day in year | Number | 189
d | Day in month | Number | 10
F | Day of week in month | Number | 2
E | Day name in week | Text | Tuesday; Tue
u | Day number of week (1 = Monday, ..., 7 = Sunday) | Number | 1
a | Am/pm marker | Text | PM
H | Hour in day (0-23) | Number | 0
k | Hour in day (1-24) | Number | 24
K | Hour in am/pm (0-11) | Number | 0
h | Hour in am/pm (1-12) | Number | 12
m | Minute in hour | Number | 30
s | Second in minute | Number | 55
S | Millisecond | Number | 978
z | Time zone | General time zone | Pacific Standard Time; PST; GMT-08:00
Z | Time zone | RFC 822 time zone | -0800
X | Time zone | ISO 8601 time zone | -08; -0800; -08:00

The following code show how to use ``SimpleDateFormat`` to format date
```java
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
    System.out.println(simpleDateFormat.format(date));
```

You can define pattern in constructor of ``SimpleDateFormat`` or use ``applyPattern`` method to
applies the given pattern. The following code is same as above.
```java
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    simpleDateFormat.applyPattern("yyyy/MM/dd");
    System.out.println(simpleDateFormat.format(date));
```

About parsing string to date you can see [here](http://www.henryxi.com/java-parse-string-to-date).