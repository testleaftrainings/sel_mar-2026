3:00 to 4:00 --->SEQ & Parallel execution
4:00 to 4:20 --->BreakOut
4:20 to 5:15 --->POM_Cucumber
5:15 to 5:30 --->Break
5:30 to 6:15 --->POM-ThreadLocal
6:15 to 6:30 --->ScreenShot


POM with Cucumber:
For TestNG _POM : - with driver as static -> sequential execution is possible - To have sequential and parallel execution declare Parameterized Constructor in each pages
For Cucumber_POM: - Constructor should not be defined - With driver as static -> sequential execution is possible

private-accessed only with in the class
static-belong to class and not to any instance and it ensures on copy for each of the class.
final-once the ocject is initialized,it cannot change it.

Java class which is used to access each thread independently private static final ThreadLocal chDriver = new ThreadLocal();
private: - This variable can be accessed only within the class static+final - constant -> cannot change the value.