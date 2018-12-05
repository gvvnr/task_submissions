import sys
class Invalid(Exception):
   """You Entered an Invalid age:"""


if __name__=='__main__':
 age=input()
 try:
  if int(age)<20:
    raise Invalid
  else:
    print("Eligible")
 except:
    print(sys.exc_info()[0])
   																																																						
