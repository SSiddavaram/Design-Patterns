Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern 
except the fact that its more like factory of factories.

If you are familiar with factory design pattern in java, you will notice that we have a single Factory class. This factory class 
returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class 
that will return the sub-class based on the input factory class. 
