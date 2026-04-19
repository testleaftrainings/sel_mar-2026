2:40 to 3:40 ---> Collections-List
3:40 to 4:05 ---> Breakout
4:05 to 4:50 ---> Set
4:50 to 5:00 ---> Break
5:00 to 5:45 ---> WindowHandling
5:45 to 6:30 ---> Alerts

Properties of List:
1)list is an ordered collection(fifo)
2)List allows the duplicate values
Properties of set:
1)is an unordered collection because the order of the elemnet depends on the implementation classes.
2)It does not allow the duplicates.
3)get() cannot be used here
int num[]={1,2,3,2,4}
using list retrieve the values which is at index 3--->2
using set={1,2,3,4}--retrieves the values based on index at 3--->4
Types of implementation classes:
1)HashSet--->random order
2)LinkedHashSet--->based on insertion of the items
3)TreeSet--->based on ascii order

Window Handling:
What is a Window Handle?
A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.
Why Window Handles are Important
Web applications can open multiple windows or tabs.
To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

How to Handle Windows
To handle windows, WebDriver provides two methods:
getWindowHandle(): Retrieves the ID of the current window.
getWindowHandles(): Retrieves a set of all open windows' IDs.
To switch to a different window, the syntax is driver.switchTo().window(windowHandle); where windowHandle is the unique identifier of the target window.

Handling Multiple Windows
Retrieve the set of window handles using driver.getWindowHandles().
Convert the set to a list to handle windows in a sequential manner.
Use the driver.switchTo().window(windowHandle) to switch control to the desired window.

After operations are completed, windows can be closed using driver.close(), and control can be switched back to the main window.
NoSuchWindowException:
NoSuchWindowException is an exception which signifies that the action you are trying to perform cannot be completed because the window or tab you are referencing no longer exists or is inaccessible. 
