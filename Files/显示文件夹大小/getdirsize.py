'''
input a directory path, list the size of each subdirectory;
for python2.7;
'''

from tkFileDialog import *
import os
import glob
import sys

def getdirsize(dirname):
    '''give the directory name, return the size of it.'''
    size = 0
    for (curdir, subdirs, files) in os.walk(dirname):
        for file in files:
            file = os.path.join(curdir, file)
            try:
                size += os.path.getsize(file)
            except:
                pass
    size = humanread(size)      #change to human readable
    return size

def humanread(size):
    unit = 'BKMG'
    cnt = 0
    while True:
        temp = size / 1024
        if temp != 0:
            size = temp
            cnt += 1
        else: break
    size = str(size) + unit[cnt]
    return size

def listdirsize(dirname):
    '''give the directory name, return the list of each subdirectory in the form
        of (name, size).  '''
    dirlist = [ item for item in glob.glob(dirname + '\*') if os.path.isdir(item)]
    result = [ (subdir, getdirsize(subdir)) for subdir in dirlist]
    return result


if __name__ == '__main__':
    dirname = askdirectory()
    result = listdirsize(dirname)
    for item in result:
        print item
   
        


        
