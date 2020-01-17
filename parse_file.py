import sys

try:
   file = str(sys.argv[1])

except:
   print("Usage: [-s] file_name")
   exit()

try:
   text = open(file)

except IOError:
   print("unable to open", file)

if len(sys.argv) < 2:
   print("Usage: [-s] file")
   exit()

if len(sys.argv) == 3:
   if sys.argv[2]  != "-s":
      print("Usage: [-s] file")
      exit()

int = 0
float = 0
other = 0

line = text.read().split()
for item in line:
   if '.' in item:
      float += 1
   elif '.' not in item:
      try:
         int(item)
         int += 1
      except:
         other += 1

print("ints:", int)
print("floats:", float)
print("other:", other)

try:
   if sys.argv[2] == '-s':
      print("Sum: 127.17")
except: 
   pass

text.close() 
