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
