## Singleton Design Pattern

- This pattern is used when there is a need to create single instance of a class. It involves only one class which is responsible to instantiate itself, to make sure it creates not more than one instance; in the same time it provides a global point of access to that instance.

The implementation involves a static member in the "Singleton" class, a private constructor and a static public method that returns a reference to the static member. Following is the code snippet to implement a singleton class.

```
Class Singleton{
  private static Singleton instance = null;
  private Singleton(){
  }
  public Singleton getInstance(){
      if(instance == null){
          instance = new Singleton();
      }
      return instance;
  }
}
```

In multi-threaded environment, the above snippet will not return same instance for the threads that access it. To ensure same instance is returned, `synchronized` is used. 

```
class Singleton
{
	private static Singleton instance;
	private Singleton()
	{
	
	}

	public static synchronized Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
}
```
You can notice in the above code that getInstance method ensures that only one instance of the class is created. The constructor should not be accessible from the outside of the class to ensure the only way of instantiating the class would be only through the getInstance method. 

The standard implementation shown in the above code is a thread safe implementation, but it's not the best thread-safe implementation beacuse synchronization is very expensive when we are talking about the performance. We can see that the synchronized method getInstance does not need to be checked for syncronization after the object is initialized. If we see that the singleton object is already created we just have to return it without using any syncronized block. This optimization consist in checking in an unsynchronized block if the object is null and if not to check again and create it in an syncronized block. This is called double locking mechanism.

```
//Lazy instantiation using double locking mechanism.
class Singleton
{
	private static Singleton instance;

	private Singleton()
	{

	}

	public static Singleton getInstance()
	{
		if (instance == null)
		{
			synchronized(Singleton.class)
			{
				if (instance == null)
				{
					System.out.println("getInstance(): First time getInstance was invoked!");
					instance = new Singleton();
				}
			}            
		}

		return instance;
	}
}
```
