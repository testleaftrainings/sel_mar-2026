3:00 to 3:45 ---> Basic Locators
3.45 to 4.05 --->BreakOut
4:05 to 4:15 ---> Break
4:15 to 5:00 ---> Dropdown
5:00 to 5:25 ---> BreakOut
5:25 to 6:00 ---> AbsoluteXpath
6:00 to 6:30 ---> BasicXpath

BasicLocators:
1)ID--most prefereed locator
     when it cannot be used is that when id contains alpha numeric characters.
2)NAME
3)CLASSNAME
4)LINK/PARTIALLINKTEXT
5)TAGNAME
3:00 to 3:30 ---> DropDown
3.30 to 3.50 --->BreakOut
3:50 to 4:00 ---> Break
4:00 to 4:30 ---> AbsoluteXpath
4:30 to 5:00 ---> Basic Xpath
5:00 to 5:10 ---> Break
5:10 to 5:45 ---> AdvancedXpath
5:45 to 6:00 ---> Recap

Dropdown:
What is a Dropdown?

A dropdown in web development is a user interface element that allows users to select one option from a list of options.
In HTML, this is structured with a <select> tag as the parent element and <option> elements as children.
Selenium must be able to interact with these elements to test web applications thoroughly.
How to Handle Dropdown?

Selenium provides a Select class specifically for interacting with dropdown elements.
The Select class offers methods to select options within a dropdown easily.

When to Use?
The Select class should be used when an element in the DOM is identified with a <select> tag, indicating a dropdown menu.
<select> Structure in DOM

The <select> tag in the DOM represents the dropdown element,
and the nested <option> tags represent the individual choices available to the user.

How to Use Select Class?
To use the Select class, a Selenium script must first identify the <select> element in the DOM.
Then, an instance of the Select class is created by passing the located WebElement as an argument to its constructor.
This allows the script to manipulate the dropdown as needed.
Helper Methods

The Select class provides various methods to select options from a dropdown, such as:
selectByIndex(index): Selects an option by its index in the dropdown, starting with 0.
selectByVisibleText("text"): Selects an option by the text visible to the user in the dropdown.
selectByValue("value"): Selects an option by the value of attribute.