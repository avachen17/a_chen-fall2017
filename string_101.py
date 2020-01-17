def str_rot_13(myString):
   result = ""
   for char in myString:
      if char.isupper():
         range = 91
         bound = 65
      else:
         range = 123
         bound = 97
      new_char = (ord(char) + 13) % range
      if new_char < bound:
         result = result + chr(new_char)
      else: 
         result = result + chr(new_char)
   return result

def str_translate_101(myString, old, new):
   result = ""
   for char in myString:
      if char == old:
         result += new
      else:
         result += char
   return result
