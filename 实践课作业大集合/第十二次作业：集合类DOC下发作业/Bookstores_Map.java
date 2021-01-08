class Bookstores_Map {
    private String code;
    private String name;
    private double price;
    private String publisher;

    public Bookstores_Map(){
    }

    public Bookstores_Map(String code,String name,double price,String publisher)	{
        this.code=code;
        this.name=name;
        this.price=price;
        this.publisher=publisher;
    }

    public String getCode()
    {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher()
    {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
