public class Country
{
  // add private instance variables for the name, capital, language, and image file.
    private String name;
    private String capital;
    private String language;
    private String imageFile;

   
    public Country (){
    this.name = "";
    this.capital = "";
    this.language = "";
    this.imageFile = "";
  }
  // add constructors
  public Country (String countryName, String countryCapital, String countryLanguage, String countryImageFile){
    this.name = countryName;
    this.capital = countryCapital;
    this.language = countryLanguage;
    this.imageFile = countryImageFile;
  }

   


  // Write accessor/get methods for each instance variable that returns it.
public String getName()
{
  return name;
}

public String getCapital()
{
  return capital;
}

public String getLanguage()
{
  return language;
}

public String getImageFile()
{
  return imageFile;
}

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 public String toString(){
  return name + "'s capital is " + capital + "," + " and its primary language is " + language;
 }


  
}