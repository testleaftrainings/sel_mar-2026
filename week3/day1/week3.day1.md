2:45 to 3:20 ---> AbsoluteXpath
3.20 to 4.00 --->Basic Xpath
4:00 to 4:20 ---> Breakout
4:20 to 4:30 ---> Break
4:30 to 5:30 ---> AdvancedXpath
5:30 to 6:00 ---> Arrays
5:10 to 5:45 ---> AdvancedXpath
5:45 to 6:00 ---> Recap

Relative Xpath:
 -it locates the web element directly
 1)Basic xPath
 2)Advanced Xpath
 Basic Xpath:
 1)Attribute Xpath:
 syn://tagName[@attribute='attribute value']
 eg)//input[@id='username']
 2)TextBasedXpath:
 syn://tagName[text()='textvalue']
 eg)//a[text()='Leads']
 3)PartialAttribute based xPath:
 syn://tagName[contains(@attribute,'attribute value')]
 eg)(//div[contains(@id,'ext-gen')])[5]
 4)Partial textbasedxpath:
 syn://tagName[contains(text(),'text value')]
 5)Collection based xpath:
 eg)(//input[@class='inputLogin'])[2]

 Advanced xpath:
 1)parent to child:
 syn:basic xpath for the parent/child tagName
 eg)//p[@class='top']/input
 2)child to parent:
 syn:basic xpath for the child/parent::tagname of the parent
 eg)(//input[@class='inputLogin']/parent::p)[2]
 3)GrandParent to Grandchild:
 syn:basic xpath for grandparent//grandchild tagname
 (//form[@id='login']//input)[1]
 4)GrandChild to GrandParent:
 syn:basic xpath for the grandchild/ancestor::tagname of the grandparent
 eg)//input[@id='password']/ancestor::form
 //a[text()='Leads']/ancestor::ul
 5)elder sibling to younger sibling:
 syn:basic xpath of elder sibling/following-sibling::younger sibling tagname
 //label[text()='Username']/following-sibling::input
 6)younger to elder sibling:
 syn:basic xpath of younger sibling/preceding-sibling::Elder sibling tagname
 eg)//input[@type='password']/preceding-sibling::label
 7)Elder to younger cousin:
 syn:basic xpath of elder cousin/following:: younger cousin tagname
 eg)(//span[text()='Company Name']/following::input)[1]
 8)younger to Elder cousin:
 syn: syn:basic xpath of younger cousin/preceding:: Elder cousin tagname
 eg)(//input[@id='createLeadForm_companyName']/preceding::span)[7]




