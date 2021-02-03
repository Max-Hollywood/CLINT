# Command Line Interface aNd Text

```
Clints_State :> does nothing (yet)
                sometimes goes to work (some features implemented)
                ready for the day (works but could work better)
                the boss (kills it)
```

Clint is a basic text editor that relies on commands and string input.

The main functionality of this editor is to pull the user out of editing a file directly, and rely on a layered approach to modifying a file.

Add, Remove, Replace are the main functions for lines and line content.

The program saves the file after each successful change.  Backup files, undo, and change history are being implemented as well.

**Max Damage**

## Example Usage

> File as displayed by Clint:
>
> ```
> D:\workspaces\clint\demofile.txt
> --------------------------------------
>  01 |  First line in file
>  02 |  Second line...
>  03 |  Third line
> ```
> 
> Add a line of text to a file:
>
> Press `a`, enter the line position to insert, enter input, press `Enter`.
>
> ```
> add |  2 Fourth Line!
> ```
>
> Result:
>
> ```
> D:\workspaces\clint\demofile.txt
> --------------------------------------
> 01 |  First line in file
> 02 +  Fourth line!
> 03 |  Second line...
> 04 |  Third line
> ```
> 
> Change the file path by pressing `f`:
> ```
> D:\workspaces\trash\deleteme
> ```
> 

For the purposes of writing this readme, I have implied that the 'add' function performs an 'insert' instead of an 'append'.  Until further design is done, this functionality may be permanent.

## Features

The command keys are designed to be as obvious as they can be.

Hit the command key, followed by numbers, followed by letters, is basically how it works.  The program will figure out the difference between each one.

Hit `Escape` to cancel out of everything.

> `+` and `-` keys can be used to modify the input.

- `a` **Add** line (position, text).
    - `a 1 some text` insert (default)
    - `a 1- some text` insert (default)
    - `a 1+ some text` append
    - No position is the same as adding to the end of the file.
    - No text adds an empty line.
- `d` **Delete** line (position, keep or remove the now empty line).
    - `d 33 y`
    - No position deletes the last line.
- `r` **Replace** line (position, text).
    - `r 120 change comment here`
    - No position replaces the last line.
    - No text deletes the text from the line.
- `i` **Insert** text into line (position, text).
    - `i 14 's isn't right`
    - No position appends to the line.
    - No text cancels.
- `m` **Modify** range of text in a line (start, end, text).
    - `m 10,51 is this the best choice`
    - No positions is the same as Replace.
- `c` **Clear** range of text in a line (start, end).
    - `c 2,4`
    - `c 2+`
    - `c 2-`
    - No positions clears the entire line.
    - A single position with a + clears that position to the end.
    - A single position with a - clears that position to the start.

Change the filename at the top to open a new file or save as.  + or - keys change functionality?

## Changes
- _Update 2021/02/03_
    - Add code to get input and output to console.
    - Add interface for line and text operations.

## Repository

I forgot what I was doing with this, but now I remember.

Branches:

- master: nothing
- c++: a C++ version of the program
- java: a Java version of the program

I've come back after some time and am now working on the Java version.


