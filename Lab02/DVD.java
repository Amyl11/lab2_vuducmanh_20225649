public class DVD {
    private static int counter = 0;
    private String title;
    private String category;
    private int length;
    private float cost;
    private int id;
    private String director;

    
    public DVD(String title) {
        super();
        this.title = title;
        this.id = counter++;
    }

    public DVD(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = counter++;
    }

    public DVD(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = counter++;
        this.director = director;
    }

    public DVD(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
        this.id = counter++;
        this.director = director;
    }


    public String getTitle() { 
        return title; 
    }
    public String getCategory() { 
        return category; 
    }
    public String getDirector() { 
        return director; 
    }
    public int getLength() { 
        return length; 
    }
    public float getCost() { 
        return cost; 
    }
    public int getId() { 
        return id; 
    }


    public void setTitle(String titleSet){ 
        title = titleSet; 
    }
    public void setCategory(String categorySet){ 
        category = categorySet; 
    }
    public void setLength(int lengthSet){ 
        length = lengthSet; 
    }
    public void setCost(float costSet){ 
        cost = costSet; 
    }
    public void setDirector(String directorSet){ 
        director = directorSet; 
    }
}