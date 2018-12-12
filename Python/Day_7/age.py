'''
Create a user defined exception class
#Read input from user and if age is less than print exception that not eleigible
#if age is greater than 21 print eligible
#implement the above if condition in try catch
'''
import sys
class Invalid(Exception):
   """You Entered an Invalid age:"""


if __name__=='__main__':
 age=input("Enter the Age :")
 try:
  if int(age)<20:
    raise Invalid
  else:
    print("Eligible")
 except Invalid:
    print("Not Elgible")
   																																																						
