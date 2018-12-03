'''
Take a command line argument and pass it to a function  and through that function go to another .py file  and open a CSV file from that .py file and read desired data from that particular .csv file and store it in a new .csv file

'''
import mod
import sys
def main(argument):

       switcher = { 
        "vamsi": mod.file_copying(), 
    } 
  

if __name__=="__main__":
    argument=str(sys.argv[1])
    main(str(argument))

