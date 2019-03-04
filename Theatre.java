

public class Theatre{

    String title;
    int rating;
    
    Theatre(String aTitle, int aRating){this.title = aTitle; this.rating = aRating;}
    Theatre(Theatre toCopy){title= toCopy.title; rating = toCopy.rating;}
    
    public String getTitle(){
        return title;
        }
        
    public String getCategory(){
        return "hi";
        }
        
    public int getRating(){
        return rating;
        }
        
    public void setRating(int aRating){
        rating = aRating;
        }
        
    public void setTitle(String atitle){
        title = atitle;
        }
    }

