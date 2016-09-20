
## Strategy design pattern
There are common situations when classes differ only in their behavior. For this cases is a good idea to isolate the algorithms in separate classes in order to have the ability to select different algorithms at runtime. 

Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

The strategy pattern is a behavioral object design pattern. In the strategy pattern, different algorithms are represented as Concrete Strategy classes, and they share a common Strategy interface. A Context object contains a reference to a Strategy. By changing the Context's Strategy, different behaviors can be obtained. Although these behaviors are different, the different strategies all operate on data from the Context. 

The strategy pattern is one way that composition can be used as an alternative to subclassing. Rather than providing different behaviors via subclasses overriding methods in superclasses, the strategy pattern allows different behaviors to be placed in Concrete Strategy classes which share the common Strategy interface. A Context class is composed of a reference to a Strategy.

### Where Would I Use This Pattern?
The Strategy pattern is to be used where you want to choose the algorithm to use at runtime. A good use of the Strategy pattern would be saving files in different formats, running various sorting algorithms, or file compression. Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as an object, and make them interchangeable.  
