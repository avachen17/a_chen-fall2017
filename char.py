#checks if the character is lowercase 
def is_lower_101(character):
   if ord(character) >= 97 and ord(character) <= 122:
      return True 
   return False 

#returns the rot-13 value of a character 
def char_rot_13(character):
   result = ""
   if character.isupper():
      range = 91
      bound = 65
   else: 
      range = 123
      bound = 97
   new_order = (ord(character)+13) % range 
   if new_order < bound:
      new_order = new_order + bound 
      result = result + chr(new_order)
   else: 
      result = result + chr(new_order)

   return result

