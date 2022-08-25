"""
output 'Bing Chilling'
until the key "d" is pressed
"""

import tkinter as tk

def main():
    root = tk.Tk()
    root.title('Bing Chilling')
    root.wm_attributes("-topmost", 1)
    root.geometry('300x200')
    root.bind('<KeyPress-d>', lambda e: root.destroy())
    #add text that says 'Bing Chilling'
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    tk.Label(root, text='Bing Chilling').pack()
    root.mainloop()

if __name__ == '__main__':
    main()