package POM_TestCase;

/*How we can write our script in effective way, how we can store object in effective way
  for example, we have one object and i use that object in 100 test cases, and i want to 
  make some changes in that object, so its hard to change the value of that object in
  all the 100 test cases.so i will use that type of mechanism, in which, when i make some
  changes in that object in particular location, that object changing value reflect on all
  100 test cases. for achieve this task, i have to use page object pattern(POM).
 * There are some advantages:
  Easy to Maintain. 
  Easy readability of scripts.
  Reduce or eliminate duplicacy.
  Re-usability of code.
  Reliability.
 * For example i open the rediff.com
  for Home page, i will define all the object that belongs to this home page in particular
  java class. 
  for Login page, i will define all the object that belongs to this Login page in particular
  java class.
 * for example we have one website and i want to automate it and website have 3-4 common 
   webpage which we need to navigate to reach the further test cases. for that webpages,
   i will define all the objects belonging to particular page in separate class and placed
   in one package and i will create a one more package, in that package i will create 
   some classes where i will write some test case. in that test cases, i will call the 
   objects of particular page which one we want.
 * In single test case class, we can call the objects from particular class or call all object
   repository classes. 
 * if we want to call the object from particular class in test case class, then first of 
   all i have to create the object of that particular class in test case.
 * Page factory annotation FindBy()-- one more way to write objects in a page object type, that
   is known as page object factory, this is more simplified by using FindBy() annotation.
   In this class i will use @FindBy annotation for finding the elements from webpage.
  in this annotation we don't need to write driver.findelement(By.) this whole thing is 
  taken by @FindBy annotation and i need to write one step in constructor like
  PageFactory.initElements(driver,this);
     
 */

public class POM_Theory {

}
