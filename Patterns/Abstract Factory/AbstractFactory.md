Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern 
except the fact that its more like factory of factories.

If you are familiar with factory design pattern in java, you will notice that we have a single Factory class. This factory class 
returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class 
that will return the sub-class based on the input factory class. 

##When to use Abstract Factory and Factory method design pattern in Java
Factory method design pattern are modern way of creating objects. It offers some notable advantages over new() operator to create Objects e.g. By using Factory method design pattern client is completely decoupled with object creation code, which enforces Encapsulation and result is loosely coupled and highly cohesive system. Any change e.g. a new product from Factory requires almost no change in existing clients. On the other hand if you need an additional level of abstraction over your Factory pattern than Abstract Factory is the right design pattern to use. Abstract Factory allows you to use different Factory implementation for different purpose. Abstract Factory pattern can be implemented using Factory method and Singleton design pattern in Java.

In short Abstract Factory design pattern provides abstraction over Factory pattern itself while Factory design pattern provides abstraction over products.
