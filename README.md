BLOODGROUP CLASSIFY

    Identifier are names given to programming elements like
    Classes
    Variables
    UserdefinedTypes
    Packages, Interfaces
    Labels
    Methods


    Identifier is a name to represent a variable, object or method
    Identifiers may contain letter(A-Z and a-z), digits(0-9), underscores(_) and dollar signs($)
    Identifiers cannot start with a digits
    It's good practice to not use _ or $ when naming identifiers
    Standard naming conventions(style) are to start your identifier with a lower case word, and capitalise the first letter of any other words (camel-case)
    Identifiers should be meaningful and self-documenting



    Literals

    Literals in Java are typically classified into six types and then into various sub-types. 
    The primary literal types are:

    1. Integral Literals
   Integral literals consist of digit sequences and are broken down into these sub-types:
   a)Decimal Integer: Decimal integers use a base ten and digits ranging from 0 to 9. They can have a negative (-) or 
   a positive (+), but non-digit characters or commas aren’t allowed between characters. 
   b)Octal Integer: Octal integers use a base eight and digits ranging from 0 to 7. Octal integers always begin with a “0.”
   c)Hexa-Decimal: Hexa-decimal integers work with a base 16 and use digits from 0 to 9 and the characters of A through F. 
   The characters are case-sensitive and represent a 10 to 15 numerical range. 
   d)Binary Integer: Binary integers uses a base two, consisting of the digits “0” and “1.” The prefix “0b” represents 
   the Binary system. 
   

    2. Floating-Point Literals
   Floating-point literals are expressed as exponential notations or as decimal fractions. They can represent either a positive or negative value, but if it’s not specified, the value defaults to positive. Floating-point literals come in these formats:
   Floating: Floating format single precision (4 bytes) end with an “f” or “F.” Example: 4f. Floating format double precision (8 bytes) end with a “d” or “D.”
   
   Decimal: This format uses 0 through 9 and can have either a suffix or an exponent. Example: 99638.440.
   Decimal in Exponent form: The exponent form may use an optional sign, such as a "-," and an exponent indicator, 
   such as "e" or "E." Example: 456.5f.
   
     3. Char Literals
   Character (Char) literals are expressed as an escape sequence or a character, enclosed in single quote marks,
   and always a type of character in Java. Char literals are sixteen-bit Unicode characters ranging from 0 to 65535.
  
   
     4. String Literals
   String literals are sequences of characters enclosed between double quote ("") marks.
   These characters can be alphanumeric, special characters, blank spaces, etc.
   
    
    5. Boolean Literals
   Boolean literals have only two values and so are divided into two literals:
   True represents a real boolean value
   False represents a false boolean value
   
    6. Null Literals
   Null literals represent a null value and refer to no object. Nulls are typically used as a marker to indicate that
   a reference type object isn’t available. They often describe an uninitialized state in the program. 
   It is a mistake to try to dereference a null value. Example: Patient age = NULL;
  
