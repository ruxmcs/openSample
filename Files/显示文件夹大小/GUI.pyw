import os
from Tkinter import *
import tkFileDialog
from getdirsize import listdirsize

class GUI:
    def __init__(self):
        self.path = ''
        self.content = []
        
        self.make_gui()
        
    def make_gui(self):
        self.root = Tk()
        self.root.title('Directory size')
        #control the size and position of window
        screen_w, screen_h = self.root.maxsize()
        win_w, win_h = 500, 600
        self.root.geometry('%dx%d+%d+%d' % (win_w, win_h, (screen_w - win_w)/2,
                                            (screen_h - win_h)/2))
        self.frame = Frame(self.root)
        self.frame.pack(side = TOP)
        label = Label(self.frame, text = 'Directory:')
        label.pack(side = LEFT, expand = YES, fill = X)
        self.e = StringVar()
        self.e.set('input the directory name')
        entry = Entry(self.frame, textvariable = self.e, width = 50)
        entry.pack(side = LEFT, expand = YES, fill = X)
        self.frame = Frame(self.root)
        self.frame.pack(side = TOP)
        brower_b = Button(self.frame, text = 'brower',
                    command = self.choose_path)
        brower_b.pack(side = LEFT, expand = YES, fill = X)
        ok_b = Button(self.frame, text = 'ok', command = self.show)
        ok_b.pack()
        self.lb = Listbox(self.root)
        self.lb.pack(side = LEFT,expand = YES, fill = BOTH)
        self.sbar = Scrollbar(self.root)
        self.sbar.pack(side = RIGHT, fill = Y)
        self.sbar.config(command = self.lb.yview)
        self.lb.config(yscrollcommand = self.sbar.set)
        mainloop()

    def show(self):
        self.lb.delete(0, END)
        self.content = listdirsize(self.path)
        for item in self.content:
            try:
                item = str(os.path.basename(item[0])).ljust(30) + item[1]
                self.lb.insert(END, item)
            except:
                pass
        

    def choose_path(self):
        self.path = tkFileDialog.askdirectory()
        self.e.set(self.path)
        

if __name__ == '__main__':
    GUI()
    
